package Module2.Level5.Tasks.Generics.NoEntryAllowed;

public class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Котенок " + name;
    }
}
