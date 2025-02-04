package Java.For;
import java.util.Scanner;

public class Ativ_21 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            int soma = 0;

            while (numero > 0) {
                soma += numero % 10;
                numero /= 10;
            }

            System.out.println("A soma dos dígitos é: " + soma);

            scanner.close();
        }
    }