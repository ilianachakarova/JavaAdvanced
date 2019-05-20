import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int [n][n];

        for (int row = 0; row <n ; row++) {

            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int [] firstDiagonal = new int [n];
        for (int i = 0; i <n ; i++) {
            firstDiagonal[i] = matrix[i][i];
        }

        for (int i = 0; i <firstDiagonal.length ; i++) {
            System.out.print(firstDiagonal[i]+ " ");
        }
        System.out.println();

        int [] secondDiagonal = new int [n];
        int j = n-1;
        for (int i = 0; i <n; i++) {
            secondDiagonal[i]= matrix[j][i];
            j--;
        }

        for (int i = 0; i <secondDiagonal.length ; i++) {
            System.out.print(secondDiagonal[i]+ " ");
        }

    }
}
