package by.moiseenko.BelarusLelyData.entity.entityFromJson;

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
@EqualsAndHashCode
@ToString
@NoArgsConstructor

public abstract class RowLelyFromJson {

  @JsonProperty("LceMovexCode")
  protected String lceMovexCode;// to abstract class
  @JsonProperty("LceName")
  protected String lceName;// to abstract class
  protected String sfdcustomermovexcode;// to abstract class

}
