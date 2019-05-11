package by.moiseenko.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import java.util.StringJoiner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class CatLink {

  private static final Logger LOG = LogManager.getLogger(CatLink.class.getName());
  @JsonProperty("file")
  private String file;

  public CatLink(@JsonProperty("file") String file) {
    this.file = file;
  }

  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatLink catLink = (CatLink) o;
    return Objects.equals(file, catLink.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file);
  }

  @Override
  public String toString() {
    return "CatLink{" +
        "file='" + file + '\'' +
        '}';
  }
}
