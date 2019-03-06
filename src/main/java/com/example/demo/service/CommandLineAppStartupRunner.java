package com.example.demo.service;

import com.example.demo.util.ConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
  @Autowired
  private ConnectionManager connectionManager;

  @Override
  public void run(String...args) throws Exception {
    connectionManager.connect();
  }
}
