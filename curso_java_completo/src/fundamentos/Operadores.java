package fundamentos;

public class Operadores {
	public static void main(String[] args) {
		// unário
		int a = 0;
		a++;
		a++;
		
		System.out.println(a);
		
		// binário
		int b = 10;
		int c = 39;
		double d = 1.31;
		
		System.out.println(b + c);
		System.out.println(b - c);
		System.out.println(b * c);
		System.out.println(b / c);
		
		System.out.println(d / (double) b);
		
		// lógicos
		boolean c1 = true;
		boolean c2 = false;
		
		System.out.println(c1 && c2);
		System.out.println(c1 || c2);
		System.out.println(!c1);
		
		// relacionais 
		System.out.println(10 >= 2);
		System.out.println(2 == 4);
		System.out.println(5 <= 10);
		
		
		// ternário
		double media = 8.9;
		String status = media >= 6.0 ? "Aprovado" : "Reprovado";
		
		System.out.println(status);
		
	}
}
