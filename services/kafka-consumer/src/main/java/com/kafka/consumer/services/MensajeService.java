package com.kafka.consumer.services;

import com.kafka.consumer.model.Mensajes;
import com.kafka.consumer.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeService {
    @Autowired
    MensajeRepository repository;

    public void persistirMensaje(String mensaje){
        Mensajes mensajes = Mensajes
                            .builder()
                            .mensaje(mensaje)
                            .build();
        repository.save(mensajes);
    }

    public List<Mensajes> getAllMensajes(){
        return repository.findAll();
    }
}
