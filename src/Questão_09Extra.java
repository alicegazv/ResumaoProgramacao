import java.util.Scanner;

public class Questão_09Extra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double preco = 34.5;  // Valor de uma variavel definido
        double desconto;

        if (preco < 20.0) { // aqui aplica uma condição se o preço for menor 20 desconto 0.1;
            desconto = preco * 0.1;
        } else { // Se anterior n for verdadeira aqui aplica um desconto de 0.05
            desconto = preco * 0.05;
        }

        System.out.println("O preço e: " + desconto); // exibe na tela o resultado
        s.close();
    }
}
