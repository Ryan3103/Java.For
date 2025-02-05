package DoWhile;
import java.util.Scanner;
public class Ativ_39 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;

            do {
                System.out.print("Digite um número: ");
                num = sc.nextInt();
                if (num >= 0) {
                    System.out.println("Número positivo: " + num);
                }
            } while (num >= 0);

            System.out.println("Você digitou um número negativo. Fim.");
            sc.close();
        }
    }