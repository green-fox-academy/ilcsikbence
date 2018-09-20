package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Message;

import java.util.List;

public interface MessengerService {
  List<Message> getMessages(String name);
  void sendMessage(String name, Message message);
}