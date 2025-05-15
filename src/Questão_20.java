import java.util.Scanner;

public class Questão_20 {
    public static void main(String[] args) {
     // Substituir uma palavra em um texto
        Scanner s = new Scanner(System.in);
        System.out.println("Inserir o texto:");
        String texto = s.nextLine(); // recebe o texto completo

        System.out.print("Palavra a ser substituída: ");
        String antiga = s.nextLine(); // palavra que vai sair

        System.out.print("Nova palavra: ");
        String nova = s.nextLine(); // palavra que vai entrar no lugar

        //faz a substituição replace
        String novoTexto = texto.replace(antiga, nova);

        System.out.println("Texto atualizado: " + novoTexto);


        s.close();
    }

}
