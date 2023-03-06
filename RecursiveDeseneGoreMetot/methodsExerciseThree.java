import java.util.Scanner;
public class methodsExerciseThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int num = input.nextInt();
        array(num);

    }
    public static void array(int num) {
        if (num > 0) {
            System.out.print(num + " ");
            arrayTwo(num - 5, num);
        } else {
            num += 5;
            System.out.print(num + " ");
            array(num);
        }
    }
    public static void arrayTwo(int num, int numTwo) {
        if (num > 0) {
            System.out.print(num + " ");
            arrayTwo(num - 5, numTwo);
        } else {
            while (num <= numTwo) {
                System.out.print(num + " ");
                num += 5;
            }
        }
    }

}
