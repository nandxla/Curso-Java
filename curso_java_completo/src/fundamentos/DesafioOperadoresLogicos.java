package fundamentos;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		boolean trabalhoTerca = true;
		boolean trabalhoQuarta = true;
		
		boolean comprouTV50 = trabalhoTerca && trabalhoQuarta;
		boolean comprouTV30 = trabalhoTerca || trabalhoQuarta;
		boolean comprouSorvete = comprouTV50 || comprouTV30;
		boolean ficouEmCasa = !comprouSorvete;
		
		
	}
}
