import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       int [][] matrix = {
               {2,3,4},
               {5,6,4},
       };
        int[][] tMatrix = new int[3][2];


        System.out.println("Matris :");
        for (int i = 0; i < 2; i++){
            for (int j =0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("Transpozesi :");
        for (int i = 0; i < 3; i++){
            for (int j =0; j < 2; j++){
                tMatrix[i][j] = matrix[j][i];
                System.out.print(tMatrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}