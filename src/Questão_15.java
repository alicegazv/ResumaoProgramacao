import java.util.Scanner;

public class Questão_15 {
    public static void main(String[] args) {
        //Contagem de números pares e ímpares, negativos e positivos

        Scanner s = new Scanner(System.in);
        int pares = 0, impares = 0, positivos = 0, negativos = 0, i = 0;
        // Criando os contadores e começando tudo em 0


        do {
            System.out.println("Digite um número: ");
            int num = s.nextInt(); // pega o número do usuário

            //Se for par, soma 1 no contador de pares. Se não, soma em ímpares
            pares += (num % 2 == 0) ? 1 : 0;
            impares += (num % 2 != 0) ? 1 : 0;
            //Se for positivo, soma no contador de positivos. Se for negativo, no de negativos
            positivos += (num > 0) ? 1 : 0;
            negativos += (num < 0) ? 1 : 0;

            i++; // soma +1 no contador pra gente saber quantos já foram digitados


        } while (i < 10); // // Vai repetir esse bloco 10 vezes

        System.out.println("\nResultado final " + "pares: " + pares + " impares: " + impares + " positivos: " + positivos + " negativos: " + negativos);
        //Mostra o resultado geral

        s.close(); // fecha o scanner pra não dar vazamento de recurso
    }
}
