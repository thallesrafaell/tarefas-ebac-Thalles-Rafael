package dev.thallesrafael.tarefas_mod_33.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import dev.thallesrafael.tarefas_mod_33.entities.Accessory;
import dev.thallesrafael.tarefas_mod_33.entities.Brand;
import dev.thallesrafael.tarefas_mod_33.entities.Car;
import dev.thallesrafael.tarefas_mod_33.repositories.AccessoryRepository;
import dev.thallesrafael.tarefas_mod_33.repositories.BrandRepository;
import dev.thallesrafael.tarefas_mod_33.repositories.CarRepository;

@Service
public class CarService {
  

  @Autowired
  public CarRepository repository;

  @Autowired
  public AccessoryRepository accessoryRepository;

  @Autowired
  public BrandRepository brandRepository;

  public List<Car> findAll(){
    return repository.findAll();
  }

  public Car findById(Long id){
    return repository.findById(id).get();
  }

  public  Car insertCar(Car car) {
   if(car.getAccessory() != null){
     for(Accessory accessory : car.getAccessory()){
       car.getAccessory().add(accessoryRepository.findById(accessory.getId()).get());
     }    
  }
  if (car.getBrand() != null && car.getBrand().getId() != null) {
        Brand existingBrand = brandRepository.findById(car.getBrand().getId()).orElse(null);

        if (existingBrand != null) {
            car.setBrand(existingBrand);
        } else {
           
            throw new IllegalArgumentException("Brand with id " + car.getBrand().getId() + " not found");
        }
    }
  return repository.save(car);
}

public void deleteCar(Long id){
  repository.deleteById(id);
}



public Car updateCar(Long id, Car car){
  Car entity = repository.getReferenceById(id);
  updateData(entity, car);
  return repository.save(entity);
}

private void updateData(Car entity, Car car) {
  entity.setModel(car.getModel());
  entity.setColor(car.getColor());
  entity.setPrice(car.getPrice());
  entity.setBrand(car.getBrand());

}

}

