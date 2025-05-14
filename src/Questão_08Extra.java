import java.util.Scanner;

public class Questão_08Extra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Aqui é para quando usuario selecionar um número de um até 7 ele receber o dia da semana
        int x = s.nextInt();
        String dia;

        if (x == 1) {     // Aqui varias condições compostas
            dia = "domingo";
        } else if (x == 2) {
            dia = "segunda";
        } else if (x == 3) {
            dia = "terca";
        } else if (x == 4) {
            dia = "quarta";
        } else if (x == 5) {
            dia = "quinta";
        } else if (x == 6) {
            dia = "sexta";
        } else if (x == 7) {
            dia = "sabado";
        } else {
            dia = "valor invalido"; // aqui é para quando o valor não é de 1 até 7
        }
        System.out.println("Dia da semana: " + dia);
        s.close();

    }
}
