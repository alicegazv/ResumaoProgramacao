import java.util.Scanner;

public class Questão_11 {
    public static void main(String[] args) {
        //Achar o maior de quatro números

        Scanner s = new Scanner(System.in);
        // Pede pro usuário digitar o primeiro número
        System.out.println("Me informe o 1 número:");
        int num1 = s.nextInt();
        // Agora o segundo número
        System.out.println("Me informe o 2 número:");
        int num2 = s.nextInt();
        int maior;

        // Aqui a gente compara os dois números
        if (num1 >= num2) { //num1 for maior, ele mostra num1.
            maior = num1;
            System.out.println("Esse é o maior números: " + maior);
        } else if (num2 >= num1) { //Se num2 for maior, mostra num2.
            maior = num2;
            System.out.println("Esse é o maior número: " + maior);
        } else {
            System.out.println("Digite outros numero.");//Se forem iguais, ele avisa isso também.
        }

        s.close(); //// Fecha o scanner (só por boas práticas mesmo)
    }
}
