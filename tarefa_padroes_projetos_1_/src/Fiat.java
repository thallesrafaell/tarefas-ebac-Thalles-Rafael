public class Fiat extends Factory {
    @Override
    Carro pedidoCarro(String marca) {
        Carro mobi = new Mobi(90,"Gasolina", "Vermelho","Mobi");
        return mobi;
    }
}
