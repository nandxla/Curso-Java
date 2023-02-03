package fundamentos;

import java.util.Scanner;

public class Concole {
	public static void main(String[] args) {
		// testando diferentes tipos de print
		System.out.print("Olá");
		System.out.print(" Mundo! \n");
	
		System.out.println("Olá Mundo");

		String nome = "Fernando";
		int idade = 19;
		System.out.printf("Seu nome é %s e eu tenho %d anos \n", nome, idade);
	
		// criando um scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome1 = entrada.nextLine();  //
		System.out.println(nome1);
	}
}
