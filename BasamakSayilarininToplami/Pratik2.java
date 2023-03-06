package ArmstrongSayilarıBulma;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int num = scan.nextInt();

        int basNumber = 0; 
        int tempNumber = num;
        int basValue;
        int result = 0;


        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            basNumber++;
        }
        tempNumber = num;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
    }
    System.out.println("Basamak toplamı : " + result);
}
}
