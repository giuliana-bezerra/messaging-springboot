package br.com.giulianabezerra.messagingspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MessagingSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingSpringbootApplication.class, args);
	}
}

@RestController
@RequestMapping("/kafka")
class MessagingController {
	@Autowired
	private HelloProducer service;

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		service.sendMessage("Olá, " + name);
		return "OK";
	}
}
