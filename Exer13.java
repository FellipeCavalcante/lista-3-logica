import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        System.out.println("Iforme o nome do produto");
        nome = in.next();

        int QuantComprada;
        System.out.println("Informe a quantidade adquirida");
        QuantComprada = in.nextInt();

        float ValorUni;
        System.out.println("Informe o valor unitario em R$");
        ValorUni = in.nextFloat();

        float total;
        total = QuantComprada * ValorUni;

        if (QuantComprada <= 5) {
            final float Desconto = 0.02f;
            float PrecoDesc, PrecoFinal;
            PrecoDesc = total * Desconto;
            PrecoFinal = total - PrecoDesc;
            System.out.println("O valor final da compra do " + nome + " é de R$" + PrecoFinal);

        }

        if (QuantComprada > 5 && QuantComprada <= 10) {
            final float Desconto = 0.03f;
            float PrecoDesc, PrecoFinal;
            PrecoDesc = total * Desconto;
            PrecoFinal = total - PrecoDesc;
            System.out.println("O valor final da compra do " + nome + " é de R$" + PrecoFinal);

        }

        if (QuantComprada > 10) {
            final float Desconto = 0.05f;
            float PrecoDesc, PrecoFinal;
            PrecoDesc = total * Desconto;
            PrecoFinal = total - PrecoDesc;
            System.out.println("O valor final da compra do " + nome + " é de R$" + PrecoFinal);

        }

    }
}
