package com.kafka.consumer.controller;

import com.kafka.consumer.model.Mensajes;
import com.kafka.consumer.services.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MensajesController {
    @Autowired
    MensajeService service;

    @GetMapping("/mensajes")
    public ResponseEntity<List<Mensajes>> getAll(){
        return ResponseEntity.ok(service.getAllMensajes());
    }
}
