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

public class CustomerDataLelyFromJson extends RowLelyFromJson {

  private String sfdfarmlicense;
  private String sfdcurrentversion;
  private int sfdnrrobots;
  private String sfdfarmname;
  private String sfdregion;
  @JsonProperty("RobotAvg")
  private double robotAvg;
  @JsonProperty("RobotSum")
  private int robotSum;
  @JsonProperty("LicenseType")
  private String licenseType;
  @JsonProperty("WindowsOS")
  private String windowsOS;
  @JsonProperty("SqlDB")
  private String sqlDB;
  @JsonProperty("DownloadSpeed")
  private double downloadSpeed;
  @JsonProperty("UploadSpeed")
  private double uploadSpeed;
  @JsonProperty("NrOfCosmix")
  private int nrOfCosmix;
  @JsonProperty("NrOfGrazeway")
  private Object nrOfGrazeway;
  @JsonProperty("HaveVector")
  private boolean haveVector;
  @JsonProperty("HaveQwesLD")
  private boolean haveQwesLD;
  @JsonProperty("HaveQwesISOLD")
  private boolean haveQwesISOLD;
  @JsonProperty("HaveQwesISOLDReceiver")
  private boolean haveQwesISOLDReceiver;
  @JsonProperty("HaveQwesLDN")
  private boolean haveQwesLDN;
  @JsonProperty("UseInherd")
  private boolean useInherd;
  @JsonProperty("SqlDatabaseSizeInMB")
  private double sqlDatabaseSizeInMB;

}
