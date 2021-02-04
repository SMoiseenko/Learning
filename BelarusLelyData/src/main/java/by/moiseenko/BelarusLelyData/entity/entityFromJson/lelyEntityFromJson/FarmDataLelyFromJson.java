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
public class FarmDataLelyFromJson extends RowLelyFromJson {

  private final String sfdfarmlicense;
  private final int sfdid;
  private final String sfdfarmname;
  private final String hhicreateddate;
  private final double totalMilkProduction;
  private final double milkProductionCowDay;
  private final double numberOfRefusals;
  private final double numberOfFailures;
  private final double numberOfVisit;
  private final double numberMilkingsCowDay;
  private final double milkspeed;
  private final double numberOfConnectionAttempts;
  private final double amountOfMilkSeparated;
  private final double numberOfCowsMilkSeparation;
  private final double kgConcentratesFed;
  private final double kgRestFeedConcentrates;
  private final double kgConcentratesper100KgMilk;
  private final double kgConcentrates;
  private final double kgConcentratesLactationdays;
  private final String averageBoxtimeVisit;
  private final double ruminationActivity;
  private final double averageFatIndication;
  private final double averageProteinIndication;
  private final double averageFatProteinRatio;
  private final double restFeedConc;
  private final double freemilktime;
  private final String treatmenttime;
}
