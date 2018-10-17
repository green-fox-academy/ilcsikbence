package com.greenfoxacademy.todoadvanced.services;

import com.greenfoxacademy.todoadvanced.models.ApplicationUser;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailService implements UserDetailsService {
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    ApplicationUser applicationUser = loadApplicationUserByUsername(username);
//    User user = new User(applicationUser.getUsername(), applicationUser.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN"));
    UserDetails build = User.withDefaultPasswordEncoder().username("admin").password("admin").roles("USER", "ADMIN").build();
    return build;
  }

  public ApplicationUser loadApplicationUserByUsername(String username) {

    return new ApplicationUser("admin", "admin");
  }
}
