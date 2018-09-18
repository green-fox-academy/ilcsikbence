package com.greenfoxacademy.bankofsimba.repository;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankAccountRepository {
  List<BankAccount> bankAccounts;

  public BankAccountRepository() {
    bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Simba", 2000, "lion", false, false));
    bankAccounts.add(new BankAccount("Pumbaa", 1000, "warthog", false, false));
    bankAccounts.add(new BankAccount("Timon", 2500, "meerkat", false, false));
    bankAccounts.add(new BankAccount("Nala", 2700, "lion", false, false));
    bankAccounts.add(new BankAccount("Mufasa", 8900, "lion", true, false));
  }

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }
}
