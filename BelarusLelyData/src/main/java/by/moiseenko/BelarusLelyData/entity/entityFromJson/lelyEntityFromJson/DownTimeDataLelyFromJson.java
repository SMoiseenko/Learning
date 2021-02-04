package by.moiseenko.BelarusLelyData.entity.entityFromJson.lelyEntityFromJson;

import by.moiseenko.BelarusLelyData.entity.entityFromJson.RowLelyFromJson;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class DownTimeDataLelyFromJson extends RowLelyFromJson {

  private String sfdfarmlicense;
  @JsonProperty("Reason")
  private String reason;
  @JsonProperty("Failure")
  private String failure;
  @JsonProperty("BenDevName")
  private String benDevName;
  @JsonProperty("DwtDuration")
  private int dwtDuration;
  @JsonProperty("DwtCreationTime")
  private String dwtCreationTime;

}
