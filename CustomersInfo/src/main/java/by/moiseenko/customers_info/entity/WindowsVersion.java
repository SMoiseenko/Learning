package by.moiseenko.customers_info.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames=true)
@Table(name = "windows_version")
public class WindowsVersion {

  private static final Logger LOG = LogManager.getLogger(WindowsVersion.class.getName());
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate endSupportDate;


}
