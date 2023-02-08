package estruturasControle;

public class BreakContinue {
    public static void main(String[] args) {
        String instrumento = "guitarra";
        
        switch (instrumento.toLowerCase()) {
            case "guitarra":
                System.out.println("faz um solo");
                break;
        
            case "teclado":
                System.out.println("faz uma harmonia");
                break;
        
            case "violão":
                System.out.println("faz a base");
                break;
        
            default:
                break;
        }
    }
}
