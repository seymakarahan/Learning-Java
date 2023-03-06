package YildizlarIleTersUcgen;

import java.util.Scanner;

public class YildizlarIleTersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Basamak sayısını giriniz : ");

        for (int i = (n - 1); i > 0; i--) {
            for (int k = 1; k <= (n - i) ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*i) - 1); j++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
