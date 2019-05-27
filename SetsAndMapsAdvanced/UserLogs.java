import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Map<String, Integer>> userLogs = new TreeMap<>();

        String regex = "IP=(.+) message='(.*)' user=(.+)";
        Pattern pattern = Pattern.compile(regex);

        String input;

        while(!"end".equals(input = scanner.nextLine())){
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String ip = matcher.group(1);
                String message = matcher.group(2);
                String user = matcher.group(3);

                if(!userLogs.containsKey(user)){
                    userLogs.put(user,new LinkedHashMap<>(){{
                        put(ip,1);
                    }});
                }else {
                    if(!userLogs.get(user).containsKey(ip)){
                        userLogs.get(user).put(ip,1);
                    }else{
                        userLogs.get(user).put(ip,userLogs.get(user).get(ip)+1);
                    }
                }
            }
        }


        userLogs.forEach((k,v)->{
            System.out.println(String.format("%s: ",k));
            StringBuilder word = new StringBuilder();
            v.forEach((ip,count)->{
               word.append(ip);
               word.append(" => ");
               word.append(String.valueOf(count));
               word.append(", ");
            });
            String result = "";

            for (int i = 0; i <word.toString().length()-2 ; i++) {
                result+= word.toString().charAt(i);
            }

            result+='.';

            System.out.println(result);

        });

    }
}
