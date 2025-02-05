package DoWhile;
import java.util.Scanner;
public class Ativ_40 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;
            int contador = 0;

            do {
                System.out.print("Digite um número: ");
                num = sc.nextInt();
                contador++;
            } while (num != 0);

            System.out.println("Você digitou " + (contador - 1) + " números antes de digitar zero.");
            sc.close();
        }
    }