import java.util.Scanner;

public class Questão_07Extra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Ler a quantidade de minutos usados
        int minutos = s.nextInt();

        double conta = 50.0; // define um valor base
        if (minutos > 100) { // Adiciono 2,00 a cada minutos acima de 100
            conta += (minutos - 100) * 2.0;
            // conta = conta + (minutos -100) * 2.0


        }  //Exibe o valor da conta em formato com duas casas decimais
        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        s.close();
    }
}
