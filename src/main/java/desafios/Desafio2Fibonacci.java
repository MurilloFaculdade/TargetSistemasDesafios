package desafios;

import java.util.Scanner;

public class Desafio2Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isFibonacci(n)) {
            System.out.println("Número pertence a sequência de Fibonacci");
        } else {
            System.out.println("Número não pertence a sequência de Fibonacci");
        }
    }

    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == n;
    }
}
