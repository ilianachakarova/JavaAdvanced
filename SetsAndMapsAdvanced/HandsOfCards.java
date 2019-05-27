import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        Map<String, Set<String>> map = new LinkedHashMap<>();

        while (!"JOKER".equals(input = scanner.nextLine())) {
            String[] data = input.split(":");
            String name = data[0];
            String expression = data[1].replace(" ","");
            String [] cards = expression.split(",");




            if (!map.containsKey(name)) {
                map.put(name, new LinkedHashSet<>());
                for (int i = 0; i < cards.length; i++) {
                    map.get(name).add(cards[i]);
                }
            } else {
                for (int i = 0; i < cards.length; i++) {
                    map.get(name).add(cards[i]);
                }
            }
        }

        map.forEach((k, v) -> {
            System.out.println(String.format("%s: %d", k, calculateTotalPoints(v)));
        });
    }

    private static int calculateTotalPoints(Set<String> cards) {
        int totalValue = 0;
            for (String card : cards) {
                int power = 1;
                int value = 0;

                switch (card.substring(card.length()-1)) {
                    case "S":
                        power = 4;
                        break;
                    case "H":
                        power = 3;
                        break;
                    case "D":
                        power = 2;
                        break;
                    case "C":
                        power = 1;

                        break;

                }

                if(Character.isDigit(card.charAt(0)) && card.charAt(0)!='1'){
                    value = Integer.parseInt(String.valueOf(card.charAt(0)));
                }else {
                    switch (card.charAt(0)){
                        case '1':
                            value = 10;
                            break;
                            case 'J':
                                value = 11;
                        break;
                        case 'Q':
                            value = 12;
                            break;
                        case 'K':
                            value = 13;
                            break;
                            case 'A':
                                value = 14;
                            break;
                    }
                }

                totalValue += power * value;

            }
        return totalValue;
    }
}
