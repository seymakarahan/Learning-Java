package MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = scan.nextInt();
        int i = 1;
        int sum = 0;
        while(i < n){
            if(n % i == 0){
                sum+=i;
            }
            i++;
        }
        System.out.print("");
        if(sum == n){
            System.out.println(n + " sayısı bir mükemmel sayıdır.");
        }
        else{
            System.out.println(n + " sayısı bir mükemmel sayı değildir.");
        }
    }
}
