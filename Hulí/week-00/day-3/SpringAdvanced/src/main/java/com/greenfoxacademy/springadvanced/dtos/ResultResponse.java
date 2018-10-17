package com.greenfoxacademy.springadvanced.dtos;

public class ResultResponse {
  public String response;

  public ResultResponse(String response) {
    this.response = response;
  }

  public ResultResponse() {
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }
}
