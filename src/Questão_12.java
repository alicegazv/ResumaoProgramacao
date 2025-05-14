import java.util.Scanner;

public class Questão_12 {
    public static void main(String[] args) {
        //Vereficação de voto eleitoral
        Scanner s = new Scanner(System.in);
        System.out.println("Me informe a sua idade:");
        int idade = s.nextInt();

        String mensagem = (idade >= 16) ? "Você pode votar" : "Você não pode votar";
        System.out.println(mensagem);

        s.close();

    }
}
