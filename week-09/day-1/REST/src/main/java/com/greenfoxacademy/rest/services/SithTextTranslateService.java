package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.SithTranslator;

public interface SithTextTranslateService {
  String translateText(String text);
  String translateSentence(String sentence);
  SithTranslator setTranslatedText(SithTranslator sithTranslator);
}
