import java.util.Scanner;

public class Questão_02 {
    public static void main(String[] args) {
        // 2- Leitura de um nome e saudação.
        Scanner s = new Scanner(System.in);
        System.out.println("Me informe o seu nome:");// Lê um texto (nome) digitado pelo usuário
        String nome = s.nextLine();
        System.out.format("Olá, " +nome +"!");// Exibe a saudação com o nome do usuário
        s.close();
    }
}
