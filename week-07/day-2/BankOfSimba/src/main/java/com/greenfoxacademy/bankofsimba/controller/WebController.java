package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.repository.BankAccountRepository;
import com.greenfoxacademy.bankofsimba.service.BankAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;


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

  @PostMapping(value = "/show-all")
  public String addAccount(Model model) {
    bankAccountService.addAccountToList();
    model.addAttribute("bankAccount",bankAccountRepository.getBankAccounts().get(bankAccountRepository.getBankAccounts().size() - 1));
    return "redirect: /show-all";
  }
}