public abstract class Factory {

    public  Carro create(String marca) {
        Carro car = pedidoCarro(marca);
            car = montarCarro(car);
            return  car;


    }

    private Carro montarCarro(Carro car) {
        car.montagemDoMotor();
        car.pintura();
        car.abastecer();
        car.checkList();
        return car;

    }

    abstract Carro pedidoCarro(String marca);

}
