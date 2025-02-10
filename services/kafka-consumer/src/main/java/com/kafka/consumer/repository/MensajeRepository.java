package com.kafka.consumer.repository;

import com.kafka.consumer.model.Mensajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository<Mensajes, Integer> {
}
