import java.util.Scanner;

public class Questão_09 {
    public static void main(String[] args) {
        //Verificação de número par ou ímpar;

        Scanner s = new Scanner(System.in);
        System.out.println("Me informe um número:");
        int num = s.nextInt(); // melhor usar int para par/ímpar

        // Verifica se o número é par usando o operador %
        String vereficação = (num % 2 == 0) ? "Seu número é par" : "Seu número é  impar";
        // verificação = (condição) ? (valor se verdadeira) : (valor se falsa)
        System.out.println(vereficação); // Mostra o resultado

        s.close(); // fecha o scanner
    }
}
