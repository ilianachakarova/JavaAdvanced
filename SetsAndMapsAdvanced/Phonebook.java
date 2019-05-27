import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> phonebook = new LinkedHashMap<>();

        String line;
        while(!"search".equals(line = scanner.nextLine())){
            String [] data = line.split("\\-");
            String name = data[0];
            String phoneNumber = data[1];

            phonebook.put(name,phoneNumber);
        }
        String input;

        while(!"stop".equals(input = scanner.nextLine())){
            if(phonebook.containsKey(input)){
                System.out.println(String.format("%s -> %s", input,phonebook.get(input)));
            }else {
                System.out.println(String.format("Contact %s does not exist.",input));
            }
        }

    }
}
