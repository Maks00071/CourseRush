package StepikJava.ZaurJava.Lesson25.Example;

public class Human {

    private final String gender;
    private String name;
    private int age;
    private int weight;

    public Human(String gender) {
        this.gender = gender;
    }

    public Human(String gender, String name, int age, int weight) {
        this(gender);
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return String.format("Gender is %s, name is %s, age is %d, weight is %d", gender, name, age, weight);
    }
}


































