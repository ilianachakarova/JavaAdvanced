import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        String [][] first = new String[M][N];
        String [][] second = new String [M][N];

        for (int row = 0; row < M; row++) {
            String [] values = scanner.nextLine().split(" ");
            for (int col = 0; col <values.length ; col++) {
                String value = values[col];
                first[row][col] = value;
            }
        }

        for (int row = 0; row <M; row++) {
            String [] values = scanner.nextLine().split("\\s+");
            for (int col = 0; col <values.length ; col++) {
                String value = values[col];
                second[row][col] = value;
            }
        }

        String[][] result = new String[M][N];

        for (int row = 0; row <M; row++) {
            for (int col = 0; col <N; col++) {
                if(first[row][col].equals(second[row][col])){
                    result[row][col] = first[row][col];
                }else{
                    result[row][col] = "*";
                }
            }
        }

        for (int row = 0; row <M ; row++) {
            for (int col = 0; col <N; col++) {
                System.out.print(result[row][col]+" ");
            }
            System.out.println();
        }
    }
}
