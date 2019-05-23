import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int [n][n];

        for (int row = 0; row <n ; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int sumPrimaryDiagonal =0;

        for (int row = 0; row <n ; row++) {
            for (int col = 0; col <n ; col++) {
               if(row == col){
                   int value = matrix[row][col];
                   sumPrimaryDiagonal += value;
               }
            }
        }
        int j = 0;
        int i = n-1;
        int sumSecondDiagonal = 0;
        for (int row = n-1; row >=0 ; row--) {
            for (int col = 0; col <n; col++) {
                if(row==i && col == j){
                    int value = matrix[row][col];
                    sumSecondDiagonal+=value;
                    j++;
                    i--;
                }
            }
        }

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondDiagonal));
    }
}
