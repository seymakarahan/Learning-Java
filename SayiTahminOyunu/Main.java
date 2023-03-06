import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);

        while (right < 5){
            System.out.println("Lütfen tahmininizi giriniz : ");
            int selected = input.nextInt();

            if (selected < 0 || selected >99){
                if (isWrong){
                    System.out.println("Çok fazla hatalı giriş yaptınız.. Kalan hakkınız : " + (5- ++right));

                }else {
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınızdan düşülecektir.");
                }
                System.out.println("Lütfen 0-100 arası bir değer giriniz : ");
                continue;
            }


            if (selected == number){
                System.out.println("Tebrikler! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                wrong[right] = selected;
                System.out.println("Hatalı bir sayı girdiniz : ");
                if (selected > number){
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                right++;
                System.out.println("Kalan hakkınız : " + (5 - right));
            }

        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}