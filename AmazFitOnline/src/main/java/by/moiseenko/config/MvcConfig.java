package by.moiseenko.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

  private static final Logger LOG = LogManager.getLogger(MvcConfig.class.getName());

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/login").setViewName("login");
    registry.addViewController("/news").setViewName("news");
  }


//  @Bean
//  public ViewResolver viewResolver(){
//  InternalResourceViewResolver bean = new InternalResourceViewResolver();
//  bean.setViewClass(JstlView.class);
//  bean.setPrefix("/WEB-INF/jsp/");
//  bean.setSuffix(".jsp");
//  return bean;
//}
}
