package Module1.Level18;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class LengthComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        int lengthComparedResult = Integer.compare(o1.length(), o2.length());
        //если длина ключей не равна (!= 0), то берем результат,
        // иначе сравниваем лексикографически
        return lengthComparedResult != 0 ? lengthComparedResult : o1.compareTo(o2);
    }

    public static void main(String[] args) {
        SortedMap<String, Integer> lengthComparedMap = new TreeMap<>(new LengthComparator());

        lengthComparedMap.put("Юрий",4);
        lengthComparedMap.put("Олег",5);
        lengthComparedMap.put("Руслан",4);
        lengthComparedMap.put("Ян",4);
        lengthComparedMap.put("Антон", 5);
        lengthComparedMap.put("Сергей", 5);
        lengthComparedMap.put("Николай", 4);

        System.out.println(lengthComparedMap);
        //{Ян=4, Олег=5, Юрий=4, Антон=5, Руслан=4, Сергей=5, Николай=4}
        System.out.println("-----------------------");
        //получим первый ключ из мапы
        String firstKey = lengthComparedMap.firstKey();
        System.out.printf("The first Key -> %s%n", firstKey);
        System.out.println("-----------------------");
        //получим последний ключ из мапы
        String lastKey = lengthComparedMap.lastKey();
        System.out.printf("The last Key -> %s%n", lastKey);
        System.out.println("-----------------------");
        //Получить все объекты, которые стоят после объекта с ключом “Сергей”
        Map<String, Integer> tailMap = lengthComparedMap.tailMap("Руслан");
        System.out.printf("Все элементы после ключа \"Руслан\" -> %s%n", tailMap);
        System.out.println("-----------------------");
        //Получить все объекты, которые стоят до объекта с ключом “Антон”
        Map<String, Integer> headMap = lengthComparedMap.headMap("Антон");
        System.out.printf("Все элементы до ключа \"Антон\" -> %s%n", headMap);
    }
}
















