package by.moiseenko.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public enum Gender {
  @JsonProperty("Male")
  MALE,
  @JsonProperty("Female")
  FEMALE
}
