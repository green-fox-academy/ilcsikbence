package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FoxClubRepository {

  private List<Fox> foxList;

  public FoxClubRepository() {
    foxList = new ArrayList<>();
    foxList.add(new Fox("Karak", Arrays.asList("asd", "backflip"), "pizza", "Coca Cola"));
    foxList.add(new Fox("Vuk", Arrays.asList("playing the guitar"), "pizza", "Coca Cola"));
  }


  public List<Fox> getFoxList() {
    return foxList;
  }

  public void setFoxList(List<Fox> foxList) {
    this.foxList = foxList;
  }

  public int sizeOfFoxList() {
    return foxList.size();
  }
}
