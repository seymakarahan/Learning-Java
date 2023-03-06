package EtkinlikProjesi;

import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if ( heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsin.");
            }
            if (heat >= 15) {
                System.out.println("Pikniğe gidebilirsin.");
            } 

        } else (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
