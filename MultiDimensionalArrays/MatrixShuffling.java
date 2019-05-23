import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String [][] matrix = new String [rows][cols];

        for (int row = 0; row <rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        String command = "";

        while (!"END".equals(command = scanner.nextLine())){
            String [] data = command.split("\\s+");
            if(data.length == 5 & data[0].equals("swap")){
                int row1 = Integer.parseInt(data[1]);
                int col1 = Integer.parseInt(data[2]);
                int row2 = Integer.parseInt(data[3]);
                int col2 = Integer.parseInt(data[4]);

                if(row1>rows || row2>rows || col1>cols || col2 >cols){
                    System.out.println("Invalid input!");
                    continue;
                }
                swapNumbers(matrix,row1,col1,row2,col2);
                printMatrix(matrix);
            }else {
                System.out.println("Invalid input!");
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String [][] swapNumbers(String[][] matrix, int row1, int col1, int row2, int col2) {
        String temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
        return matrix;
    }
}
