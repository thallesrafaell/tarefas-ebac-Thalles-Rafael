import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        Integer idadeWrapper = idade;
        System.out.println("Legal sua idade é " + idadeWrapper + " a minha é 26.");


    }

}