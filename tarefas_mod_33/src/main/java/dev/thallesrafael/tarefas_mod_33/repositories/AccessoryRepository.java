package dev.thallesrafael.tarefas_mod_33.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.thallesrafael.tarefas_mod_33.entities.Accessory;

public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
  Accessory findByName(String name);
}
