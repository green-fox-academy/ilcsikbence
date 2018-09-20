package com.greenfoxacademy.bankofsimba.service;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {

  BankAccountRepository bankAccountRepository;

  @Autowired
  public BankAccountServiceImpl(BankAccountRepository bankAccountRepository) {
    this.bankAccountRepository = bankAccountRepository;
  }

  @Override
  public BankAccount getAccountById(int id) {
    return bankAccountRepository.getBankAccounts().get(id);
  }

  @Override
  public List<BankAccount> addAccountToList() {
    BankAccount bankAccount = new BankAccount();
    bankAccountRepository.getBankAccounts().add(bankAccount);
    return bankAccountRepository.getBankAccounts();
  }

  @Override
  public List<BankAccount> showListOfAccounts() {
    return bankAccountRepository.getBankAccounts();
  }
}