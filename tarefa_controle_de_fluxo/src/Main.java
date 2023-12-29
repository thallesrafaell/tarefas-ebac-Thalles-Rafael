import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float mediaFinal;
        System.out.println("Vamos calcular as nota:");
        System.out.println("-----------------------------");
        System.out.println("Qual a nota de Português?");
        float notaPortugues = scanner.nextFloat();
        System.out.println("Qual a nota de Matemática?");
        float notaMatematica = scanner.nextFloat();
        System.out.println("Qual a nota de Geografia?");
        float notaGeografia = scanner.nextFloat();
        System.out.println("Qual a nota de História?");
        float notaHistoria = scanner.nextFloat();
        System.out.println("-----------------------------");
        mediaFinal = media(notaPortugues, notaMatematica, notaGeografia, notaHistoria);

        if(mediaFinal >= 7) {

            System.out.println("O aluno foi aprovado com a média: " + mediaFinal + ".");
            System.out.println("As notas do aluno foram:");
            System.out.println("A nota de Português foi de: " + notaPortugues + ".");
            System.out.println("A nota de Matemática foi de: " + notaMatematica + ".");
            System.out.println("A nota de Geografia foi de: " + notaGeografia + ".");
            System.out.println("A nota de História foi de: " + notaHistoria + ".");
            System.out.println("-----------------------------");
            System.out.println("Até mais!");

        } else if (mediaFinal >= 5 && mediaFinal <= 7) {

            System.out.println("O aluno ficou de recuperação com a média: " + mediaFinal + ".");
            System.out.println("As notas do aluno foram:");
            System.out.println("A nota de Português foi de: " + notaPortugues + ".");
            System.out.println("A nota de Matemática foi de: " + notaMatematica + ".");
            System.out.println("A nota de Geografia foi de: " + notaGeografia + ".");
            System.out.println("A nota de História foi de: " + notaHistoria + ".");
            System.out.println("-----------------------------");
            System.out.println("Até mais!");
        } else if (mediaFinal < 5) {
            System.out.println("O aluno foi reprovado com a média: " + mediaFinal + ".");
            System.out.println("As notas do aluno foram:");
            System.out.println("A nota de Português foi de: " + notaPortugues + ".");
            System.out.println("A nota de Matemática foi de: " + notaMatematica + ".");
            System.out.println("A nota de Geografia foi de: " + notaGeografia + ".");
            System.out.println("A nota de História foi de: " + notaHistoria + ".");
            System.out.println("-----------------------------");
            System.out.println("Até mais!");
        }

    }


    static float media(float nota1, float nota2, float nota3, float nota4) {
        float somaDasNotas = nota1 + nota2 + nota3 + nota4;
        float media = somaDasNotas / 4;
        return media;


    }

}