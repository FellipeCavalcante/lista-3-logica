import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("Informe o valor 1");
        valor1 = in.nextInt();

        System.out.println("Informe o valor 2");
        valor2 = in.nextInt();

        System.out.println("Informe o valor 3");
        valor3 = in.nextInt();

        
        if (valor1 > valor2 && valor2 > valor3 ) {
            System.out.println("O maior valor é " + valor1);

        } else if (valor1 > valor3 && valor3 > valor2) {
            System.out.println("O maior valor é " + valor1);

        } else if (valor2 > valor1 && valor1 > valor3) {
            System.out.println("O maior valor é " + valor2);

        } else if (valor2 > valor3 && valor3 > valor1) {
            System.out.println("O maior valor é " + valor2);

        } else if (valor3 > valor1 && valor1 > valor2) {
            System.out.println("O maior valor é " + valor3);

        } else if (valor3 > valor2 && valor2 > valor1) {
            System.out.println("O maior valor é " + valor3);
        }

    }
}
