import java.util.Scanner;

public class Questão_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Calcule o preço de um ingresso de cinema
        System.out.println("Me informe a sua idade: "); //// Aqui a gente pede pra pessoa informar a idade dela
        int idade = s.nextInt();

        // Definimos dois valores de ingresso:
        // R$10,00 é o valor com desconto (pra crianças e idosos)
        // R$20,00 é o valor normal
        double valor = 10.00;
        double valor2 = 20.00;

        double ingresso = (idade < 12 || idade > 65) ? valor : valor2;
        //// Se a pessoa tiver menos de 12 anos ou mais de 65, ela paga R$10,00
        //  Caso contrário, paga o valor cheio de R$20,00

        System.out.println("O valor do seu ingresso é: " + ingresso); // Mostra na tela quanto a pessoa vai pagar

        s.close(); //  // Fecha o scanner (boa prática) q eu esqueço
    }
}
