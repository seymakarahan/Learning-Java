import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MineSweeper {
    int rowNumber, colNumber, size;
    int[][] map;
    int[][] matrix;
    boolean isMine = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    //Constructor oluşturma

    MineSweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.size = rowNumber*colNumber;

    }
    public void run(){
        int row,col,success = 0;
        prepareMine();
        print(map);
        System.out.println("Oyun başladı.");
        while (isMine){
          print(matrix);
            System.out.println("Satır :");
            row = scan.nextInt();
            System.out.println("Sütun :");
            col = scan.nextInt();
            if (map[row][col] != -1){
                checkMine(row,col);
                success++;
                if (success == (size - (size/4))){
                    System.out.println("Başardınız. ");
                    break;
                }

            }else {
                isMine = false;
                System.out.println("Game over..");
            }
        }

    }
    public void checkMine(int r, int c){
        if (map[r][c] == 0){
            if ((c < colNumber - 1) && (map[r][c+1] == -1)){
                matrix[r][c]++;
            }
            if ((r < rowNumber-1) && (map[r+1][c] == -1)){
                matrix[r][c]++;
            }
            if ((r > 0) && (map[r-1][c] == -1)){
                matrix[r][c]++;
            }
            if ((c > 0) && (map[r][c-1] == -1)){
                matrix[r][c]++;
            }
            if (matrix[r][c] == 0){
                matrix[r][c] = -2;
            }
        }


    }
    public void prepareMine(){
        int mineRow,mineCol, count = 0;
        while (count != (size/4))
        {
            mineRow = rand.nextInt(rowNumber);
            mineCol = rand.nextInt(colNumber);
            if (map[mineRow][mineCol] != -1){
                map[mineRow][mineCol] = -1;
                count++;
            }
        }
    }
    public void print(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j] >= 0)
                    System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
