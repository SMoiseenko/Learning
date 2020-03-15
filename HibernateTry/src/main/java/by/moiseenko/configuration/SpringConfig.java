package by.moiseenko.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Configuration
@ComponentScan(
    basePackages = {
      "by.moiseenko.utils",
      "by.moiseenko.repository.impl",
      "by.moiseenko.service.impl"
    })
public class SpringConfig {

  //  @Bean(name = "hibernateSessionBean", initMethod = "getSessionFactory")
  //  public MySessionFactory mySessionFactory() {
  //    return new HibernateSessionFactoryUtil();
  //  }
}
