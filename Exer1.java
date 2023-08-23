import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;
        System.out.println("Informe um valor");
        valor = in.nextInt();

        if (valor > 0) {
            System.out.println("O valor é positivo");

        } else if (valor < 0 ) {
            System.out.println("O valor é negativo"); 

        } else if (valor == 0) {
            System.out.println("O valor é zero");
        }
        
    }
}