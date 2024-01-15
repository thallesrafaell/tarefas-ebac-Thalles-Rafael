package dev.thallesrafael.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface AnnotationFirst {

    String value();
    String[] bairros();

    long numeroCasa();

    double valores() default 10;


}
