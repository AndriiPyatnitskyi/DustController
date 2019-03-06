package com.example.demo.config;

import static com.example.demo.ConnectionVars.PASSWORD;
import static com.example.demo.ConnectionVars.URI;
import static com.example.demo.ConnectionVars.USER;

import java.util.UUID;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqttConfig {

  @Bean
  public MqttConnectOptions getMqttConnectOptions() {
    MqttConnectOptions options = new MqttConnectOptions();
    options.setUserName(USER); //part of the password_file inside mqtt broker
    options.setPassword(PASSWORD.toCharArray()); //also part of password_file. Username and password might not be needed.
    options.setAutomaticReconnect(true);
    return options;
  }

  @Bean
  public MqttClient getMqttClient() throws MqttException {
    return new MqttClient(URI, UUID.randomUUID().toString().replace("-", ""));
  }
}
