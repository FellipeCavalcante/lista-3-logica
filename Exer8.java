import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String usuario, senha;

        System.out.println("Informe o usuario");
        usuario = in.next();

        if (usuario.equals("teste")) {
            System.out.println("Digite a senha");
            senha = in.next();

            if (senha.equals("1234")) {
                System.out.println("Acesso permitivo");

            } else {
                System.out.println("acesso negado");
            }
        } else {
            System.out.println("acesso negado");
        }
    }
}
