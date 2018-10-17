package com.greenfoxacademy.todoadvanced.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String content;
  private LocalDateTime dateTime;
  private Boolean urgent;
  private Boolean done;

  public Todo(String content, Boolean urgent, Boolean done) {
    this.content = content;
    this.dateTime = LocalDateTime.now();
    this.urgent = urgent;
    this.done = done;
  }

  public Todo(String content) {
    this.content = content;
    this.dateTime = LocalDateTime.now();
    this.urgent = false;
    this.done = false;
  }

  public Todo() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public Boolean getUrgent() {
    return urgent;
  }

  public void setUrgent(Boolean urgent) {
    this.urgent = urgent;
  }

  public Boolean getDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }
}
