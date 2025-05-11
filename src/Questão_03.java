import java.util.Scanner;

public class Questão_03 {
    public static void main(String[] args) {
        //Leitura de idade e impressão da categoria
        Scanner s = new Scanner(System.in);
        System.out.println("Me informe a sua idade:");
        int idade = s.nextInt();

        if (idade >= 50  ){ // Uma condição que verifica se a variavel idade é verdadeira ou seja se a idade é maior ou igual a 50 anos
            System.out.println("Você é um Idoso");
        }  else if (idade <= 18) {  // Se a primeira condição for falsa, verifica se a idade é menor ou igual a 18
            System.out.println("Você é Menor de idade");
        }else { // Se nenhuma das anteriores for verdadeira, a pessoa é adulta (entre 19 e 49 anos)
            System.out.println("Você um Adulto");
        }
        s.close();
    }
}
