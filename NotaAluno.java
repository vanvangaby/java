import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.print("Aprovado!")    
        } else {
         System.out.print("Reprovado!")
        }

        scanner.close () ;
    }
}
