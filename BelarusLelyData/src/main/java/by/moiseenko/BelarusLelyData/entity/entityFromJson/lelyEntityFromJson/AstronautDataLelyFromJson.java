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

public class AstronautDataLelyFromJson extends RowLelyFromJson {

  private final String sfdfarmname;
  private final String benSerialNumber;
  private final String benDate;
  private final String robotSW;
  private final int benRedreflectionLR;
  private final int benRedreflectionRR;
  private final int benRedreflectionRF;
  private final int benRedreflectionLF;
  private final int benGreenreflectionLR;
  private final int benGreenreflectionRR;
  private final int benGreenreflectionRF;
  private final int benGreenreflectionLF;
  private final int benBluereflectionLR;
  private final int benBluereflectionRR;
  private final int benBluereflectionRF;
  private final int benBluereflectionLF;
  private final int benConductivityLR;
  private final int benConductivityRR;
  private final int benConductivityRF;
  private final int benConductivityLF;
  private final int benCellcountLR;
  private final int benCellcountRR;
  private final int benCellcountRF;
  private final int benCellcountLF;
  private final int benMilktimeLR;
  private final int benMilktimeRR;
  private final int benMilktimeRF;
  private final int benMilktimeLF;
  private final int benDeadmilktimeLR;
  private final int benDeadmilktimeRR;
  private final int benDeadmilktimeRF;
  private final int benDeadmilktimeLF;
  private final double benAttachmenttimeLR;
  private final double benAttachmenttimeRR;
  private final double benAttachmenttimeRF;
  private final double benAttachmenttimeLF;
  private final int benSCCNrofsamplesLR;
  private final int benSCCNrofsamplesRR;
  private final int benSCCNrofsamplesRF;
  private final int benSCCNrofsamplesLF;
  private final double benMaxMilkflow;
  private final double benMilkflow;
  private final String benAstMilkoMeterUpdateTime;
  private final int benAstMilkoMeter;
  private final double benTotalMilkYield;
  private final int benFailuresDevice;
  private final int benFailedCowsDevice;
  private final int benMilkingsDevice;
  private final int benNrOfAnimals;
  private final int benRefusalsDevice;
  private final Object benMilkingsHerd;
  private final Object benNrOfAnimalsHerd;
  private final Object benMilkingNumberId;
}
