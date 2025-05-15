import java.util.Scanner;

public class Questão_13Extra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int soma = 0;

        while (x != 0) { //enquanto essa condição for verdadeira //O operador não é igual a 0
            soma += x; // soma = soma + x;
            x = s.nextInt(); // Você vai enviar número para variavel //
        }
        System.out.println("Finalizo seu progresso com a soma:  " + soma
        ); // Se for não for diferente vai dar falso e pula pra fora do loop
        s.close();
    }
}
