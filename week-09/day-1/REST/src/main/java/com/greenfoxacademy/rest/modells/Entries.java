package com.greenfoxacademy.rest.modells;

import java.util.List;

public class Entries {
  private List<Log> entries;
  private int entries_count;

  public Entries(List<Log> entries, int entries_count) {
    this.entries = entries;
    this.entries_count = entries.size();
  }

  public Entries() {
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntries_count() {
    entries_count = entries.size();
    return entries_count;
  }

  public void setEntries_count(int entries_count) {
    this.entries_count = entries_count;
  }
}
