import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        System.out.println("Informe os lados do triângulo");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a < b + c && b < a + c && c < a + b) {

            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            }
            else if (a==b || b==c || a==c ) {
                System.out.println("Triângulo isóceles");
            }
            else if {a!=b && a!=c b!=c) {
                System.out.println("Triângulo escaleno");
            }
        }
        else {
            System.out.println("Não é possivel formar um triângulo");
        }

    }
}
