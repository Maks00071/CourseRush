package Module2.Level28.Tasks.LoadWindows;

/**
 * В OperatingSystem нужно:
 *  - добавить приватные поля name и version типа String, причем name должно быть неизменяемым,
 *    а version — изменяемым;
 *  - реализовать конструктор с двумя параметрами типа String, устанавливающий значения полям;
 *  - добавить геттеры и сеттеры для полей (сеттеры — там, где это возможно).
 */

public class OperatingSystem {

    private final String name;
    private String version;

    public OperatingSystem(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
