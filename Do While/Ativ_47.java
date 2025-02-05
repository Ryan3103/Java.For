package DoWhile;

import java.util.Scanner;

public class Ativ_47 {
    public static void verificarPrimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt(), i = 2;
        boolean ehPrimo = num >= 2;
        do {
            if (num % i == 0 && i != num) {
                ehPrimo = false;
                break;
            }
            i++;
        } while (i * i <= num);
        System.out.println(num + (ehPrimo ? " é primo" : " não é primo"));
    }

}