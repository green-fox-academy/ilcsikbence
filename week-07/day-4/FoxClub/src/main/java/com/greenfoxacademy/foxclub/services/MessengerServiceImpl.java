package com.greenfoxacademy.foxclub.services;


import com.greenfoxacademy.foxclub.models.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessengerServiceImpl implements MessengerService {
  FoxClubService foxClubService;

  public MessengerServiceImpl(FoxClubService foxClubService) {
    this.foxClubService = foxClubService;
  }

  @Override
  public List<Message> getMessages(String name) {
    return foxClubService.getFoxByName(name).getMessages();
  }

  @Override
  public void sendMessage(String name, Message message) {
    List<Message> messagesList = new ArrayList<>();
    for (int i = 0; i < foxClubService.getFoxByName(name).getMessages().size(); i++) {
      messagesList.add(foxClubService.getFoxByName(name).getMessages().get(i));
      messagesList.get(i).setId(i);
    }
    messagesList.add(message);
    messagesList.get(messagesList.size() - 1).setId(messagesList.size() - 1);
    foxClubService.getFoxByName(name).setMessages(messagesList);
  }


}
