package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.repositories.FoxClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxClubServiceImpl implements FoxClubService {
  FoxClubRepository foxClubRepository;

  @Autowired
  public FoxClubServiceImpl(FoxClubRepository foxClubRepository) {
    this.foxClubRepository = foxClubRepository;
  }


  @Override
  public Fox getFoxByName(String name) {
    ArrayList<Fox> foxes = new ArrayList<>();
    Fox fox;
    for (int i = 0; i < foxClubRepository.sizeOfFoxList(); i++) {
      if (getFoxByIndex(i).getName().equals(name)) {
        foxes.add(getFoxByIndex(i));
      }
    }
    return foxes.get(0);
  }

  @Override
  public Fox getFoxByIndex(int i) {
    return foxClubRepository.getFoxList().get(i);
  }
}