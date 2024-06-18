package Module1.Level24.Lesson.PatternDecorator;

/**
 * Создаем абстрактный класс дома:
 */

public abstract class House {
    String info;

    /**
     * Метод возвращает информацию о названии
     * и комплектации нашего дома
     * @return - info
     */
    public String getInfo() {
        return info;
    }

    /**
     * Метод возвращает цену дома в текущей комплектации
     * @return - price
     */
    public abstract int getPrice();
}
