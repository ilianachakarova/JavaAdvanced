import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        Map<String, String> emailsRecord = new LinkedHashMap<>();

        while(!"stop".equals(input = scanner.nextLine())){
            String email = scanner.nextLine();

            emailsRecord.put(input,email);
        }

        emailsRecord.forEach((key, value) -> {
            if (!value.contains(".us") && !value.contains(".uk") && !value.contains(".com")) {
                System.out.println(String.format("%s -> %s", key,value));
            }
        });


    }
}
