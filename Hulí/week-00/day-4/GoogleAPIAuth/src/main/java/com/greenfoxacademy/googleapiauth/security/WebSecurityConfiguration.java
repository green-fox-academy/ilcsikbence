package com.greenfoxacademy.googleapiauth.security;

import com.greenfoxacademy.googleapiauth.models.User;
import com.greenfoxacademy.googleapiauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@Configuration
@EnableOAuth2Sso
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
  private static final String GOOGLE_PLUS_DOMAIN_ATTRIBUTE = "domain";
  @Bean
  public AuthoritiesExtractor authoritiesExtractor(
      @Value("#{'${ALLOWED_DOMAIN}'.split(',')}")
      final List<String> allowedDomains) {

    return new AuthoritiesExtractor() {
      @Override
      public List<GrantedAuthority> extractAuthorities(final Map<String, Object> map) {
        if (map != null && map.containsKey(GOOGLE_PLUS_DOMAIN_ATTRIBUTE)) {
          final String domain = (String) map.get(GOOGLE_PLUS_DOMAIN_ATTRIBUTE);
          if (!allowedDomains.contains(domain)) {
            throw new BadCredentialsException("Not an allowed domain");
          }
          return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
        }
        return null;
      }
    };
  }

  @Autowired
  UserRepository userRepository;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .csrf()
        .disable()
        .antMatcher("/**")
        .authorizeRequests()
        .antMatchers("/", "/index.html", "/test")
        .permitAll()
        .anyRequest()
        .authenticated();
  }

//  @Bean
//  public PrincipalExtractor principalExtractor(UserRepository userRepository) {
//    return map -> {
//      String principalId = (String) map.get("id");
//      User user = userRepository.findByPrincipalId(principalId);
//      if (user == null) {
//        LOGGER.info("No user found, generating profile for {" + principalId + "}");
//        user = new User();
//        user.setPrincipalId(principalId);
//        user.setCreated(LocalDateTime.now());
//        String email = (String) map.get("email");
//        if (!email.endsWith("@gmail.com")) {
//          return null;
//        }
//        user.setEmail((String) map.get("email"));
//        user.setFullName((String) map.get("name"));
//        user.setPhoto((String) map.get("picture"));
//        user.setLastLogin(LocalDateTime.now());
//        user.setFirstName((String) map.get("given_name"));
//        user.setLastName((String) map.get("family_name"));
//      } else {
//        user.setLastLogin(LocalDateTime.now());
//      }
//      userRepository.save(user);
//      return user;
//    };
//  }

}