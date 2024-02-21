package dev.thallesrafael.tarefas_mod_33.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_car")
public class Car implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String model;
  private String color;
  private double price;

  
  @ManyToOne
  @JoinColumn(name = "brand_id")
  private Brand brand;

  @JsonIgnore
  @ManyToMany
  @JoinTable(
      name = "car_accessory",
      joinColumns = @JoinColumn(name = "car_id"),
      inverseJoinColumns = @JoinColumn(name = "accessory_id")
  )
  private Set<Accessory> accessories = new HashSet<>();


  public Car() {
  }

  public Car(Long id, String model, String color, double price, Brand brand, Set<Accessory> accessories)  {
    this.id = id;
    this.model = model;
    this.color = color;
    this.price = price;
    this.brand = brand;
    this.accessories = accessories;
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public Brand getBrand() {
    return brand;
  }
  public void setBrand(Brand brand) {
    this.brand = brand;
  }
  public Set<Accessory> getAccessory() {
    return accessories;
  }

  public void setAccessory(Set<Accessory> accessories) {
    this.accessories = accessories;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Car other = (Car) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  

  
  
}
