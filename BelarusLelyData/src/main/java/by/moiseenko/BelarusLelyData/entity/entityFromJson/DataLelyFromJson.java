package by.moiseenko.BelarusLelyData.entity.entityFromJson;

import java.util.List;
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
public class DataLelyFromJson {

  private long total;
  private List<RowLelyFromJson> rows;
  private int page;

}
