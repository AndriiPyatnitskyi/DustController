package com.example.demo.controller;

import com.example.demo.service.SimpleMqttCallBack;
import java.util.UUID;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private static final String URI = "tcp://mqtt.meteostation.online";
  private static final String USER = "kyivis";
  private static final String PASSWORD = "smartcity";
  private static final String TOPIC = "/#";

  @GetMapping
  public void test() throws MqttException {
//    MqttConnectOptions options = new MqttConnectOptions();
//    options.setUserName(USER); //part of the password_file inside mqtt broker
//    options.setPassword(PASSWORD.toCharArray()); //also part of password_file. Username and password might not be needed.
//    options.setConnectionTimeout(60);
//    options.setKeepAliveInterval(60); //how often to send PINGREQ messages
//    options.setMqttVersion(MqttConnectOptions.MQTT_VERSION_3_1_1);//newest version
//
//    MqttClient client = new MqttClient(URI, UUID.randomUUID().toString().replace("-", "")); //clientID needs to be unique and has meaning only for mqtt broker
//    client.connect(options);
//    System.out.println("connected");
//    client.setCallback(new SimpleMqttCallBack());
//    client.subscribe(TOPIC);
  }
}
