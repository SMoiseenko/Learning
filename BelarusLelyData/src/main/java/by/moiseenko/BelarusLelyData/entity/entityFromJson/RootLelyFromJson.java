package by.moiseenko.BelarusLelyData.entity.entityFromJson;

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
public class RootLelyFromJson {

  private boolean success;
  private DataLelyFromJson data;

}
