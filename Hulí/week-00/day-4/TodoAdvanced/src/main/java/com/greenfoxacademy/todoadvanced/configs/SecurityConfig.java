package com.greenfoxacademy.todoadvanced.configs;

import com.greenfoxacademy.todoadvanced.security.JWTAuthenticationFilter;
import com.greenfoxacademy.todoadvanced.security.JWTAuthorizationFilter;
import com.greenfoxacademy.todoadvanced.services.CustomUserDetailService;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  private final CustomUserDetailService customUserDetailService;

  public SecurityConfig(CustomUserDetailService customUserDetailService) {
    this.customUserDetailService = customUserDetailService;
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.cors().and().csrf().disable().authorizeRequests()
        .antMatchers("/login").permitAll()
        .antMatchers("/api/**").hasAnyRole("USER", "ADMIN")
//        .hasRole("USER")
        .and()
        .addFilter(new JWTAuthenticationFilter(authenticationManager()))
        .addFilter(new JWTAuthorizationFilter(authenticationManager(), customUserDetailService));
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("test").password("test").roles("USER");
  }
}
