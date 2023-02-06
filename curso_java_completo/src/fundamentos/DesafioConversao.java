package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String numero1 = s.nextLine();
		String numero2 = s.nextLine();
		String numero3 = s.nextLine();
		
		double n1 = Double.parseDouble(numero1);
		double n2 = Double.parseDouble(numero2);
		double n3 = Double.parseDouble(numero3);
		
		double media = (n1 + n2 + n3) / 3;
		
		System.out.printf("A média é %f", media);
		
		s.close();
	}
}
