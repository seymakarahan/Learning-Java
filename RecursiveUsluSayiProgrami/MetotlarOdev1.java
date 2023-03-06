import java.util.Scanner;
public class MetotlarOdev1 {
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++){
            result = result*a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
        System.out.println("Taban değerini giriniz : ");
        int a = scan.nextInt();
            if (a == 0) {
                break;
            }
        System.out.println("Üs değerini giriniz : ");
        int b = scan.nextInt();


        System.out.println("Sonuç : " + power(a, b));

    }
    }
}
