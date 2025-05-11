import java.util.Scanner; /*Está localizada no pacote java.util, então é necessário importá-la no início do programa.*/

public class Questão_01 {
    public static void main(String[] args) {
        // Leitura de dois números e cálculo da soma
        Scanner s = new Scanner(System.in); // Cria uma ferramenta para ler dados do teclado (s é um apelido, pode mudar)

        System.out.println("Me informe o primeiro número:"); // Exibe uma mensagem pedindo entrada
        float num1 = s.nextFloat(); // Lê um número decimal digitado pelo usuário

        System.out.println("Me informe o segundo número:"); // Exibe outra mensagem pedindo entrada
        float num2 = s.nextFloat(); // Lê outro número decimal digitado pelo usuário

        float soma = num1 + num2; // Calcula a soma dos dois números

        System.out.println("A soma dos dois números é: " + soma); // Exibe o resultado na tela

        s.close(); // Fecha a ferramenta Scanner para liberar recursos
    }
}
