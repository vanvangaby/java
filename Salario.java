import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário: ")
        double salario = scanner.nextDouble();


        if (salario == 3000) {
            System.out.println("Rico!")
        } else { 
            System.out.println("Pobre!")
        }
        scanner.close () ;
    }
}
