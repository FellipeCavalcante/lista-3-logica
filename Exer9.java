import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nota1, nota2;
        System.out.println("Informe as duas notas do aluno");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        String optativa;
        System.out.println("O aluno fez a avaliação optativa?");
        optativa = in.next();

        if (optativa.equals("n")) {
            float media;
            media = (nota1 + nota2) / 2f;

            if (media >= 6) {
                System.out.println("Aprovado");

            }
            if (media >= 3 && media < 6) {
                System.out.println("Exame");

            }
            if (media < 3) {
                System.out.println("Reprovado");

            }

        }

        if (optativa.equals("s")) {
            float nota3;
            System.out.println("Informe a nota da avaliação optativa");
            nota3 = in.nextFloat();

            if (nota3 >= nota2 && nota3 <= nota1) {
                float media;
                media = (nota1 + nota3) / 2f;

                if (media >= 6) {
                    System.out.println("Aprovado");
                }
                if (media >= 3 && media < 6) {
                    System.out.println("Exame");

                }
                if (media < 3) {
                    System.out.println("Reprovado");
                }
            }
            if (nota3 >= nota1 && nota3 <= nota2) {
                float media;
                media = (nota2 + nota3) / 2f;

                if (media >= 6) {
                    System.out.println("Aprovado");
                }
                if (media >= 3 && media < 6) {
                    System.out.println("Exame");

                }
                if (media < 3) {
                    System.out.println("Reprovado");
                }
            }
            if (nota3 <= nota2 && nota3 <= nota1) {
                float media;
                media = (nota1 + nota2) / 2f;

                if (media >= 6) {
                    System.out.println("Aprovado");
                }
                if (media >= 3 && media < 6) {
                    System.out.println("Exame");

                }
                if (media < 3) {
                    System.out.println("Reprovado");
                }
            }
            if (nota3 >= nota2 && nota3 >= nota1 && nota1 >= nota2) {
                float media;
                media = (nota1 + nota3) / 2f;

                if (media >= 6) {
                    System.out.println("Aprovado");
                }
                if (media >= 3 && media < 6) {
                    System.out.println("Exame");

                }
                if (media < 3) {
                    System.out.println("Reprovado");
                }
            }
            if (nota3 > nota2 && nota3 > nota1 && nota2 > nota1) {
                float media;
                media = (nota2 + nota3) / 2f;

                if (media >= 6) {
                    System.out.println("Aprovado");
                }
                if (media >= 3 && media < 6) {
                    System.out.println("Exame");

                }
                if (media < 3) {
                    System.out.println("Reprovado");
                }
            }
            if(nota3 == nota2 && nota3 == nota1 && nota1 == nota2) {
                float media;
                media = (nota1 + nota2) / 2f;
                
                if (media >= 6) {
                    System.out.println("Aprovado");
                }
                if (media >=3 && media < 6) {
                    System.out.println("Exame");

                }
                if (media < 3) {
                    System.out.println("Reprovado");
                }
            }

        }
    }
}
