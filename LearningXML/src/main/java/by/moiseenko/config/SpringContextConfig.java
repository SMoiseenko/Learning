package by.moiseenko.config;

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
@ComponentScan(basePackages = {"by.moiseenko.utils.impl"})
public class SpringContextConfig {
  private static final Logger LOG = LogManager.getLogger(SpringContextConfig.class.getName());

}
