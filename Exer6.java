import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      String time1, time2;
      int GolsTime1, GolsTime2;

      System.out.println("Informe o primeiro time e o numero de gols marcados por ele");
      time1 = in.next();
      GolsTime1 = in.nextInt();

      System.out.println("Informe o segundo time");
      time2 = in.next();
      GolsTime2 = in.nextInt();

      if (GolsTime1 > GolsTime2) {
        System.out.println("O time vencedor foi o " + time1);

      }
      if (GolsTime1 == GolsTime2) {
        System.out.println("O jogo terminou empatado");

      }
      if (GolsTime1 < GolsTime2) {
        System.out.println("O time vencedor foi o " + time2);
        
      }

    }
}
