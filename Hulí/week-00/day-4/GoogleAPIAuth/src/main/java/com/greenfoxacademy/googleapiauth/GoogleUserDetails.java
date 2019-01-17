package com.greenfoxacademy.googleapiauth;

import com.greenfoxacademy.googleapiauth.models.User;

public class GoogleUserDetails {
  public String getName(User user) {
    return user.getFirstName() + " " + user.getLastName();
  }
}
