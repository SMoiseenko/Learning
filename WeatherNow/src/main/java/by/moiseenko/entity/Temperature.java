package by.moiseenko.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {
  @JsonProperty("Value")
  private BigDecimal minimum;

  @JsonProperty("Unit")
  private String value;

  public Temperature() {}

  public BigDecimal getMinimum() {
    return minimum;
  }

  public void setMinimum(BigDecimal minimum) {
    this.minimum = minimum;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Temperature{" + "minimum=" + minimum + ", value='" + value + '\'' + '}';
  }
}
