import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String,Long>>populationCounter = new LinkedHashMap<>();


        String input;
        while(!"report".equals(input = scanner.nextLine())){
            String [] tokens = input.split("\\|");

            String city = tokens[0];
            String country = tokens[1];
            long population = Integer.parseInt(tokens[2]);

            if (!populationCounter.containsKey(country)) {
                populationCounter.put(country,new LinkedHashMap<>(){{
                    put(city,population);
                }
                });
                }else {
                populationCounter.get(country).put(city,population);
            }
        }

       populationCounter.entrySet().stream().sorted((f,s)-> {
          Long firstPopulation =  populationCounter.get(f.getKey())
                   .values().stream().mapToLong(i -> i).sum();

          Long secondPopulation = populationCounter.get(s.getKey())
                  .values().stream().mapToLong(i -> i).sum();

          return secondPopulation.compareTo(firstPopulation);
       }).forEach(entry ->{

           long totalPop = entry.getValue().values().stream().mapToLong(i->i).sum();
           System.out.println(String.format("%s (total population: %d)",entry.getKey(),totalPop));

           entry.getValue().entrySet()
                   .stream().sorted((e1,e2)->Long.compare(e2.getValue(),e1.getValue()))
                   .forEach(e->{
                       System.out.println(String.format("=>%s: %d",e.getKey(),e.getValue()));
                   });
       });
    }
}
