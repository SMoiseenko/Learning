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
public class CustomerDataLelyFromJson extends RowLelyFromJson {

  private final String sfdfarmlicense;
  private final String sfdcurrentversion;
  private final int sfdnrrobots;
  private final String sfdfarmname;
  private final String sfdregion;
  private final double robotAvg;
  private final int robotSum;
  private final String licenseType;
  private final String windowsOS;
  private final String sqlDB;
  private final double downloadSpeed;
  private final double uploadSpeed;
  private final int nrOfCosmix;
  private final Object nrOfGrazeway;
  private final boolean haveVector;
  private final boolean haveQwesLD;
  private final boolean haveQwesISOLD;
  private final boolean haveQwesISOLDReceiver;
  private final boolean haveQwesLDN;
  private final boolean useInherd;
  private final double sqlDatabaseSizeInMB;
}
