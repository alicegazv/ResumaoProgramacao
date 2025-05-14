import java.util.Scanner;

public class Questão_06 {
    public static void main(String[] args) {
        //  Leitura de um valor em dólares e conversão para reais
        Scanner s = new Scanner(System.in);
        System.out.println("Me informe o valor em dolar:");
        float dolar = s.nextFloat(); //// Lê o valor digitado em dólar (formato decimal)

        float reais = dolar * 5.25F; // // Converte o valor para reais, utilizando uma taxa de câmbio fixa de 5.25
        // Obs: o "F" é necessário porque 5.25 é um número decimal literal,
        // e queremos que ele seja do tipo float (por padrão, números decimais são double).
        // Diferente da Questão 01, onde o tipo float foi definido na variável, aqui precisamos especificar no valor

        System.out.println("Em dólar US$" + dolar + " Em Reais R$" + reais); //// Exibe o valor convertido

        s.close(); // Fecha o Scanner para liberar os recursos
    }
}
