import java.util.Scanner;

public class Questão_21 {
    public static void main(String[] args) {

        // Invertendo a ordem dos caracteres de uma palavra
        Scanner s = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = s.nextLine();

        String invertida = ""; // variável que vai guardar a palavra ao contrário

        //  agora a gente começa de trás pra frente
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i); // vai juntando as letras de trás pra frente
        }

        System.out.println("Palavra invertida: " + invertida); // exibe o resultado

        s.close();

    }
}
