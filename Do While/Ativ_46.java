package DoWhile;

import java.util.Scanner;

public class Ativ_46 {
    public static void multiplos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt(), i = 1;
        System.out.print("Os 10 primeiros múltiplos de " + num + ": ");
        do {
            System.out.print((num * i) + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }
}