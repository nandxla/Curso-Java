package estruturasControle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escreva o dia da semana");
        String diaSemana = s.nextLine(); 
        diaSemana = diaSemana.toLowerCase();
        int numeroSemana = 0;

        if (diaSemana.equals("domingo")) {
            numeroSemana = 1;
        } else if (diaSemana.equals("segunda")) {
            numeroSemana = 2;
        } else if (diaSemana.equals("terça")) {
            numeroSemana = 3;
        } else if (diaSemana.equals("quarta")) {
            numeroSemana = 4;
        } else if (diaSemana.equals("quinta")) {
            numeroSemana = 5;
        } else if (diaSemana.equals("sexta")) {
            numeroSemana = 6;
        } else {
            numeroSemana = 7;
        }

        System.out.printf("O dia da semana é %s e o seu número é %d \n", diaSemana, numeroSemana);

        s.close();
    }
}
