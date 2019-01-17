package com.greenfoxacademy.googleapiauth.security;

import com.greenfoxacademy.googleapiauth.models.User;
import com.greenfoxacademy.googleapiauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.Map;

@Component
public class GooglePrincipalExtractor {

  public String getName(Authentication authentication) {
    if (authentication.getPrincipal().toString().equals("anonymousUser")) {
      return "";
    }

    authentication = SecurityContextHolder.getContext().getAuthentication();
    User user = (User) authentication.getPrincipal();
    return user.getFullName();
  }

  //  String name = "";

  //    @Override
  //    public String extractPrincipal(Map<String, Object> map) {
  //      name = (String) map.get("name");
  //      return (String) map.get("name");
  //    }
  //
  //    public String getName() {
  //      return name;
  //    }

}
