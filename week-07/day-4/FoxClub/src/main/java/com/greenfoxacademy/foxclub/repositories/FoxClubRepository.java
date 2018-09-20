package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxClubRepository {

  private List<Fox> foxList;

  public FoxClubRepository() {
    foxList = new ArrayList<>();
    List<String> tricks = new ArrayList<>();
    tricks.add("asddsa");
    foxList.add(new Fox("Karak", tricks, "pizza", "cola"));
    foxList.add(new Fox("Vuk", tricks, "pizza", "cola"));
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
