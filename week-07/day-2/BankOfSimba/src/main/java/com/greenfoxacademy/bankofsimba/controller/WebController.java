package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.repository.BankAccountRepository;
import com.greenfoxacademy.bankofsimba.service.BankAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WebController {

  BankAccountServiceImpl bankAccountService;
  BankAccountRepository bankAccountRepository;

  @Autowired
  public WebController(BankAccountServiceImpl bankAccountService, BankAccountRepository bankAccountRepository) {
    this.bankAccountService = bankAccountService;
    this.bankAccountRepository = bankAccountRepository;
  }

  @GetMapping(value = "/show")
  public String showFields(Model model, @RequestParam(value = "id", required = true) int id) {
    model.addAttribute("BankAccount", bankAccountService.getAccountById(id));
    return "bank-account-info";
  }

  @GetMapping(value = "/show-all")
  public String showAllAccounts(Model model) {
    model.addAttribute("BankAccounts", bankAccountService.showListOfAccounts());
    return "all-accounts";
  }
}