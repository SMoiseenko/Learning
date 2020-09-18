package by.moiseenko.customers_info.entity;

import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.GeneratorType;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class Customer {

  private static final Logger LOG = LogManager.getLogger(Customer.class.getName());

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String shortName;
  private String fullName;
  private String movexCode;
  @OneToOne(cascade={CascadeType.ALL})
  @JoinColumn(name = "t4cserver_id")
  private T4CServer t4CServer;

}
