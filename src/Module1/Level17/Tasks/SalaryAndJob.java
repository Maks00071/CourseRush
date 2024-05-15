package Module1.Level17.Tasks;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

/***********Зарплаты и позиции************
 Хотя HashMap и простая в использовании реализация Map и гарантирует быстрый доступ к данным,
 но бывают случаи, когда необходимо хранить данные в структурированном виде с возможностью
 навигации по ним.

 Метод getJobTitle получает в качестве параметра TreeMap, в которой значение это должность,
 а ключ — минимальная зарплата для соответствующей должности. Метод должен вернуть
 должность (значение в TreeMap), которая соответствует зарплате переданной вторым параметром
 в getJobTitle.

 Например, если передать в метод getJobTitle(map, 300), или getJobTitle(map, 400)
 или getJobTitle(map, 699), то должна вернуться строка "Junior". А если
 передать getJobTitle(map, 700) — строка "Strong Junior".

 С учетом того, что TreeMap реализует интерфейс NavigableMap, эту задачу можно решить,
 используя метод/ы из данного интерфейса.

 Требования:
 •	Сигнатуру и тип возвращаемого значения метода getJobTitle(Integer) не изменяй.
 •	Метод getJobTitle должен вернуть должность из переданной TreeMap соответствующую
    переданной зарплате.
 */

public class SalaryAndJob {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(0, "Newbie");
        map.put(200, "Trainee");
        map.put(800, "Junior");
        map.put(1200, "Strong Junior");
        map.put(2700, "Middle");
        map.put(3500, "Strong Middle");
        map.put(5000, "Senior");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int salary = random.nextInt(50) * 100;
            String position = getJobTitle(map, salary);
            System.out.printf("Зарплате $%d соответствует позиция %s%n", salary, position);
        }
    }

    public static String getJobTitle(TreeMap<Integer, String> map, Integer salary) {
        /*****
         Метод getJobTitle получает в качестве параметра TreeMap, в которой значение это должность,
         а ключ — минимальная зарплата для соответствующей должности. Метод должен вернуть
         должность (значение в TreeMap), которая соответствует зарплате переданной вторым параметром
         в getJobTitle.
         *****/
        return map.floorEntry(salary).getValue();
    }
}























