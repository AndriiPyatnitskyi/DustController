package com.example.demo.service;

import com.example.demo.Payload;
import com.example.demo.model.GasController;
import com.example.demo.repository.GasControllerRepository;
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
  private GasControllerRepository gasControllerRepository;

  @Override
  public void run(String...args) throws Exception {
    connectionManager.connect();

//    new Thread(() -> {
//      run();
//    }).start();

  }

  private void run() {
    try {
      GasController gasController = objectMapper.readValue(Payload.payload, GasController.class);
      GasController save = gasControllerRepository.save(gasController);
      System.out.println(save);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
