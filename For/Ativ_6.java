package Ativ_For;

public class Ativ_6 {
    public static void main(String[] args) {
        int soma = 0;
        System.out.println("Soma dos números: ");

        for (int i = 2; i <= 100; i+= 2) {
            soma += i;
        }
        System.out.println("A soma dos numeros pares de 1 a 100: " + soma);
    }
}