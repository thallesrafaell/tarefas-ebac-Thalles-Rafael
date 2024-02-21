package dev.thallesrafael.tarefas_mod_33.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.thallesrafael.tarefas_mod_33.entities.Accessory;
import dev.thallesrafael.tarefas_mod_33.services.AccessoryService;

@RestController
@RequestMapping(value = "/accessories")
public class AccessoryController {
  
  @Autowired
  private AccessoryService service;

  @GetMapping
  public ResponseEntity<List<Accessory>> findAll(){
    List<Accessory> accessories = service.findAll();
    return ResponseEntity.ok().body(accessories);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Accessory> findById(@PathVariable Long id){
    Accessory accessory = service.findById(id);
    return ResponseEntity.ok().body(accessory);
  }

  @PostMapping
  public ResponseEntity<Accessory> inserEntity(@RequestBody Accessory accessory){
    Accessory newAccessory = service.insertAccessory(accessory);
    return ResponseEntity.ok().body(newAccessory);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Accessory> deleteEntity(@PathVariable Long id){
    service.deleteAccessory(id);
    return ResponseEntity.noContent().build();
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<Accessory> updateEntity(@PathVariable Long id, @RequestBody Accessory accessory){
    accessory = service.updateAccessory(id, accessory);
    return ResponseEntity.ok().body(accessory);
  }
}
