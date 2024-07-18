package Module2.Level28.Tasks.LoadWindows;

/**
 * В Laptop нужно:
 *  - добавить приватные неизменяемые поля String name и OperatingSystem os;
 *  - реализовать конструктор с тремя параметрами типа String, устанавливающий значения полям;
 *  - добавить геттер для поля name;
 *  - добавить метод public void updateOS(String version), который должен обновлять версию операционной системы;
 *  - добавить метод public void printInfo(), который должен выводить в консоль имя ноутбука,
 *    имя и версию операционной системы в произвольном формате.
 */

public class Laptop {

    private final String name;
    private final OperatingSystem os;

    public Laptop(String laptopName, String osName, String osVersion) {
        this.name = laptopName;
        this.os = new OperatingSystem(osName, osVersion);
    }

    public String getName() {
        return name;
    }

    public void updateOS(String version) {
        os.setVersion(version);
    }

    public void printInfo() {
        System.out.println("Laptop {" +
                "name = '" + name + '\'' +
                ", os = OperatingSystem {" +
                "name = '" + os.getName() + '\'' +
                ", version = '" + os.getVersion() + '\'' +
                "}}");
    }
}
















