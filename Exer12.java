import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int NumeroDeLados;
        System.out.println("Informe o número de lados");
        NumeroDeLados = in.nextInt();

        if (NumeroDeLados == 3) {
            float Lado1, Lado2, Lado3, Perimetro;
            System.out.println("Informe o valor dos lados do triângulo em cm");
            Lado1 = in.nextFloat();
            Lado2 = in.nextFloat();
            Lado3 = in.nextFloat();

            Perimetro = Lado1 + Lado2 + Lado3;
            System.out.println("O perimetro do triângulo é " + Perimetro + "cm");

        }
        if (NumeroDeLados == 4) {
            float Lado1, area;
            System.out.println("Informe o valor dos lados do quadrado em cm");
            Lado1 = in.nextFloat();
           
            area = Lado1 * Lado1;
            System.out.println("A area do quadrado é " + area + "cm");
            
        }
        if (NumeroDeLados == 5) {
            
            System.out.println("O polígono é um pentágono");
    
        }
        if (NumeroDeLados < 3) {
            System.out.println("Não é um polígono");

        }
        if (NumeroDeLados > 5) {
            System.out.println("Polígono não identificado");

        }
    
    
    
    }
}
    

