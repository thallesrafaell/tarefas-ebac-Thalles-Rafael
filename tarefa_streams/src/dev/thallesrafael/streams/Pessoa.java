package dev.thallesrafael.streams;

public class Pessoa {

   private String nome;

   private String sexo;

    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", sexo: " + sexo + ".";
    }
}
