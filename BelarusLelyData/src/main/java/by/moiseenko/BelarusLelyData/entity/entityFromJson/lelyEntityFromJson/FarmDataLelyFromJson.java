package by.moiseenko.BelarusLelyData.entity.entityFromJson.lelyEntityFromJson;

import by.moiseenko.BelarusLelyData.entity.entityFromJson.RowLelyFromJson;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FarmDataLelyFromJson extends RowLelyFromJson {

  private String sfdfarmlicense;
  private int sfdid;
  private String sfdfarmname;
  private String hhicreateddate;
  @JsonProperty("TotalMilkProduction")
  private double totalMilkProduction;
  @JsonProperty("MilkProductionCowDay")
  private double milkProductionCowDay;
  @JsonProperty("NumberOfRefusals")
  private double numberOfRefusals;
  @JsonProperty("NumberOfFailures")
  private double numberOfFailures;
  @JsonProperty("NumberOfVisit")
  private double numberOfVisit;
  @JsonProperty("NumberMilkingsCowDay")
  private double numberMilkingsCowDay;
  @JsonProperty("Milkspeed")
  private double milkspeed;
  @JsonProperty("NumberOfConnectionAttempts")
  private double numberOfConnectionAttempts;
  @JsonProperty("AmountOfMilkSeparated")
  private double amountOfMilkSeparated;
  @JsonProperty("NumberOfCowsMilkSeparation")
  private double numberOfCowsMilkSeparation;
  @JsonProperty("KgConcentratesFed")
  private double kgConcentratesFed;
  @JsonProperty("KgRestFeedConcentrates")
  private double kgRestFeedConcentrates;
  @JsonProperty("KgConcentratesper100KgMilk")
  private double kgConcentratesper100KgMilk;
  @JsonProperty("KgConcentrates")
  private double kgConcentrates;
  @JsonProperty("KgConcentratesLactationdays")
  private double kgConcentratesLactationdays;
  @JsonProperty("AverageBoxtimeVisit")
  private String averageBoxtimeVisit;
  @JsonProperty("RuminationActivity")
  private double ruminationActivity;
  @JsonProperty("AverageFatIndication")
  private double averageFatIndication;
  @JsonProperty("AverageProteinIndication")
  private double averageProteinIndication;
  @JsonProperty("AverageFatProteinRatio")
  private double averageFatProteinRatio;
  @JsonProperty("RestFeedConc")
  private double restFeedConc;
  @JsonProperty("Freemilktime")
  private double freemilktime;
  @JsonProperty("Treatmenttime")
  private String treatmenttime;
}
