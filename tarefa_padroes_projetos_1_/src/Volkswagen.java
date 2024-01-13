public class Volkswagen extends Factory {
    @Override
    Carro pedidoCarro(String marca) {

        Up up = new Up(100, "Etanol", "Azul", "Up");
        return up;

    }
}
