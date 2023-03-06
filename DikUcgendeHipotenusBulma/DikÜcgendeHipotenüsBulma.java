package Main.Projeler;

import java.util.Scanner;

public class DikÜcgendeHipotenüsBulma {
    public static void main(String[] args) {
        int a, b;
        double hipotenüs;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Birinci dik kenar uzunluğunu giriniz : ");
            a = input.nextInt();
            System.out.print("İkinci dik kenar uzunluğunu giriniz : ");
            b = input.nextInt();
        }
        hipotenüs = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs : " + hipotenüs);
    }
}
