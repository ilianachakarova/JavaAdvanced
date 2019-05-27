import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> result = new TreeSet<>();

        while(n-->0){
            String [] elements = scanner.nextLine().split("\\s+");
            result.addAll(Arrays.asList(elements));
        }

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
