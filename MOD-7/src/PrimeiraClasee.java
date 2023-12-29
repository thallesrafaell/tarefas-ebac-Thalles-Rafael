public class PrimeiraClasee {

    public static void main(String args[]){
        System.out.println("Olá, Thalles");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua Sebastião Bonito 475");
        System.out.println(cliente.getEndreco());
        cliente.imprimirEndereco();
        String NomeCliente = cliente.retornarNomeCliente();
        System.out.println(NomeCliente);
        int idCliente = cliente.idCliente();
        System.out.println(idCliente);

    }
}
