package br.com.giulianabezerra.messagingspringboot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {
  @KafkaListener(topics = "hello-topic", groupId = "group-1")
  public void receiveMessage(String message) {
    // Process the received message
    System.out.println("Consumer Message: " + message);
  }
}
