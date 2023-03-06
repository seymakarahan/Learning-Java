package UsluSayiHesaplama;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        int n, k, total = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı : ");
        n = scan.nextInt();
        System.out.println("Üs sayısı : ");
        k = scan.nextInt();
        

        for (int i = 1; i <= k; i++) {
            total = total*n;

        }
        System.out.println(total);
    
    
    }
}
