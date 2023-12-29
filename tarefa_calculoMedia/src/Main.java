public class Main {
    public static void main(String[] args) {
        System.out.println("*******************************************");
        System.out.println("Olá, esta é minha tarefa referente módulo 8:");
        System.out.println(" ");
        calculoMedia();
        System.out.println("Até mais! :)");
        System.out.println("*******************************************");
    }

    public static void calculoMedia(){
        int notaPortugues = 8;
        int notaMatematica = 6;
        int notaGeografia = 8;
        int notaHistoria = 10 ;

        int somaDasNotas = notaPortugues + notaMatematica + notaGeografia + notaHistoria;
        int mediaDAsNotas = somaDasNotas / 4;

        System.out.println("A nota de Português é " + notaPortugues + ".");
        System.out.println("A nota de Matemática é " + notaMatematica + ".");
        System.out.println("A nota de Geografia é " + notaGeografia + ".");
        System.out.println("A nota de História é " + notaHistoria + ".");
        System.out.println(" ");
        System.out.println("A média das notas é " + mediaDAsNotas + ".");
        System.out.println(" ");
    }
}