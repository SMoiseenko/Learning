package by.moiseenko.BelarusLelyData.entity.entityFromJson;

import by.moiseenko.BelarusLelyData.utils.customJsonParser.RowLelyParser;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
@ToString
@JsonDeserialize(using = RowLelyParser.class)

public abstract class RowLelyFromJson {

  protected String lceMovexCode;// to abstract class
  protected String lceName;// to abstract class
  protected String sfdcustomermovexcode;// to abstract class

}
