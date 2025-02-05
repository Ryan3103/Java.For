package DoWhile;
import java.util.Scanner;
public class Ativ_35 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número para ver sua tabuada: ");
            int num = scanner.nextInt();
            int i = 1;

            do {
                System.out.println(num + " x " + i + " = " + (num * i));
                i++;
            } while (i <= 10);

            scanner.close();
        }
    }