package Ativ_For;

import java.util.Scanner;
public class Ativ_9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe um número para exibir a tabuada: ");
            int numero = scanner.nextInt();

            System.out.println("Tabuada do número " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero * i);
            }
            scanner.close();
        }
    }