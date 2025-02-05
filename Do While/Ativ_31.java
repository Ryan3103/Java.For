package DoWhile;

import java.util.Scanner;

public class Ativ_31 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num;

            do {
                System.out.print("Digite um número: ");
                num = sc.nextInt();
            } while (num >= 0);

            System.out.println("Você digitou um número negativo.");
            sc.close();
        }
    }