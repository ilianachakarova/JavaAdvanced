import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dims = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int [][] array = new int [dims[0]][dims[1]];

        for (int row = 0; row <dims[0] ; row++) {
            array[row] = Arrays.stream(scanner.nextLine().split("\\s"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int num = Integer.parseInt(scanner.nextLine());
        boolean notFound = true;
        for (int row = 0; row <dims[0]; row++) {
            for (int col = 0; col <dims[1] ; col++) {
                if(array[row][col]==num){
                    System.out.println(row + " " + col);
                    notFound = false;
                }
            }
        }
        if(notFound){
            System.out.println("not found");
        }
    }
}
