package Module1.Level24.Lesson.PatternDecorator;

/**
 * Декоратор, который добавляет к нашему дому гараж
 */

public class Garage extends HouseDecorator {

    House house;

    public Garage(House house) {
        this.house = house;
    }

    /**
     * Метод добавляет к цене, если нужен гараж
     * @return - price
     */
    @Override
    public int getPrice() {
        return house.getPrice() + 5_000;
    }

    /**
     * Метод выводит информацию, что будет еще гараж
     * @return - info
     */
    @Override
    public String getInfo() {
        return house.getInfo() + " + гараж";
    }
}



















