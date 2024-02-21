package dev.thallesrafael.tarefas_mod_33.controllers;

import org.apache.catalina.connector.Response;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dev.thallesrafael.tarefas_mod_33.entities.Accessory;
import dev.thallesrafael.tarefas_mod_33.entities.Car;
import dev.thallesrafael.tarefas_mod_33.services.AccessoryService;
import dev.thallesrafael.tarefas_mod_33.services.CarService;
import jakarta.persistence.Access;

@RestController
@RequestMapping(value = "/cars")
public class CarController {
  
  @Autowired
  public CarService service;

  @Autowired
  public AccessoryService accessoryService;

  @GetMapping
  public ResponseEntity<List<Car>> findAll(){
    List<Car> cars = service.findAll();
    return ResponseEntity.ok().body(cars);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Car> findById(@PathVariable Long id){
    Car car = service.findById(id);
    return ResponseEntity.ok().body(car);
  }

  @PostMapping
  public ResponseEntity<Car> insertCar(@RequestBody Car car){
    car = service.insertCar(car);
    return ResponseEntity.ok().body(car);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Car> deleteCar(@PathVariable Long id){
    service.deleteCar(id);
    return ResponseEntity.noContent().build();
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<Car> updateCar(@PathVariable Long id, @RequestBody Car car){
    car = service.updateCar(id, car);
    return ResponseEntity.ok().body(car);
  }

}
