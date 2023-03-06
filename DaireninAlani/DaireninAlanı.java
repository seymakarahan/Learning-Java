package Main.Projeler;

import java.util.Scanner;

public class DaireninAlanı {
    public static void main(String[] args) {
        int r;
        double a, π = 3.14;

        try (Scanner input = new Scanner(System.in)) {
            {
                System.out.print("Daire yarıçap uzunluğunu giriniz : ");
                r = input.nextInt();
                System.out.print("Açı değerini giriniz : ");
                a = input.nextInt();
            }
        } 

        double alan = (π* (r*r)*a)/360;

        System.out.println("Dairenin alanı : " + alan);

        
    }
}
