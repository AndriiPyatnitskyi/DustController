package com.example.demo.service;

import com.example.demo.Payload;
import com.example.demo.model.AirMonitor;
import com.example.demo.repository.AirMonitorRepository;
import com.example.demo.util.ConnectionManager;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
  @Autowired
  private ConnectionManager connectionManager;
  @Autowired
  private ObjectMapper objectMapper;
  @Autowired
  private AirMonitorRepository airMonitorRepository;

  @Override
  public void run(String...args) throws Exception {
//    connectionManager.connect();

    new Thread(this::mockBroker).start();
  }

  private void mockBroker() {
    try {
      AirMonitor airMonitor = objectMapper.readValue(Payload.payload, AirMonitor.class);
      AirMonitor save = airMonitorRepository.save(airMonitor);
      System.out.println(save);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
