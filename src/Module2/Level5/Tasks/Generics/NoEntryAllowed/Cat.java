package Module2.Level5.Tasks.Generics.NoEntryAllowed;

public class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}
