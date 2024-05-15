package Module1.Level17;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class SetHashMap {
    public static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("Серега", 21);
        map.put("Николай", 22);
        map.put("Иван Петрович", 48);
        map.put("Анюта", null);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> pair : entries) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " --> " + value);
        }
    }
}
























