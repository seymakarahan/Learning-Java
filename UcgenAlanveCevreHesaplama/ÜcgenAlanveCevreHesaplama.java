package Main.Projeler;

import java.util.Scanner;

public class ÜcgenAlanveCevreHesaplama {
    public static void main(String[] args) {
        int a,b,c;

        try (Scanner input = new Scanner(System.in))  {
            System.out.print("Birinci kenar uzunluğunu giriniz : ");
            a = input.nextInt();
            System.out.print("İkinci kenar uzunluğunu giriniz : ");
            b = input.nextInt();
            System.out.print("Üçüncü kenar uzunluğunu giriniz : ");
            c = input.nextInt();

        }
        int cevre = a + b + c;
        double u = cevre/2;

        double alan = Math.sqrt(u*(u - a)*(u - b)*(u - c));

        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);


    }
}
