package GirilenSayidanIkininKuwetleriniBulmak;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz : ");
        n = scan.nextInt();

        System.out.println("4'ün karesi olan sayılar : ");
        for (int i = 4; i <= n; i *= 4) {
            System.out.println(i);
        }
        
        System.out.println("5'in karesi olan sayılar : ");
        for(int a = 5; a <= n; a *= 5){
            System.out.println(a);
        }
    }
}
