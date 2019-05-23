import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dims = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = dims[0];

        int cols = dims[1];

        String[][] matrix;

       matrix =generateMatrixOfPalindromes(rows, cols);

       printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row <matrix.length; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }

    private static String[][] generateMatrixOfPalindromes(int rows, int cols) {
        String[][] matrix = new String[rows][cols];

        char middleChar ='a';
            for (int col = 0; col <cols ; col++) {
                char[] currentValue = {'a','a','a'};
                if(col !=0){
                    middleChar = (char)(middleChar+1);
                    currentValue[1] = middleChar;
                }
                for (int row = 0; row <rows ; row++) {
                    matrix[row][col] = String.valueOf(currentValue);
                    for (int i = 0; i <currentValue.length ; i++) {
                        currentValue[i] = (char) (currentValue[i]+1);
                    }
                }
            }
            return matrix;

    }
}
