package dev.thallesrafael.tarefas_mod_33.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.thallesrafael.tarefas_mod_33.entities.Brand;
import dev.thallesrafael.tarefas_mod_33.repositories.BrandRepository;

@Service
public class BrandService {
  
  @Autowired
  private BrandRepository repository;

  public List<Brand> findAll(){
    return repository.findAll();
  }

  public Brand findById(Long id){
    return repository.findById(id).get();
  }

  public Brand insertBrand(Brand brand){
    return repository.save(brand);
  }
  
  public void deleteBrand(Long id){
    repository.deleteById(id);
  }

  public Brand updateBrand(Long id, Brand brand){
    Brand entity = repository.getReferenceById(id);
    updateData(entity, brand);
    return repository.save(entity);
  }

  private void updateData(Brand entity, Brand brand) {
   entity.setName(brand.getName());
  }
  
}
