import java.util.Scanner;

public class Questão_17 {
    public static void main(String[] args) {
        //Soma de números inteiros de 1 a N
        Scanner s = new Scanner(System.in);
        System.out.println("Insirar algum valor:");
        int n = s.nextInt(); // o número até onde vai soma
        int soma = 0; //começa a soma do zero

        for (int i = 1; i <= n; i++) { // Vai somando todos os valores de 1 até N
            soma += i; // soma o i atual na variável soma
        }
        System.out.println("Soma final: " + soma); // Mostra o total final

        s.close();
    }
}
