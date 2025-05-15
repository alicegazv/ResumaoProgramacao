import java.util.Scanner;

public class Questão_23 {
    public static void main(String[] args) {
        //Remover espaços extras de uma string
        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma frase com espaços extras:");
        String frase = s.nextLine();

        // primeiro usamos o trim pra tirar espaços do começo e do fim
        // depois o replaceAll pra trocar múltiplos espaços por apenas 1
        String fraseLimpa = frase.trim().replaceAll("\\s+", " ");

        // mostra a frase limpinha
        System.out.println("Frase corrigida:");
        System.out.println(fraseLimpa);

        s.close();
    }
}
