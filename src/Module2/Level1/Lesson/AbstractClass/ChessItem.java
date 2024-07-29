package Module2.Level1.Lesson.AbstractClass;

public abstract class ChessItem {
    public int x, y; //координаты
    private int value;

    public int getValue() {
        return value;
    }

    public abstract void draw(); //абстрактный метод. Реализация отсутствует
}
