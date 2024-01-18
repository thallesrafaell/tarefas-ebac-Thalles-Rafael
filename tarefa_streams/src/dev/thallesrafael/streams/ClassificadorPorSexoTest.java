package dev.thallesrafael.streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClassificadorPorSexoTest {


    @Test
    public void testeClassificadorMulheres(){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Joana", "feminino"));
        pessoas.add(new Pessoa("Maria", "feminino"));
        pessoas.add(new Pessoa("Ana", "feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));

        Stream<Pessoa> mulheres =  pessoas.stream().filter(pessoa -> pessoa.getSexo().equals("feminino"));

        mulheres.forEach(pessoa -> Assert.assertEquals("feminino", pessoa.getSexo()));

    }

}
