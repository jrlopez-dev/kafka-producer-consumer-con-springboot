package com.kafka.consumer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @Autowired
    MensajeService service;

    @KafkaListener(topics = "test-topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Mensaje recibido: " + message);
        service.persistirMensaje(message);
    }
}
