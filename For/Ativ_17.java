package Java.For;
import java.util.Scanner;
import java.util.Scanner;
public class Ativ_17 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();

            scanner.close();

            StringBuilder invertedString = new StringBuilder(input);

            invertedString.reverse();

            System.out.println("String invertida: " + invertedString.toString());
        }
    }