import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int n = input.nextInt();



        int[] list = {15,12,788,1,-1,-778,2,0,n};

        Arrays.sort(list);
        int index = Arrays.binarySearch(list,n);
        int nearMin = list[index-1];
        int nearMax = list[index+1];


        System.out.println("Girilen Sayı : " + n);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearMin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearMax);
    }
}
