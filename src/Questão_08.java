import java.util.Scanner;

public class Questão_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Verificação de número positivo,negativo ou zero
        System.out.println("Me informe um número:"); //
        float number = s.nextFloat();

        if (number < 0) { // Se o numero for menor que 0
            System.out.println("Seu número é negativo"); // Exibe essa mensagem
        } else if (number == 0) { // Se for igual identico a 0
            System.out.println("Seu número é o 0 kkkk"); //Exibe essa mensagem
        } else { // Se todas as condições forem falsas vai exibir essa mensagem que no caso informa que os numeroo são positivos.
            System.out.println("Seu número é positivo");
        }
    }
}
