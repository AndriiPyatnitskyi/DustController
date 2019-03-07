package com.example.demo.service;

import com.example.demo.model.GasController;
import com.example.demo.repository.GasControllerRepository;
import com.example.demo.util.ConnectionManager;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleMqttCallBack implements MqttCallback {

  @Autowired
  private ObjectMapper mapper;

  @Autowired
  private ConnectionManager connectionManager;

  @Autowired
  private GasControllerRepository gasControllerRepository;

  @Override
  public void connectionLost(Throwable throwable) {
    System.out.println("Connection to MQTT broker lost!");
    try {
      connectionManager.connect();
    } catch (MqttException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void messageArrived(String s, MqttMessage mqttMessage) throws IOException {
    GasController gasController = mapper.readValue(mqttMessage.getPayload(), GasController.class);

    GasController save = gasControllerRepository.save(gasController);

    System.out.println("Message received:\n\t" + save);
//    System.out.println("Message received:\n\t" + new String(payload));

  }

  @Override
  public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
    // not used in this example
  }
}
