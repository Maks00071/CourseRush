package Module1.Level17;
import java.util.HashMap;

public class ExampleHashMap {
    public static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("Серега", 21);
        map.put("Николай", 22);
        map.put("Иван Петрович", 48);
        map.put("Анюта", null);

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);
        }
    }
}
