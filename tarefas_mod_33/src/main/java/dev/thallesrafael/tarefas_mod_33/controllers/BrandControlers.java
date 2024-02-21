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

import dev.thallesrafael.tarefas_mod_33.entities.Brand;
import dev.thallesrafael.tarefas_mod_33.services.BrandService;

@RestController
@RequestMapping(value = "/brands")
public class BrandControlers {

  @Autowired
  public BrandService service;
  
  @GetMapping
  public ResponseEntity<List<Brand>> getService() {
    List<Brand> brands = service.findAll();
    return ResponseEntity.ok().body(brands);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Brand> findById(@PathVariable Long id){
    Brand brand = service.findById(id);
    return ResponseEntity.ok().body(brand);
  }
  @PostMapping
  public ResponseEntity<Brand> insertBrand(@RequestBody Brand brand){
    Brand newBrand = service.insertBrand(brand);
    return ResponseEntity.ok().body(newBrand);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Brand> deleteBrand(@PathVariable Long id){
    service.deleteBrand(id);
    return ResponseEntity.noContent().build();
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<Brand> updateBrand(@PathVariable Long id, @RequestBody Brand brand){
    brand = service.updateBrand(id, brand);
    return ResponseEntity.ok().body(brand);
  }
}
