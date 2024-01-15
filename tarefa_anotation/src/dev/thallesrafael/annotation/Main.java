package dev.thallesrafael.annotation;

import dev.thallesrafael.annotation.AnnotationClasse;
import dev.thallesrafael.annotation.AnnotationFirst;


import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        // Obtendo a classe
        Class<AnnotationClasse> classe = AnnotationClasse.class;

        AnnotationFirst annotationClass = classe.getAnnotation(AnnotationFirst.class);

        System.out.println("---------------------Classe----------------------");
        System.out.println(classe.getName());
        System.out.println(" ");

        // Obtendo a anotação na classe
        if (annotationClass != null) {
            System.out.println("---------Valores das Anotações na Classe---------");
            System.out.println("Valor: " + annotationClass.value());
            System.out.println("Bairros: " + String.join(", ", annotationClass.bairros()));
            System.out.println("Número da Casa: " + annotationClass.numeroCasa());
            System.out.println(" ");
        }


        try {
            Field campo = classe.getDeclaredField("nome");
            AnnotationFirst annotationField = campo.getAnnotation(AnnotationFirst.class);

            // Obtendo a anotação no campo
            if (annotationField != null) {
                System.out.println("--------Valores das Anotações dos campos--------");
                System.out.println("Valor: " + annotationField.value());
                System.out.println("Bairros: " + String.join(", ", annotationField.bairros()));
                System.out.println("Número da Casa: " + annotationField.numeroCasa());
                System.out.println("Valores: " + annotationField.valores());
                System.out.println(" ");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------Fim-----------------------");
    }
}
