package Module1.Level24.Lesson.PatternDecorator;

/**
 * Реализация кирпичного дома
 */

public class BrickHouse extends House {

    public BrickHouse() {
        info = "Кирпичный дом";
    }

    @Override
    public int getPrice() {
        return 20_000;
    }
}






















