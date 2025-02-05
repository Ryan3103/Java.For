package DoWhile;
import java.util.Scanner;
public class Ativ_43 {

        public static void somaDigitos() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int num = scanner.nextInt(), soma = 0;
            do {
                soma += num % 10;
                num /= 10;
            } while (num > 0);
            System.out.println("Soma dos dígitos: " + soma);
        }
}