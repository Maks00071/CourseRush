package Module2.Level28.Lesson.CreateDevice;

public class Splitter extends Device {
    int ratio;
    Label label;

    public Splitter(String name, Label label) {  // переопределяем родительский конструктор
        super(name);  // super - это ссылка на родителя: super = new Device(String name);
        this.label = label;  // связь - агрегация
    }
}
