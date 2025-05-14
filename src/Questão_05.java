import java.util.Scanner;

public class Questão_05 {
    public static void main(String[] args) {
        // Leitura de um número e verificação se é par ou ímpar

        Scanner s = new Scanner(System.in);
        System.out.println("Me informe o primeiro número:");
        int num1 = s.nextInt(); // Lê um número  digitado pelo usuário


        if (num1 % 2 == 0) { // se o resto do numero for exatamente  0 ele é par
            System.out.println("Numéro: " + num1 + " é par"); // Exibe o número se for par
        } else {
            System.out.println("Numéro: " + num1 + " é ímpar");// Exibe o número se for ímpar
        }
        s.close();


    }
}
