import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Thalles Rafael");
        listaDeNomes.add("Laura Beatriz");
        listaDeNomes.add("Tattiany Stênia");
        listaDeNomes.add("Gabriel Antônio");
        listaDeNomes.add("Marco Antônio");
        listaDeNomes.add("Miguel Antônio");
        System.out.println("");
        System.out.println("---------Lista Não Ordenada--------");
        System.out.println(listaDeNomes);
        System.out.println("");
        System.out.println("---------Lista Ordenada--------");
        Collections.sort(listaDeNomes);
        System.out.println(listaDeNomes);
        System.out.println("");


    }
}