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

public class AstronautDataLelyFromJson extends RowLelyFromJson {

  private String sfdfarmname;
  @JsonProperty("BenSerialNumber")
  private String benSerialNumber;
  @JsonProperty("BenDate")
  private String benDate;
  @JsonProperty("RobotSW")
  private String robotSW;
  @JsonProperty("BenRedreflectionLR")
  private int benRedreflectionLR;
  @JsonProperty("BenRedreflectionRR")
  private int benRedreflectionRR;
  @JsonProperty("BenRedreflectionRF")
  private int benRedreflectionRF;
  @JsonProperty("BenRedreflectionLF")
  private int benRedreflectionLF;
  @JsonProperty("BenGreenreflectionLR")
  private int benGreenreflectionLR;
  @JsonProperty("BenGreenreflectionRR")
  private int benGreenreflectionRR;
  @JsonProperty("BenGreenreflectionRF")
  private int benGreenreflectionRF;
  @JsonProperty("BenGreenreflectionLF")
  private int benGreenreflectionLF;
  @JsonProperty("BenBluereflectionLR")
  private int benBluereflectionLR;
  @JsonProperty("BenBluereflectionRR")
  private int benBluereflectionRR;
  @JsonProperty("BenBluereflectionRF")
  private int benBluereflectionRF;
  @JsonProperty("BenBluereflectionLF")
  private int benBluereflectionLF;
  @JsonProperty("BenConductivityLR")
  private int benConductivityLR;
  @JsonProperty("BenConductivityRR")
  private int benConductivityRR;
  @JsonProperty("BenConductivityRF")
  private int benConductivityRF;
  @JsonProperty("BenConductivityLF")
  private int benConductivityLF;
  @JsonProperty("BenCellcountLR")
  private int benCellcountLR;
  @JsonProperty("BenCellcountRR")
  private int benCellcountRR;
  @JsonProperty("BenCellcountRF")
  private int benCellcountRF;
  @JsonProperty("BenCellcountLF")
  private int benCellcountLF;
  @JsonProperty("BenMilktimeLR")
  private int benMilktimeLR;
  @JsonProperty("BenMilktimeRR")
  private int benMilktimeRR;
  @JsonProperty("BenMilktimeRF")
  private int benMilktimeRF;
  @JsonProperty("BenMilktimeLF")
  private int benMilktimeLF;
  @JsonProperty("BenDeadmilktimeLR")
  private int benDeadmilktimeLR;
  @JsonProperty("BenDeadmilktimeRR")
  private int benDeadmilktimeRR;
  @JsonProperty("BenDeadmilktimeRF")
  private int benDeadmilktimeRF;
  @JsonProperty("BenDeadmilktimeLF")
  private int benDeadmilktimeLF;
  @JsonProperty("BenAttachmenttimeLR")
  private double benAttachmenttimeLR;
  @JsonProperty("BenAttachmenttimeRR")
  private double benAttachmenttimeRR;
  @JsonProperty("BenAttachmenttimeRF")
  private double benAttachmenttimeRF;
  @JsonProperty("BenAttachmenttimeLF")
  private double benAttachmenttimeLF;
  @JsonProperty("BenSCCNrofsamplesLR")
  private int benSCCNrofsamplesLR;
  @JsonProperty("BenSCCNrofsamplesRR")
  private int benSCCNrofsamplesRR;
  @JsonProperty("BenSCCNrofsamplesRF")
  private int benSCCNrofsamplesRF;
  @JsonProperty("BenSCCNrofsamplesLF")
  private int benSCCNrofsamplesLF;
  @JsonProperty("BenMaxMilkflow")
  private double benMaxMilkflow;
  @JsonProperty("BenMilkflow")
  private double benMilkflow;
  @JsonProperty("BenAstMilkoMeterUpdateTime")
  private String benAstMilkoMeterUpdateTime;
  @JsonProperty("BenAstMilkoMeter")
  private int benAstMilkoMeter;
  @JsonProperty("BenTotalMilkYield")
  private double benTotalMilkYield;
  @JsonProperty("BenFailuresDevice")
  private int benFailuresDevice;
  @JsonProperty("BenFailedCowsDevice")
  private int benFailedCowsDevice;
  @JsonProperty("BenMilkingsDevice")
  private int benMilkingsDevice;
  @JsonProperty("BenNrOfAnimals")
  private int benNrOfAnimals;
  @JsonProperty("BenRefusalsDevice")
  private int benRefusalsDevice;
  @JsonProperty("BenMilkingsHerd")
  private Object benMilkingsHerd;
  @JsonProperty("BenNrOfAnimalsHerd")
  private Object benNrOfAnimalsHerd;
  @JsonProperty("BenMilkingNumberId")
  private Object benMilkingNumberId;

}
