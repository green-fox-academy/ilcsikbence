package com.greenfoxacademy.bankofsimba.service;

import com.greenfoxacademy.bankofsimba.model.BankAccount;

import java.util.List;

public interface BankAccountService {
  BankAccount getAccountById(int id);
  List<BankAccount> addAccountToList();
  List<BankAccount> showListOfAccounts();
}