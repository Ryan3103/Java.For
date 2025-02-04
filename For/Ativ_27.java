package For;

import java.util.Scanner;
public class Ativ_27 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o tamanho do vetor: ");
                int tamanho = scanner.nextInt();
                int[] numeros = new int[tamanho];

                System.out.println("Digite os números do vetor:");
                for (int i = 0; i < tamanho; i++) {
                    numeros[i] = scanner.nextInt();
                }

                int soma = 0;
                for (int num : numeros) {
                    soma += num;
                }

                System.out.println("A soma dos números do vetor é: " + soma);

                scanner.close();
            }
        }