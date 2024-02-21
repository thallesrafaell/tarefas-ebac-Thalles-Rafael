package dev.thallesrafael.tarefas_mod_33.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.thallesrafael.tarefas_mod_33.entities.Accessory;
import dev.thallesrafael.tarefas_mod_33.repositories.AccessoryRepository;

@Service
public class AccessoryService {

  @Autowired
  public AccessoryRepository repository;

  public List<Accessory> findAll(){
    return repository.findAll();
  }

  public Accessory findById(Long id){
    return repository.findById(id).get();
  }

  public Accessory insertAccessory(Accessory accessory){
    return repository.save(accessory);
  }

  public void deleteAccessory(Long id){
    repository.deleteById(id);
  }

  public Accessory updateAccessory(Long id, Accessory accessory){
    Accessory entity = repository.getReferenceById(id);
    updateData(entity, accessory);
    return repository.save(entity);
  }

  private void updateData(Accessory entity, Accessory accessory) {
    entity.setName(accessory.getName());
    entity.setPrice(accessory.getPrice());
  }


}
