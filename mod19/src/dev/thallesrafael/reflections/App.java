package dev.thallesrafael.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String args[]){

        Class clazz = Produto.class;
        System.out.println(clazz);

        try {
            Constructor clazzConstructor = clazz.getConstructor();
            Produto prod1 =(Produto) clazzConstructor.newInstance();
            System.out.println(clazzConstructor);
            System.out.println(prod1);
            Field[] fields =   prod1.getClass().getDeclaredFields();

            for(Field field : fields) {
               Class type = field.getType();
               String name = field.getName();

               System.out.println(type);
                System.out.println(name);
;            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }



    }


}
