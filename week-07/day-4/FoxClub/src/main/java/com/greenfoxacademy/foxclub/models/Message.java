package com.greenfoxacademy.foxclub.models;

public class Message {
  private String title;
  private String content;
  private String senderName;
  private int id;

  public Message(String title, String content, String senderName) {
    this.title = title;
    this.content = content;
    this.senderName = senderName;
    this.id = 0;
  }

  public Message() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}