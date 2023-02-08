package fundamentos;

import java.util.Scanner;

public class DesafioFundamentos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite 2 números: ");
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();

        System.out.println("Digite o operador: ");
        String op = s.nextLine();

        double result = op.equals("+") ? n1 + n2 : 0;
        result = op.equals("-") ? n1 - n2 : result;
        result = op.equals("/") ? n1 / n2 : result;
        result = op.equals("*") ? n1 * n2 : result;

        System.out.println(result);
    }
}
