package StepikJava.ZaurJava.Course1.Lesson25.Homework.Animal;

public class Pet1 extends Animal1 {

    private String name;
    private int tail = 1;
    private int paw = 4;

    public Pet1() {
        super(2);
        System.out.println("I'm pet!");
    }

    public Pet1(String name, int tail, int paw) {
        this();
        this.name = name;
        this.tail = tail;
        this.paw = paw;
    }

    public void run() {
        System.out.println("Pet runs!");
    }

    public void jump() {
        System.out.println("Pet jumps!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public int getPaw() {
        return paw;
    }
}























