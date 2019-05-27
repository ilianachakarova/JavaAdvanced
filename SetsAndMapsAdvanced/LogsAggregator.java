import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, TreeSet<String>> logs = new TreeMap<>();
        Map<String,Integer> totalTime = new TreeMap<>();

        while(n-->0){
            String input = scanner.nextLine();
            String [] tokens = input.split("\\s+");
            String ip = tokens[0];
            String user = tokens[1];
            int duration = Integer.parseInt(tokens[2]);

           if(!logs.containsKey(user)){
               logs.put(user,new TreeSet<>());
               logs.get(user).add(ip);
               totalTime.put(user,duration);
           }else {
               logs.get(user).add(ip);
               totalTime.put(user, totalTime.get(user) + duration);
           }

        }

        logs.forEach((k,v)->{
            System.out.print(k+": " + totalTime.get(k) + " ");
            String ips = v.toString().join(", ",v);
            System.out.println("["+ ips+"]");
        });
    }
}
