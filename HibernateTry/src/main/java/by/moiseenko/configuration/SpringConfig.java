package by.moiseenko.configuration;

import by.moiseenko.utils.HibernateSessionFactoryUtil;
import by.moiseenko.utils.MySessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Configuration
@ComponentScan(basePackages = {"by.moiseenko.utils"})
public class SpringConfig {

//  @Bean(name = "hibernateSessionBean", initMethod = "doInit")
//  public MySessionFactory mySessionFactory() {
//    return new HibernateSessionFactoryUtil();
//  }
}
