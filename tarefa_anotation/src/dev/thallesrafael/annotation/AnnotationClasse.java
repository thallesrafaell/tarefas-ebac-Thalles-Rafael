package dev.thallesrafael.annotation;

import java.lang.annotation.*;

@AnnotationFirst(value = "Thalles", bairros = "Centro", numeroCasa = 475)
public class AnnotationClasse {
    @AnnotationFirst(value = "Rafael",bairros = {"Centros", "Vila Rica"}, numeroCasa = 475, valores = 100)
    private String nome;


}
