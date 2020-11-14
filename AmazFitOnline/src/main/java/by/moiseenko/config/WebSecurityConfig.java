package by.moiseenko.config;

import by.moiseenko.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  private static final Logger LOG = LogManager.getLogger(WebSecurityConfig.class.getName());

  private final UserService userService;
@Autowired
  public WebSecurityConfig(UserService userService) {
    this.userService = userService;
  }


  @Bean
  public BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable().authorizeRequests().antMatchers("/registration").not()
        .fullyAuthenticated().antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/news")
        .hasRole("USER").antMatchers("/", "/resources/**").permitAll().anyRequest().authenticated()
        .and().formLogin().loginPage("/login").defaultSuccessUrl("/").permitAll().and().logout()
        .permitAll().logoutSuccessUrl("/");
  }

  @Autowired
  protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder());
  }
}
