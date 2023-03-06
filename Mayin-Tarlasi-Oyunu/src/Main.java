import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int row, column;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Minesweeper!");
        System.out.println("Oynamak istediğiniz boyutları giriniz :");
        //System.out.println("Satır boyutu : ");
        //row = scan.nextInt();
        //System.out.println("Sütun boyutu : ");
        //column = scan.nextInt();

        MineSweeper mine = new MineSweeper(2,2);
        mine.run();
    }

}
