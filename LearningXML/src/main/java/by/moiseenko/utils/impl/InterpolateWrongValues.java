package by.moiseenko.utils.impl;

import by.moiseenko.entity.RunGeoTag;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Component
public class InterpolateWrongValues {

  private static final Logger LOG = LogManager.getLogger(InterpolateWrongValues.class.getName());

  public void interpolateElevation(List<RunGeoTag> geoTags, double min, double max) {
    for (int i = 0; i < geoTags.size(); i++) {
      if (geoTags.get(i).getEle() < min || geoTags.get(i).getEle() > max) {
        geoTags.get(i).setEle(geoTags.get(i+1).getEle());
      }
    }

  }


}
