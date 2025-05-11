import java.util.Scanner;

public class Questão_04 {
    public static void main(String[] args) {
        //Entrada de dois números e calculo da diferença
        Scanner s = new Scanner(System.in);

        System.out.println("Me informe o primeiro número:");
        int num1 = s.nextInt(); //  Primeiro número (minuendo)
        System.out.println("Me informe o segundo número:");
        int num2 = s.nextInt(); // Segundo número (subtraendo)

        if ( num1 < num2) {  // Se o primeiro número for menor, calcula a diferença positiva
            int diferencaM = num2 - num1;
            System.out.println("A diferença do dois números: " + diferencaM );
        } else if (num1 > num2) {   // Se o primeiro número for maior, também calcula a diferença positiva da ordem
            int diferencaN = num1 - num2;
            System.out.println("A diferença do dois números:" + diferencaN);
        } else { // Se não falar nenhuma valor ou diexar de digitar algum valor
            System.out.println("Digite algum valor , por favor.");
        }
        s.close();
 // Eu poderia deixar somente a 1 opção para exibir a diferença em números negativos mas prefiro assim, mostrando sempre em valor positivo. :)
    }
}
