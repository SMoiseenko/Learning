package by.moiseenko.TempCustomerInfo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
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
@Table(name = "all_info")
@ToString
@NoArgsConstructor
@Slf4j
public class MyEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String movexCode;
  private String shortName;
  private String fullName;
  private String rusName;
  private String t4cVersion;
  private String windowsVersion;
  private String sqlVersion;
  private String tvId;
  private String tvPwd;
  private String winLogin;
  private String winPwd;
  private String t4cLicenseType;
  private int robotsQty;
  private boolean serviceContract;
  private boolean inetAccess;
  @Lob
  private String comment;

}
