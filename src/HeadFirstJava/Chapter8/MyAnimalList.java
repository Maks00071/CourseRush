package HeadFirstJava.Chapter8;

public class MyAnimalList {

    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal animal) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = animal;
            System.out.println("Animal добавлен в ячейку " + nextIndex);
            nextIndex++;
        }
    }
}
