import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i <text.length() ; i++) {
            if(!map.containsKey(text.charAt(i))){
                map.put(text.charAt(i),1);
            }else {
                map.put(text.charAt(i),map.get(text.charAt(i))+1);
            }
        }

        map.entrySet().stream()
    .forEach(e->{
            System.out.println(String.format("%s: %d time/s",e.getKey(),e.getValue()));
        });
    }
}
