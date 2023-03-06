package EbobEkokBulanProgram;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.println("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        int i = 1;


        while (i <= (n1*n2)) {
            if ((i % n1 == 0) && (i % n2 == 0)) {
                System.out.println("Sayıların küçük ortak katı : " + i);
                break;
            } else {
                i++;
            }

        }

        i = 1;
        while (i <= n1) {
            i++;
            if ((n1 % i == 0) && (n2 % i == 0)){
                ebob = i;
            }
        }
        System.out.println("Sayıların en büyük ortak böleni : " + ebob);
        
    }
}
