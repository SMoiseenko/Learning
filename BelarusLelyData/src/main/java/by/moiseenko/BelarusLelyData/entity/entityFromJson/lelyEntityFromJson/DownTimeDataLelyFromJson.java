package by.moiseenko.BelarusLelyData.entity.entityFromJson.lelyEntityFromJson;

import by.moiseenko.BelarusLelyData.entity.entityFromJson.RowLelyFromJson;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Getter
@SuperBuilder
@ToString(callSuper = true)

public class DownTimeDataLelyFromJson extends RowLelyFromJson {

  private final String sfdfarmlicense;
  private final String reason;
  private final String failure;
  private final String benDevName;
  private final int dwtDuration;
  private final String dwtCreationTime;

}
