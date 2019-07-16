package by.moiseenko.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Configuration
@EnableWebMvc
@ComponentScan(
    basePackages = {
      "by.moiseenko.controller",
      "by.moiseenko.repository.impl",
      "by.moiseenko.service.impl"
    })
public class WebConfig implements WebMvcConfigurer {

  private static final Logger LOG = LogManager.getLogger(WebConfig.class.getName());

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
  }

  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    registry.jsp("/WEB-INF/pages/", ".jsp");
  }
}
