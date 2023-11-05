import java.util.HashMap;
import java.util.Map;

public class Main {
    public Main() {
        Map<String, Integer> incomeMap = new HashMap<>();
        incomeMap.put("Tom", 2000);
        incomeMap.put("Ron", 3000);
        incomeMap.put("John", 4000);
        incomeMap.put("Harry", 5000);
        System.out.println("-----------");
        for (Map.Entry<String, Integer> entry : incomeMap.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        System.out.println("-----------");
        incomeMap.forEach((name, income) -> System.out.println(name + "," + income));
    }

    public static void main(String[] args) {
        new Main();
    }
}
