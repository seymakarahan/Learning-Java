package FibonacciSerisi;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Eleman sayısını giriniz : ");
        int first = 0, second = 1, sum;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + ", ");
            sum = first + second;
            first = second;
            second = sum;
        }

    }
}
