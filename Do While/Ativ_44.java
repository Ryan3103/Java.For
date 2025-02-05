package DoWhile;

import java.util.Scanner;

public class Ativ_44 {

    public static void exibirDivisores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt(), i = 1;
        System.out.print("Divisores de " + num + ": ");
        do {
            if (num % i == 0) System.out.print(i + " ");
            i++;
        } while (i <= num);
        System.out.println();
    }

}