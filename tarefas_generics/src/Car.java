public abstract class Car implements Comparable<Car>{

    private String brand;

    private String model;
    private double engine;

    public Car (String brand, String model, double engine){
        this.brand = brand;
        this.model = model;
        this.engine =engine;
    }

    @Override
    public String toString() {
        return  "Marca: " + brand + '\'' +
                ", Modelo: " + model + '\'' +
                ", Motor: " + engine;
    }
    public int compareModel(Car otherCar){
        return this.model.compareTo(otherCar.model);
    }

}
