package com.greenfoxacademy.bankofsimba.service;

import com.greenfoxacademy.bankofsimba.model.BankAccount;

import java.util.List;

public interface BankAccountService {
  BankAccount getAccountById(int id);
  void addAccountToList(BankAccount bankAccount);
  List<BankAccount> showListOfAccounts();
}