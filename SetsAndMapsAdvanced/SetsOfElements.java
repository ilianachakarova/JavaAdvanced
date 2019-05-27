import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Set<String> first = new LinkedHashSet<>();
        Set<String> second  = new LinkedHashSet<>();

        while(n-->0){
            String input = scanner.nextLine();
            first.add(input);
        }
        while(m-->0){
            String input = scanner.nextLine();
            second.add(input);
        }
        List<String> result = new ArrayList<>();
        for (String s : first) {
            if(second.contains(s)){
                result.add(s);
            }
        }

        result.stream().forEach(e-> System.out.print(e + " "));
    }
}
