import java.util.Scanner;

public class Exer7v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final float Desconto3 = 0.03f;
        final float Desconto5 = 0.05f;
        final float Desconto4 = 0.04f;
        final float Desconto6 = 0.06f;
        final float PrecoG = 4.3f;
        final float PrecoA = 3.9f;

        int A, G;
        System.out.println("Informe a quantidade em litros de alcool ou de gasolina");
        A = in.nextInt();
        G = in.nextInt();

        if (A <=20 && G ==0) {
            float preco;
            preco = A * PrecoA - (A * PrecoA * Desconto3);
            System.out.println("O preço pago foi de R$" + preco);

        }
        if (A > 20 && G ==0) {
            float preco;
            preco = A * PrecoA - (A * PrecoA * Desconto5);
            System.out.println("O preço pago foi de R$" + preco);

        }
         if (A == 0 && G <= 20) {
            float preco;
            preco = G * PrecoG - (G * PrecoG * Desconto4);
            System.out.println("O preço pago foi de R$" + preco);
            
        }
         if (A == 0 && G > 20) {
            float preco;
            preco = G * PrecoG - (G * PrecoG * Desconto6);
            System.out.println("O preço pago foi de R$" + preco);
            
        }
    }
}
