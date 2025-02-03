package Ativ_For;
public class Ativ_13 {
        public static void main(String[] args) {
            int n = 10;
            int t1 = 0, t2 = 1;

            System.out.println("Primeiros " + n + " termos da sequência de Fibonacci:");

            for (int i = 1; i <= n; i++) {
                System.out.print(t1 + " ");

                int nextTerm = t1 + t2;
                t1 = t2;
                t2 = nextTerm;
            }
        }
    }