package Module2.Level1.Tasks;

/***** Скрытный инкапсулированный кот *****
 * Скрой все внутренние переменные класса Cat.
 * -----
 * Требования:
* •	Переменная name класса Cat должна быть скрыта.
* •	Переменная age класса Cat должна быть скрыта.
* •	Переменная weight класса Cat должна быть скрыта.
* •	В классе Cat должны быть 3 переменные.
* •	Все переменные класса Cat должны быть private.
 */

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int speed;

    public Cat() {
    }

    public Cat(String name, int age, int weight, int speed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}





















