package Tasks.TaskCity;

/*
У класса City есть два поля - название города и текущая температура воздуха.
Также в классе Solution есть метод showWeather: он выводит в консоли информацию о погоде в городе,
который передан в качестве аргумента метода. Реализуй метод showWeather, который должен
выводить в консоли информацию в таком формате:
    "В городе "название города" сегодня температура воздуха "температура в городе""
В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

Пример вывода:
В городе Дубай сегодня температура воздуха 40

Требования:
•	Не изменяй класс City.
•	В классе Solution должен быть метод showWeather с параметром City.
•	Метод showWeather должен использовать геттеры класса City.
•	Метод showWeather должен выводить текст в консоли в соответствии условию.
*/

public class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }
}













