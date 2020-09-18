package by.moiseenko.customers_info.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "sql_version")
public class SQLVersion {

  private static final Logger LOG = LogManager.getLogger(SQLVersion.class.getName());
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String sqlVersion;

}
