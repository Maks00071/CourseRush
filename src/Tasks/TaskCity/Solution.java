package Tasks.TaskCity;

public class Solution {

    public static void showWeather(City city) {
        System.out.println(String.format("В городе %s сегодня температура воздуха %s", city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) {
        City city = new City("Дубай", 40);
        showWeather(city);
    }
}