import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);

        String type = input[1];

        int [][] matrix;


        if(type.equals("A")){
           matrix = generateMatrixWithPatetrnA(size);
        }else{
            matrix = generateMatrixWithPatetrnB(size);
        }
        printMatrix(matrix);
    }

    private static int[][] generateMatrixWithPatetrnB(int size) {
        int [][] matrix =  new int [size][size];

        int value =1;
        for (int col = 0; col <size; col++) {

                if(col%2== 0){
                    for (int row = 0; row <size ; row++) {
                        matrix[col][row] = value;
                        value++;
                    }
                }else {
                    for (int row = size-1; row >=0 ; row--) {
                        matrix[col][row] = value;
                        value++;
                    }
                }

        }
        return matrix;
    }

    private static void printMatrix(int [][]matrix){
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[col][row]+ " ");
            }
            System.out.println();
        }

    }

    private static int[][] generateMatrixWithPatetrnA(int size) {
        int [][] matrix = new int [size][size];

        int value = 1;
        for (int col = 0; col <size; col++) {
            for (int row = 0; row <size; row++) {
                matrix[col][row] = value;
                value++;
            }
        }
        return matrix;
    }


}
