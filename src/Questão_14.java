import java.util.Scanner;

public class Questão_14 {
    public static void main(String[] args) {
        //14.	Calcular a soma dos primeiros N números inteiros divisíveis por 3
        Scanner s = new Scanner(System.in);

        System.out.println("Digite algumas valor:");
        int n = s.nextInt();

        int i= 0; // quantos numeros divisiveis por 3
        int num = 1; //verifica do numero 1 em diante
        int soma = 0; // aqui guarda a soma

        while (i < n ) { // enqunato não achamos o n dividimos por 3
            if(num % 3 == 0){ // se for divisivel por 3
                soma += num; // adiciona a soma com os numeros divisiveis por 3
                i++; // conta os numeros encontrados
            } num++; // vai para o proximo numero
        }
        System.out.println("Soma dos " +  n + "Numéros divisiveis por 3: " + soma );
    }
}
