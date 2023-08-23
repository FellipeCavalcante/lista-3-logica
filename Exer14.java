import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nota1, nota2, nota3, media;
        System.out.println("Informe as 3 notas do aluno");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        nota3 = in.nextFloat();

        media = (nota1 + nota2 + nota3) / 3f;

        if (media >= 9) {
            System.out.println("Conceito: A");

        }
        
        if (media >= 7.5 && media < 9) {
            System.out.println("Conceito: B");
            
        }
        
        if (media >= 6 && media < 7.5) {
            System.out.println("Conceito: C");
            
        }
        
        if (media < 6) {
            System.out.println("Conceito: D");
            
        }
    }
}
