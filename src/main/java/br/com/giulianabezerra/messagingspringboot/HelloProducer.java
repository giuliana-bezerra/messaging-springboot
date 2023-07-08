package br.com.giulianabezerra.messagingspringboot;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducer {
  private final KafkaTemplate<String, String> kafkaTemplate;

  public HelloProducer(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(String message) {
    kafkaTemplate.send("hello-topic", message);
  }
}
