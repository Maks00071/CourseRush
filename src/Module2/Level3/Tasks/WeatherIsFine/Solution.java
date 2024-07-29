package Module2.Level3.Tasks.WeatherIsFine;

/***** The weather is fine *****
 * Реализуй в классе Today интерфейс Weather.
 * Подумай, как связан параметр type с методом getWeatherType().
 * Обрати внимание, что интерфейсы Weather и WeatherType уже реализованы в отдельных файлах.
 * -----
 * Требования:
 * • Интерфейс Weather должен быть реализован в классе Today.
 * • В классе Today должен быть реализован метод getWeatherType,
 *   объявленный в интерфейсе Weather.
 * • Тип возвращаемого значения метода getWeatherType должен быть String.
 * • Метод getWeatherType должен возвращать значение переменной type.
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        public String getWeatherType() {
            return type;
        }

        @Override
        public String toString() {
            return String.format("Today is will be %s", this.getWeatherType());
        }
    }
}

























