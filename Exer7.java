import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final float Desconto3 = 0.03f;
        final float Desconto5 = 0.05f;
        final float Desconto4 = 0.04f;
        final float Desconto6 = 0.06f;
        final float PrecoG = 4.3f;
        final float PrecoA = 3.9f;

        int litros;
        System.out.println("Quantos litros foram colocados?");
        litros = in.nextInt();

        String name;

        System.out.println("Informe o combustivel");
        name = in.next();

        if (name.equals("gasolina") && litros <= 20) {
            float preco;
            preco = litros * PrecoG - (litros * PrecoG * Desconto4);
            System.out.println("O preço pago pelo cleinte foi de R$" + preco);

        }
        if (name.equals("gasolina") && litros > 20) {
            float preco;
            preco = litros * PrecoG - (litros * PrecoG *Desconto6);
            System.out.println("O preço pago pelo cleinte foi de R$" + preco);

        }
        if (name.equals("alcool") && litros <= 20) {
            float preco;
            preco = litros * PrecoA - (litros * PrecoA * Desconto3);
            System.out.println("O preço pago pelo cleinte foi de R$" + preco);

        }
        if (name.equals("alcool") && litros > 20) {
            float preco;
            preco = litros * PrecoA - (litros * PrecoA * Desconto5);
            System.out.println("O preço pago pelo cleinte foi de R$" + preco);

        }
    }
}
