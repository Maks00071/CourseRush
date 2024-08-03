package Module2.Level5.Tasks.Generics;

import java.util.HashMap;
import java.util.LinkedHashMap;

/***** Простой generics *****
 * Параметризируй класс Solution, чтобы он мог работать со всеми классами,
 * которые наследуются от HashMap.
 * Метод getMap должен возвращать тип поля map.
 * -----
 * Требования:
 * • Класс Solution должен быть параметризирован типом который является наследником HashMap.
 * • В классе Solution должно существовать поле map.
 * • В классе Solution должен существовать метод getMap.
 * • Метод main должен выводить данные на экран.
 */

public class SampleGenerics<T extends HashMap> {

    private T map;

    public SampleGenerics(T map) {
        this.map = map;
    }

    public T getMap() {
        return map;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("string", 4);
        SampleGenerics<HashMap> sampleGenerics = new SampleGenerics<>(hashMap);
        HashMap mapFromSampleGenerics = sampleGenerics.getMap();
        System.out.println(mapFromSampleGenerics.getClass());  // => class java.util.HashMap

        LinkedHashMap<SampleGenerics, SampleGenerics> hashMap2 = new LinkedHashMap<>();
        hashMap2.put(sampleGenerics, sampleGenerics);
        SampleGenerics<LinkedHashMap> sampleGenerics2 = new SampleGenerics<>(hashMap2);
        LinkedHashMap mapFromSampleGenerics2 = sampleGenerics2.getMap();
        System.out.println(mapFromSampleGenerics2.getClass());  // => class java.util.LinkedHashMap
    }
}




























