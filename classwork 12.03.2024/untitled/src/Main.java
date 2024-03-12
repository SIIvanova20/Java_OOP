import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ivan");
        names.add("Georgi");
        names.add("Georgi");

        Map<String, Double> personKg = new LinkedHashMap<>();
        personKg.put("Ivan", 70.5);
        personKg.put("Georgi", 80.0);
        personKg.put("Georgi", 90.0);
        personKg.put("Martin", 70.5);

        Set<String> keys = personKg.keySet();
        for(String key : keys){
            System.out.println(key + " - " + personKg.get(key));;
        }

        Collection<Double> values = personKg.values();
        for(Double value : values){
            System.out.println(value);
        }

        Set<Map.Entry<String, Double>> entries = personKg.entrySet();
        for(Map.Entry<String, Double> entry : entries){
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
    }
}