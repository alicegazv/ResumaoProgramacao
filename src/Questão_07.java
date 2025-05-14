import java.util.Scanner;

public class Questão_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Verificação de maioridade
        System.out.println("Me informe a sua idade:");
        int idade = s.nextInt();

        if (idade > 18) {  // Se a idade entrada na idade for maior
            System.out.println("Você é de maior"); // Vai exibir essa mensagem
        } else { // Se não for vai ser exibir essa mensagem
            System.out.println("Você não é de maior");
        }

    }
}
