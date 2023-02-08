package estruturasControle;

public class EstruturaIF {
    public static void main(String[] args) {
        String nome = "Fernando";
        String senha = "123456";

        if (nome.equals("Fernando") && senha.equals("123456")) {
            System.out.println("Entrou no sistema");
        } else {
            System.out.println("Repita o processo");
        }

        double nota = 7.3;

        if (nota == 10.0) {
            System.out.println("Exelente");
        } else if (nota >= 6.0) {
            System.out.println("Passou de ano");
        }
    }
}
