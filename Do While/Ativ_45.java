package DoWhile;

import java.util.Scanner;

public class Ativ_45 {
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor máximo: ");
        int max = scanner.nextInt(), a = 0, b = 1, temp;
        System.out.print("Sequência de Fibonacci: " + a + " " + b + " ");
        do {
            temp = a + b;
            if (temp > max) break;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        } while (true);
        System.out.println();
    }
}