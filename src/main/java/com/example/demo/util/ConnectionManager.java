package com.example.demo.util;

import static com.example.demo.ConnectionVars.TOPIC;

import com.example.demo.service.SimpleMqttCallBack;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConnectionManager {
  @Autowired
  private MqttConnectOptions options;
  @Autowired
  private MqttClient client;
  @Autowired
  private SimpleMqttCallBack simpleMqttCallBack;

  public void connect() throws MqttException {
    System.out.println("Trying to connect!!!");
    client.connect(options);
    client.setCallback(simpleMqttCallBack);
    client.subscribe(TOPIC);
    System.out.println("Connected!!!");
  }
}
