package Module1.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();

        Lion simba = new Lion();
        Tiger sherekhan = new Tiger();
        Cheetah chester = new Cheetah();

        aibolit.healCat(simba);
        aibolit.healCat(sherekhan);
        aibolit.healCat(chester);
    }
}
