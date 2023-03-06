import java.util.Scanner;

public class methodExerciseTwo {
    static  boolean prime(int a) {
        int sayac = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int a = scan.nextInt();

        if (prime(a)) {
            System.out.println("Girilen sayı bir asal sayıdır.");
        } else {
            System.out.println("Girilen sayı asal sayı değildir.");
        }



    }
}
