import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sexo;
        System.out.println("Informe o sexo como 1 para feminino e 2 para masculino");
        sexo = in.next();

        if (sexo.equals("1")) {
            float PesoIdeal, peso;
            System.out.println("Informe a altura");
            peso = in.nextFloat();

            PesoIdeal = (62.1f * peso) - 44.7f;
            System.out.println("O peso ideal é Kg" + PesoIdeal);

        }
        if (sexo.equals("2")) {
            float PesoIdeal, peso;
            System.out.println("Informe a altura");
            peso = in.nextFloat();

            PesoIdeal = (72.7f * peso) - 58f;
            System.out.println("O peso ideal é Kg" + PesoIdeal);

        }

    }
}
