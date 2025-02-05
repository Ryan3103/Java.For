package DoWhile;

public class Ativ_36 {
        public static void main(String[] args) {
                    int i = 1;
                    int soma = 0;

                    do {
                        soma += i;
                        i++;
                    } while (i <= 50);

                    System.out.println("A soma dos números de 1 a 50 é: " + soma);
                }
}