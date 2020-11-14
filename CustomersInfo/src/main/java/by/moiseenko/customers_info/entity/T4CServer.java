package by.moiseenko.customers_info.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name = "t4c_server")
public class T4CServer {
  private static final Logger LOG = LogManager.getLogger(T4CServer.class.getName());

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne(cascade={CascadeType.ALL})
  @JoinColumn(name = "pcinfo_id")
  private PCInfo pcInfo;
  @ManyToOne(cascade={CascadeType.ALL})
  @JoinColumn(name = "windowsversion_id")
  private WindowsVersion windowsVersion;
  @ManyToOne(cascade={CascadeType.ALL})
  @JoinColumn(name = "sqlversion_id")
  private SQLVersion sqlVersion;
  private String t4CVersion;
  private String serialNumber;
  private String tvid;
  private String tvpwd;
  private String winLogin;
  private String winPwd;

}
