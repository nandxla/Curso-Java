package fundamentos;

public class ConversaoTipos {
	public static void main(String[] args) {
		double a = 1.32432;
		System.out.println(a);
		
		int b = (int) a;
		System.out.println(b);
		
		String numero1 = "10.10";
		String numero2 = "20.31";
		
		double n1 = Double.parseDouble(numero1);
		double n2 = Double.parseDouble(numero2);
		
		System.out.println(n1 + n2);
	}
}
