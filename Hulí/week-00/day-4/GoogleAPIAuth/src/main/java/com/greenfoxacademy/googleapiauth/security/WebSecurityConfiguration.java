package com.greenfoxacademy.googleapiauth.security;

import com.greenfoxacademy.googleapiauth.GoogleUserDetails;
import com.greenfoxacademy.googleapiauth.models.User;
import com.greenfoxacademy.googleapiauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.parameters.P;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import javax.annotation.PostConstruct;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Configuration
@EnableOAuth2Sso
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
  private static final Logger LOGGER = Logger.getLogger(WebSecurityConfiguration.class.getName());

  //  private static final String GOOGLE_PLUS_DOMAIN_ATTRIBUTE = "email";
  //  @Bean
  //  public AuthoritiesExtractor authoritiesExtractor(
  //      @Value("#{'${ALLOWED_DOMAIN}'.split(',')}")
  //      final List<String> allowedDomains) {
  //
  //    return new AuthoritiesExtractor() {
  //      @Override
  //      public List<GrantedAuthority> extractAuthorities(final Map<String, Object> map) {
  //        if (map != null && map.containsKey(GOOGLE_PLUS_DOMAIN_ATTRIBUTE)) {
  //          final String domain = (String) map.get(GOOGLE_PLUS_DOMAIN_ATTRIBUTE);
  //          if (!allowedDomains.contains(domain)) {
  //            throw new BadCredentialsException("Not an allowed domain");
  //          }
  //          return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
  //        }
  //        return null;
  //      }
  //    };
  //  }

  //  private static final String EMAIL_KEY = "email";
  //
  //  @Bean
  //  public AuthoritiesExtractor authoritiesExtractor(@Value("@gmail.com") final String
  // allowedDomain) {
  //
  //    return map -> {
  //      if (map != null && map.containsKey(EMAIL_KEY)) {
  //        String domain = map.get(EMAIL_KEY).toString();
  //        if (!domain.contains(allowedDomain)) {
  //          throw new BadCredentialsException("Not an allowed domain. Please try
  // 'greenfoxacademy.com'!");
  //        }
  //        return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
  //      }
  //      return null;
  //    };
  //  }

  @Autowired UserRepository userRepository;

  @Autowired GooglePrincipalExtractor googlePrincipalExtractor;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf()
        .disable()
        .antMatcher("/**")
        .authorizeRequests()
        .antMatchers("/", "/index.html", "/test")
        .permitAll()
        .anyRequest()
        .authenticated()
        .and()
        .logout().logoutUrl("/logout").logoutSuccessUrl("/test");
  }

  @Bean
  public PrincipalExtractor principalExtractor(UserRepository userRepository) {
    return map -> {
      String principalId = (String) map.get("id");
      User user = userRepository.findByPrincipalId(principalId);
      if (user == null) {
        LOGGER.info("No user found, generating profile for {" + principalId + "}");
        user = new User();
        user.setPrincipalId(principalId);
        user.setCreated(LocalDateTime.now());
        user.setEmail((String) map.get("email"));
        user.setFullName((String) map.get("name"));
        user.setPhoto((String) map.get("picture"));
        user.setLastLogin(LocalDateTime.now());
        user.setFirstName((String) map.get("given_name"));
        user.setLastName((String) map.get("family_name"));
      } else {
        user.setLastLogin(LocalDateTime.now());
      }
      userRepository.save(user);
      return user;
    };
  }
}
