package Java.For;
import java.util.Scanner;

public class Ativ_18 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite uma string: ");
                String input = scanner.nextLine();

                String original = input.replaceAll("\\s+", "").toLowerCase();

                String reversed = new StringBuilder(original).reverse().toString();

                if (original.equals(reversed)) {
                    System.out.println("A string é um palíndromo.");
                } else {
                    System.out.println("A string NÃO é um palíndromo.");
                }

                scanner.close();
            }
        }