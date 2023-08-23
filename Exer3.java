import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("Informe o valor 1");
        valor1 = in.nextInt();

        System.out.println("Informe o valor 2");
        valor2 = in.nextInt();

        System.out.println("Informe o valor 3");
        valor3 = in.nextInt();

        if (valor1 > valor2 && valor2 > valor3) {
            int result;
            result = valor1 + valor2;
            System.out.println("A soma é " + result);

        } else if (valor1 > valor3 && valor3 > valor2) {
            int result;
            result = valor1 + valor3;
            System.out.println("O resultado é " + result);

        } else if (valor3 > valor2 && valor2 > valor1) {
            int result;
            result = valor3 + valor2;
            System.out.println("O resultado é " + result);

        } else if (valor3 > valor1 && valor1 > valor2) {
            int result;
            result = valor3 + valor1;
            System.out.println("O resultado é " + result);

        } else if (valor2 > valor1 && valor1 > valor3) {
            int result;
            result = valor2 + valor1;
            System.out.println("O resultado é " + result);

        } else if (valor2 > valor3 && valor3 > valor1) {
            int result;
            result = valor2 + valor3;
            System.out.println("O resultado é " + result);
            
        }

    }
}
