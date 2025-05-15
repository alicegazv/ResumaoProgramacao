import java.util.Scanner;

public class Questão_19 {
    public static void main(String[] args) {
        // Contar p número de ocorrências de uma letra em uma palavra

        Scanner s = new Scanner(System.in);
        System.out.println("Digita alguam palavra:");
        String palavra = s.nextLine();

        System.out.println("Me informa a palavra que você quer q conte a letras:");
        char letra = s.nextLine().charAt(0); // aqui pega só a primeira letra que o cara digitou

        int cont = 0; // começa o contador em 0


        for (int i = 0; i < palavra.length(); i++) { // agora vamos passar por cada letra da palavra
            if (palavra.charAt(i) == letra) {
                cont++; // se for igual, soma 1 no contador
            }
        }
        // mostra o resultado final
        System.out.println("A letra '" + letra + "' aparece " + cont + " vezes.");

        s.close();
    }
}
