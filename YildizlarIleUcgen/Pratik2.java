package YildizlarIleUcgen;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++ ) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= ((2*i) - 1); j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

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
