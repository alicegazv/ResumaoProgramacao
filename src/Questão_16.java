import java.util.Scanner;

public class Questão_16 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = s.nextInt(); // le o número e guarda na variável

        System.out.println("Tabuada do " + num + " de 10 até 1:");

        for (int i = 10; i >= 1; i--) { // Aqui a gente começa o contador i no 10 e vai diminuindo até chegar em 1
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        s.close(); // Fecha o Scanner (boa prática)
    }

}
