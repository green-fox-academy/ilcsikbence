package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.Log;
import com.greenfoxacademy.rest.repositories.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
  private LogRepository logRepository;

  public LogServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void saveLog(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> showLogs() {
    return logRepository.findAll();
  }
}
