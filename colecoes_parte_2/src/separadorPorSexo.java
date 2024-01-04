import java.util.ArrayList;
import java.util.Scanner;

public class separadorPorSexo {
    public static void main(String args []) {
        System.out.println("Olá, Mundo");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pessoa> homens = new ArrayList<>();
        ArrayList<Pessoa> mulheres = new ArrayList<>();
        int continuar;
        System.out.println("********** Coleçôes Parte 2 **********");
        System.out.println(" ");
        do {
            String nome;
            String sexo;
            System.out.println("********** Cadastro Pessoa **********");
            System.out.println("Digite o nome da pessoa: ");
            nome = scanner.nextLine();
            System.out.println("Digite o sexo: ");
            sexo = scanner.nextLine();
            System.out.println(" ");
            System.out.println("***************************************");
            Pessoa pessoa = new Pessoa(nome, sexo);

            if(sexo.equalsIgnoreCase("Masculino")){
                homens.add(pessoa);
            } else if (sexo.equalsIgnoreCase("Feminino")) {
                mulheres.add(pessoa);
            } else {
                System.out.println("Sexo inválido por favor digite masculino ou feminino para o campo sexo");
            }

            System.out.println("Deseja cadastrar outra pessoa?");
            System.out.println("Digite 1 para sim e 2 para não.");
            continuar = scanner.nextInt();
            System.out.println("***************************************");
            System.out.println(" ");


            scanner.nextLine();
        }while (continuar == 1);

        System.out.println("********** Masculino **********");
        for(Pessoa homem : homens){

            System.out.println("Nome:" + homem.nome + " sexo: " + homem.sexo);
        }
        System.out.println(" ");
        System.out.println("********** Feminino **********");
        for(Pessoa mulher : mulheres){

            System.out.println("Nome:" + mulher.nome  + " sexo: " + mulher.sexo);
        }


    }
}
