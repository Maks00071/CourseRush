package Module1.Level24.Lesson.PatternDecorator;

/**
 * Декоратор, который добавляет второй этаж к нашему дому.
 * В конструктор декоратора принимается дом, к которому мы применяем модификации декоратора.
 * А методы getPrice() и getInfo() мы переопределяем,
 * возвращая информацию о новом модернизированном доме, составленном на основе старого.
 */

public class SecondFloor extends HouseDecorator {

    House house;

    public SecondFloor(House house) {
        this.house = house;
    }

    /**
     * Метод добавляет к цене, если
     * нужен второй этаж
     * @return - price
     */
    @Override
    public int getPrice() {
        return house.getPrice() + 20_000;
    }

    /**
     * Метод выводит информацию, что будет еще второй этаж
     * @return - info
     */
    @Override
    public String getInfo() {
        return house.getInfo() + " + второй этаж";
    }
}



























