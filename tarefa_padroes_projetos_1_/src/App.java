import java.util.Scanner;

public class App {

    public static void main(String arg []){
        Scanner scanner= new Scanner(System.in);
        String marca;
        int opcao;

            System.out.println("----------------Fábrica de Carros Pobretão----------------");
            System.out.println("");
            System.out.println("Digite 1 - Fabricar um carro fiat");
            System.out.println("Digite 2 - Fabricar um carro Wolksvagen");

            opcao = scanner.nextInt();


            if (opcao == 1){
                marca = "fiat";
            } else {
                marca = "volkswagen";
            }

            System.out.println("-------------------Iniciando produção---------------------");
            Customer cliente = new Customer(marca);
            Factory fabrica = getFabrica(cliente);
            fabrica.create(cliente.getMarca());
            System.out.println("");

        System.out.println("Obrigado pela Preferência!!!");








    }

    private static Factory getFabrica(Customer cliente) {
        if("fiat".equals(cliente.getMarca())){
            return new Fiat();
        } else {
            return new Volkswagen();
        }

    }
}
