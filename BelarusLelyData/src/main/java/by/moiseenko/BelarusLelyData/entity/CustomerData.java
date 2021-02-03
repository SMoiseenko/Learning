package by.moiseenko.BelarusLelyData.entity;

import by.moiseenko.BelarusLelyData.utils.CustomerDataJSONParser;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize(using = CustomerDataJSONParser.class)
public class CustomerData {
  private Long id;
  private String movexCode;
  private LSO lso;
  private String engName;
  private LicenseType licenseType;
  private String t4CVersion;

}
