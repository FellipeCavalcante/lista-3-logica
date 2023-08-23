import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        System.out.println("Informe o valor a");
        a = in.nextInt();

        System.out.println("Informe o valor b");
        b = in.nextInt();

        System.out.println("Informe o valor c");
        c = in.nextInt();

        if (a + b > c && c + b > a && a + c > b) {
            System.out.println("Forma um triângulo");

        }
        if (a + b < c && c + b > a && a + c > b) {
            System.out.println("Não forma um triângulo"); 
        
        }
        if (a + b > c && c + b < a && a + c > b) {
            System.out.println("Não forma um triângulo"); 
        
        }
        if (a + b > c && c + b > a && a + c < b) {
            System.out.println("Forma um triângulo"); 
        
        }

    }
}
