package FaktoriyelHesaplama;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        // C(n,r) = n!/(r!*(n-r)!)

        int n, r, faktoriyel, faktoriyel1 = 1, faktoriyel2 = 1, faktoriyel3 = 1, total;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci kombinasyon sayısını giriniz : ");
        n = scan.nextInt();
        System.out.println("İkinci kombinasyon sayısını giriniz : ");
        r = scan.nextInt();

        if(n <= r) {
            System.out.println("Birinci kombinasyon sayısı, ikinciden büyük olmalıdır!");
            return;
        }

        faktoriyel = n - r;
        for (int i = 1; i <= n; i++) {
            faktoriyel1 = faktoriyel1*i;
        }

        for (int i = 1; i <= r; i++) {
            faktoriyel2 = faktoriyel2*i;
        }

        for (int i = 1; i <= faktoriyel3; i++) {
            faktoriyel3 = faktoriyel3*i;
        }

        total = faktoriyel1 / (faktoriyel2* (faktoriyel3));
        System.out.println(total);


    }
}
