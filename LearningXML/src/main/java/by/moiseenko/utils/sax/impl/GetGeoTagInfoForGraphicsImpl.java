package by.moiseenko.utils.sax.impl;

import by.moiseenko.entity.RunGeoTag;
import by.moiseenko.utils.sax.GetGeoTagInfoForGraphics;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Component
public class GetGeoTagInfoForGraphicsImpl implements GetGeoTagInfoForGraphics {

  private static final Logger LOG = LogManager
      .getLogger(GetGeoTagInfoForGraphicsImpl.class.getName());

  private final SAXGeoTagParser parser;
  private final InterpolateWrongValues interpolator;
  private List<RunGeoTag> runGeoTagList;

  @Autowired
  public GetGeoTagInfoForGraphicsImpl(@Qualifier("SAXGeoTagParser") SAXGeoTagParser parser, InterpolateWrongValues interpolator) {
    this.parser = parser;
    this.interpolator = interpolator;
  }

  @Override
  public void init(String path) throws IOException, SAXException, ParserConfigurationException {
  parser.parseXML(path);
  runGeoTagList = parser.getGeoTagHandler().getGeoTags();
  }

  @Override
  public String getCoordinates() {
    return (runGeoTagList==null)?"":runGeoTagList.stream().map(x->"["+x.getLat() + ", "+ x.getLon()+"]").collect(Collectors.joining(",","[","]"));
  }

  @Override
  public String getElevations() {
    interpolator.interpolateElevation(parser.getGeoTagHandler().getGeoTags(), 0.0, 1000.0);
    return (runGeoTagList==null)?"":runGeoTagList.stream().map(RunGeoTag::getEle).map(x->String.format(
        Locale.US,"%.2f",x)).collect(
        Collectors.joining(",","[","]"));
  }

  @Override
  public double getMinElevations() {
    return runGeoTagList.stream().mapToDouble(RunGeoTag::getEle).min().orElse(0.0d);
  }

  @Override
  public double getMaxElevations() {
    return runGeoTagList.stream().mapToDouble(RunGeoTag::getEle).max().orElse(0.0d);
  }

  @Override
  public String getHeartRates() {
    return
        runGeoTagList.stream().map(RunGeoTag::gethR).map(Objects::toString).collect(Collectors.joining(",","[","]"));
  }
}
