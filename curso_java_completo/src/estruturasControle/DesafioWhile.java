package estruturasControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        
        double somatorioNotas = 0;
        int qtdRegistros = 0;
        boolean controle = true;

        while(controle) {
            System.out.println("Digite a nota do aluno: ");
        
            double nota = s.nextDouble();

            if(nota == -1) {
                controle = false;
            }

            somatorioNotas += nota;
            qtdRegistros++;
        }

        double media = somatorioNotas / (double) qtdRegistros;
        
        System.out.printf("Sua média foi de %f \n", media);

        s.close();
    }
}
