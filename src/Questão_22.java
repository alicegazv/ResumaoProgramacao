import java.util.Scanner;

public class Questão_22 {
    public static void main(String[] args) {
        //Verificar se uma string contém outra
        Scanner  s = new Scanner(System.in);
        System.out.print("Digite a string principal: ");
        String principal = s.nextLine(); // texto onde vamos procurar

        System.out.print("Digite a string que você quer procurar: ");
        String procura = s.nextLine(); // o que estamos procurando


        if (principal.contains(procura)) {// agora vamos verificar se a principal contém a palavra procurada
            System.out.println("A string contém a substring.");
        } else {
            System.out.println("A string NÃO contém a substring.");
        }

        s.close();
    }
}
