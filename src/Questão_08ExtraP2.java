import java.util.Scanner;

public class Questão_08ExtraP2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// cria um scanner pra ler o que o usuário digitar
        int x = s.nextInt();//lê um número inteiro digitado
        String dia;  // variável que vai guardar o nome do dia

        switch (x) {// // verifica o valor de x e escolhe o dia da semana correspondente
            case 1:// cria um scanner pra ler o que o usuário digitar
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default: //se o número não for de 1 a 7, mostra que é inválido
                dia = "valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);// mostra o resultado pro usuário
        s.close();
    }
}

