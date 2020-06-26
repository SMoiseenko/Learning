package by.moiseenko.utils.sax.impl;

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
    double goodElevation = -10028.0d;
    for (int i = 0; i < geoTags.size(); i++) {
      if (geoTags.get(i).getEle() < min || geoTags.get(i).getEle() > max) {
        if (goodElevation == -10028.0d) {
          int k = i;
          while ((geoTags.get(k).getEle() < min || geoTags.get(k).getEle() > max) && k < geoTags
              .size()) {
            k++;
          }
          goodElevation = (k < geoTags.size()) ? geoTags.get(k).getEle() : 0.0d;
          }
        geoTags.get(i).setEle(goodElevation);
      } else {
        goodElevation = -10028.0d;
      }
    }

  }
  public void interpolateDeviations(int different){

  }

}
