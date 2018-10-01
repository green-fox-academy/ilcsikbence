package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.Log;

import java.util.List;

public interface LogService {
  void saveLog(Log log);
  List<Log> showLogs();
}
