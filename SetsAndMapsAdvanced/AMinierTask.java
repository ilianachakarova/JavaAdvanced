import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinierTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;

        Map<String,Integer> map = new LinkedHashMap<>();

        while(!"stop".equals(line = scanner.nextLine())){
           String resource = line;
           int quantity = Integer.parseInt(scanner.nextLine());

          if(!map.containsKey(resource)){
              map.put(resource,quantity);
          }else{
             map.put(resource, quantity + map.get(resource));
          }
        }

        map.forEach((k,v)->{
            System.out.println(String.format("%s -> %s",k,v));
        });
    }
}
