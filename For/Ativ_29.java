package For;
import java.util.Scanner;
public class Ativ_29 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Digite o tamanho do vetor: ");
                int tamanho = sc.nextInt();
                int[] numeros = new int[tamanho];

                System.out.println("Digite os números do vetor:");
                for (int i = 0; i < tamanho; i++) {
                    numeros[i] = sc.nextInt();
                }

                int soma = 0;
                for (int num : numeros) {
                    soma += num;
                }

                double media = (double) soma / tamanho;

                for (int i = 0; i < tamanho - 1; i++) {
                    int indiceMenor = i;
                    for (int j = i + 1; j < tamanho; j++) {
                        if (numeros[j] < numeros[indiceMenor]) {
                            indiceMenor = j;
                        }
                    }
                    int temp = numeros[i];
                    numeros[i] = numeros[indiceMenor];
                    numeros[indiceMenor] = temp;
                }

                System.out.println("A soma dos números do vetor é: " + soma);
                System.out.println("A média dos números do vetor é: " + media);

                System.out.print("Vetor ordenado em ordem crescente: ");
                for (int num : numeros) {
                    System.out.print(num + " ");
                }
                System.out.println();

                sc.close();
            }
        }