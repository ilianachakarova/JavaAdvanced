import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dims = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        int [][] matrix = new int [dims[0]][dims[1]];

        for (int row = 0; row <dims[0] ; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();

        }

        System.out.println(dims[0]);
        System.out.println(dims[1]);

        int sum = 0;

        for (int row = 0; row <dims[0] ; row++) {
            for (int col = 0; col <dims[1]; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);
    }
}
