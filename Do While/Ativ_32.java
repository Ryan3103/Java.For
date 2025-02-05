package DoWhile;
import java.util.Scanner;
public class Ativ_32 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int num;
                int soma = 0;

                do {
                    System.out.print("Digite um número (ou 0 para encerrar): ");
                    num = sc.nextInt();
                    soma += num;
                } while (num != 0);

                System.out.println("A soma dos números é: " + soma);
                sc.close();
            }
        }