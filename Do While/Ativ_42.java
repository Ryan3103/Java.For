package DoWhile;
import java.util.Scanner;
public class Ativ_42 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();
            int i = input.length() - 1;

            do {
                System.out.print(input.charAt(i));
                i--;
            } while (i >= 0);

            scanner.close();
        }
    }