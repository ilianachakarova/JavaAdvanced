import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] firstMatrixSizeDim = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int firstMatrixSize = firstMatrixSizeDim[0];
        int firstMatrixSizeCols = firstMatrixSizeDim[1];
        
        int [][] firstMatrix = new int [firstMatrixSize][firstMatrixSizeCols];

        for (int row = 0; row <firstMatrixSize ; row++) {
            firstMatrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        
        int secondMatrixSizeDim [] = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int secondMatrixSize = secondMatrixSizeDim[0];
        int secondMatrixCols = secondMatrixSizeDim[1];
        
        int [][] secondMatrix = new int [secondMatrixSize][secondMatrixCols];

        for (int row = 0; row <secondMatrixSize; row++) {
            secondMatrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

        }

        if(firstMatrixSize != secondMatrixSize){
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < firstMatrixSize; row++) {
            boolean areEqualArrays = firstMatrix[row].length == secondMatrix[row].length;
            if(!areEqualArrays){
                System.out.println("not equal");
                return;
            }
            for (int col = 0; col <firstMatrix[row].length ; col++) {
                int currentValueFirstMatrix = firstMatrix[row][col];
                int currentValueSecondMatrix = secondMatrix[row][col];

                if(currentValueFirstMatrix != currentValueSecondMatrix){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
