package Tasks.TaskSkyscraper;

/*
Давай построим бизнес-центр, который состоит из двух зданий, один из которых только
начинаем строить, а второй — на этапе планирования, поэтому о нем мало что известно.
Тебе нужно будет создать два конструктора:
    - один с параметрами,
    - второй — без.
Они оба должны инициализировать поля "floorsCount" и "developer".
*/

public class Skyscraper2 {
    private int floorsCount;
    private String developer;

    public Skyscraper2() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Skyscraper2(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper2 skyscraper = new Skyscraper2();
        Skyscraper2 skyscraperUnknown = new Skyscraper2(50, "Неизвестно");
    }
}
