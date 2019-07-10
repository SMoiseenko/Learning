package by.moiseenko.configuration;

import by.moiseenko.utils.HibernateSessionFactoryUtil;
import by.moiseenko.utils.MySessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"by.moiseenko.controller"})
public class WebConfig implements WebMvcConfigurer {

  private static final Logger LOG = LogManager.getLogger(WebConfig.class.getName());

  @Bean
  public InternalResourceViewResolver getViewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setPrefix("/jsp/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
  }
}
