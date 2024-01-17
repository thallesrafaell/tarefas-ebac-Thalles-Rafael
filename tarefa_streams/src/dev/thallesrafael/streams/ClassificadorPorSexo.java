package dev.thallesrafael.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ClassificadorPorSexo {

    public static void main(String[] args) {
        //Ler o nome no console utilizando split;
        //ler a lista no console separado por virgula;
        //com Stream cria uma lista a partir da primeira retornando mulheres.
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        long continuar = 0;

            System.out.println("Vamos cadastrar uma pessoa:");
        do{

            System.out.println("Digite o nome da pessoa e o sexo separado por virgula: ");
            System.out.println("Digite Masculino ou Feminino. ");
            System.out.println("Ex: Maria, Feminino");

            String pessoa = scanner.nextLine();
            String[] dadosPessoa = pessoa.split(", ");

            Pessoa novaPessoa = new Pessoa(dadosPessoa[0], dadosPessoa[1].toLowerCase());
            pessoas.add(novaPessoa);

            System.out.println("Deseja Cadastrar outra pessoa?");
            System.out.println("Digite 1 para sim ou 2 para não");
            continuar = scanner.nextLong();
            scanner.nextLine();

        }while (continuar == 1);



        System.out.println("---------------Lista Completa---------------");

        Stream<Pessoa> streamPessoas = pessoas.stream();
        streamPessoas.forEach(pessoa -> System.out.println(pessoa.toString()));
        System.out.println(" ");

        System.out.println("---------------Lista Feminina---------------");

        Stream<Pessoa> mulheres =  pessoas.stream().filter(pessoa -> pessoa.getSexo().equals("feminino"));
        mulheres.forEach(pessoa -> System.out.println(pessoa.toString()));
        System.out.println(" ");

        System.out.println("---------------Lista Maculina---------------");

        Stream<Pessoa> homens =  pessoas.stream().filter(pessoa -> pessoa.getSexo().equals("masculino"));
        homens.forEach(pessoa -> System.out.println(pessoa.toString()));
        System.out.println(" ");







    }


}
