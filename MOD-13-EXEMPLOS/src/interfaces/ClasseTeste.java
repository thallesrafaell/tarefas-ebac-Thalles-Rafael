package interfaces;

public class ClasseTeste {

    public static void main(String arg []){
        ICaneta caneta = new CanetaEsferografica();
        ICaneta giz = new Giz();
        ICaneta lapis = new Lapis();

        System.out.println("-----------------------");
        caneta.escrever("Olá Thalles ");
        System.out.println(caneta.getCor());
        caneta.escreverComumATodas();
        System.out.println("");

        System.out.println("-----------------------");

        giz.escrever("Thalles");
        System.out.println(giz.getCor());
        giz.escreverComumATodas();
        System.out.println("");

        System.out.println("-----------------------");
        lapis.escrever("Thalles");
        lapis.getCor();
        lapis.escreverComumATodas();
    }
}
