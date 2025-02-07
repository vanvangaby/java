import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua senha: ");
        String senha = scanner.nextline();

        if (senha.equals("alfa")) {
            System.out.println(x:"Porta aberta");
        } else {
            System.out.println(x:"Porta Fechada");
        }
        scanner.close();

    }
}
