import java.util.Scanner;

public class Exer10v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sexo;
        System.out.println("Informe o sexo como 1 para feminino e 2 para masculino");
        sexo = in.nextInt();

        if (sexo == 1) {
            float PesoIdeal, peso;
            System.out.println("Informe a altura");
            peso = in.nextFloat();

            PesoIdeal = (62.1f * peso) - 44.7f;
            System.out.println("O peso ideal é Kg" + PesoIdeal);

        }
        if (sexo == 2) {
            float PesoIdeal, peso;
            System.out.println("Informe a altura");
            peso = in.nextFloat();

            PesoIdeal = (72.7f * peso) - 58f;
            System.out.println("O peso ideal é Kg" + PesoIdeal);

        }

    }
}

