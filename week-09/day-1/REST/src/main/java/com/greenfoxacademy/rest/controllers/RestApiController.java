package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.modells.*;
import com.greenfoxacademy.rest.modells.Error;
import com.greenfoxacademy.rest.services.ArrayHandlerService;
import com.greenfoxacademy.rest.services.DoUntilService;
import com.greenfoxacademy.rest.services.LogService;
import com.greenfoxacademy.rest.services.SithTextTranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class RestApiController {

  private ArrayHandlerService arrayHandlerService;
  private LogService logService;
  private String endPoint;
  private DoUntilService doUntilService;
  private SithTextTranslateService sithTextTranslateService;

  @Autowired
  public RestApiController(ArrayHandlerService arrayHandlerService, LogService logService, DoUntilService doUntilService, SithTextTranslateService sithTextTranslateService) {
    this.arrayHandlerService = arrayHandlerService;
    this.logService = logService;
    this.doUntilService = doUntilService;
    this.sithTextTranslateService = sithTextTranslateService;
  }


  @GetMapping(value = "/doubling")
  public Object getDoublingValues(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return new Error("Please provide an input!");
    } else {
      logService.saveLog(new Log(new Date(), "/doubling", "input=" + String.valueOf(input)));
      return new Doubling(input);
    }
  }

  @GetMapping(value = "/greeter")
  public Object getGreeting(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "title", required = false) String title) {
    if (name == null || title == null) {
      return new Error("Please provide a name!");
    }
    logService.saveLog(new Log(new Date(), "/greeter", name + " " + title));
    return new WelcomeMessage(name, title);
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Object getAppendA(@PathVariable(value = "appendable") String appendable) {
    if (appendable == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND);
    }
    logService.saveLog(new Log(new Date(), "/appendable/" + appendable, "appendable=" + appendable));
    return new AppendA(appendable);
  }

  @PostMapping(value = "/dountil/{action}")
  public Object postDoUntil(@PathVariable(value = "action") String action,
                            @RequestBody UntilNumber until) {

    if (until == null) {
      return new Error("Please provide a number");
    }

    if (action.equals("sum")) {
      DoUntil doUntil = new DoUntil();
      doUntilService.sum(until.getUntil(), doUntil);

      endPoint = "/dountil/sum";
      logService.saveLog(new Log(endPoint, "until=" + until.getUntil()));
      return doUntil;
    }

    if (action.equals("factor")) {
      DoUntil doUntil = new DoUntil();
      doUntilService.factor(until.getUntil(), doUntil);

      endPoint = "/dountil/factor";
      logService.saveLog(new Log(endPoint, "until=" + until.getUntil()));
      return doUntil;
    }

    return new Error("Please provide an action!");
  }

  @PostMapping(value = "/arrays")
  public Object postArrayHandlerOperations(@RequestBody ArrayHandler arrayHandler) {
    if (arrayHandler.getNumbers() == null || arrayHandler.getWhat() == null)
      return new Error("Please provide what to do with the numbers!");

    if (arrayHandler.getWhat().equals("sum")) {
      endPoint = "/arrays/" + arrayHandler.getWhat();
      logService.saveLog(new Log(endPoint, String.valueOf(arrayHandlerService.sumOfElements(arrayHandler.getNumbers()))));
      return arrayHandlerService.sumOfElements(arrayHandler.getNumbers());
    } else if (arrayHandler.getWhat().equals("multiply")) {
      endPoint = "/arrays/" + arrayHandler.getWhat();
      logService.saveLog(new Log(endPoint, String.valueOf(arrayHandlerService.multiplicationOfElements(arrayHandler.getNumbers()))));
      return arrayHandlerService.multiplicationOfElements(arrayHandler.getNumbers());
    } else if (arrayHandler.getWhat().equals("double")) {
      endPoint = "/arrays/" + arrayHandler.getWhat();
      logService.saveLog(new Log(endPoint, String.valueOf(arrayHandlerService.doubleOfElements(arrayHandler.getNumbers()))));
      return arrayHandlerService.doubleOfElements(arrayHandler.getNumbers());
    }

    return new Error("Please provide the numbers");
  }

  @GetMapping(value = "/log")
  public Object listAllLogs() {
    Entries entries = new Entries(logService.showLogs(), logService.showLogs().size());
    return entries;
  }

  @PostMapping(value = "/sith")
  public Object sithText(@RequestBody SithTranslator sithTranslator) {
    return sithTextTranslateService.setTranslatedText(sithTranslator);
  }
}
