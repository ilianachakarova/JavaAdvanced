import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dims = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        int [][] matrix = new int [dims[0]][dims[1]];

        for (int row = 0; row <dims[0] ; row++) {

            int[]values = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col <dims[1] ; col++) {
                int value = values[col];
                matrix[row][col] = value;
            }
        }
        int maxSum = 0;
        int [][] maxMatrix = new int [2][2];

        for (int row = 0; row <dims[0] ; row++) {
            if(row == dims[0]-1){
                break;
            }
                for (int col = 0; col <dims[1] ; col++) {
                    if(col == dims[1]-1){
                        break;
                    }

                    int currentSum = matrix[row][col] + matrix[row+1][col] + matrix[row][col+1] + matrix[row+1][col+1];
                    int [][]currentSubmatrix = {{matrix[row][col],matrix[row][col+1]},{matrix[row+1][col],matrix[row+1][col+1]}};
                    if(currentSum>maxSum){
                        maxSum = currentSum;
                        maxMatrix = currentSubmatrix;
                    }
                }

        }

        for (int row = 0; row <2; row++) {
            for (int col = 0; col <2 ; col++) {
                System.out.print(maxMatrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);

    }
}
