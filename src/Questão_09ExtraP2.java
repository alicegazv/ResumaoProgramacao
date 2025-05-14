import java.util.Scanner;

public class Questão_09ExtraP2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double preco = 34.5; // Define um valor fixo
        // Aqui é o mesmo if else só que jeito diferente
        //Usa operador ternário para calcular o desconto: 10% se preço < 20, senão 5%
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        // desconto = (condição) ? (valor se verdadeira) : (valor se falsa)
        System.out.println("O preço e: " + desconto); // exibe o resultado na tela
        s.close();

    }
}
