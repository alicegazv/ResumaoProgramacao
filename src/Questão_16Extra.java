import java.util.Scanner;

public class Questão_16Extra {
    public static void main(String[] args) {
        // Imprimir a tabuada de um número,iniciando no maior valor até o menor
        Scanner s = new Scanner(System.in);
        System.out.println("Me informa alguma valor:");
        int num = s.nextInt(); // pega o número pra fazer a tabuada

        for (int i = 1; i <= 10; i++) { //Vai do 1 até o 10 e monta a tabuada do número
            System.out.println(i + " x " + num + " = " + (i * num)); //Mostra algo tipo: 1 x 5 = 5
        }
        s.close(); //fecha o scanner
    }

}
