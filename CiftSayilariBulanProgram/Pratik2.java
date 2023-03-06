package CiftSayilariBulanProgram;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        int sayi, toplam = 0, sayac = 0;
        double ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        sayi = inp.nextInt();

        for(int i = 0; i <= sayi; i++){
            if(i%3==0 && i%4==0){
                toplam += i;
                sayac++;
            }
        }

        ortalama = toplam/(sayac-1); 
        System.out.print("Ortalama :" + ortalama);
    }
}
