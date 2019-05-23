import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dims = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = dims[0];
        int cols = dims[1];

        int matrix[][] = new int [rows][cols];

        for (int r = 0; r <rows ; r++) {
            matrix [r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
    int maxSum = 0;
        int rowIndex = -1;
        int colIndex = -1;
        for (int row = 1; row <rows -1; row++) {
            for (int col = 1; col < cols-1; col++) {
                int currentSum = getMatrixSum(matrix,row,col);
                if(currentSum>maxSum){
                    maxSum = currentSum;
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        printMatrixByCell(matrix,rowIndex,colIndex);
    }

    private static void printMatrixByCell(int[][]matrix,int rowIndex, int colIndex) {
        int beginRow = rowIndex -1;
        int beginCol = colIndex - 1;

        for (int i = beginRow; i <beginRow + 3; i++) {
            for (int j = beginCol; j < beginCol + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }


        }
    }

    private static int getMatrixSum(int[][] matrix, int row, int col) {
        int sum = 0;

        sum += matrix[row][col];
        sum += matrix[row-1][col];
        sum += matrix[row+1][col];
        sum += matrix[row][col-1];
        sum += matrix[row][col+1];
        sum += matrix[row-1][col-1];
        sum += matrix[row+1][col+1];
        sum += matrix[row-1][col+1];
        sum += matrix[row+1][col-1];


        return sum;
    }
}
