package Module1;
import java.util.ArrayList;

public class ArrayListOfLists {
    public static void main(String[] args) {
        //список приветствий
        ArrayList<String> listHello = new ArrayList<String>();
        listHello.add("Hello");
        listHello.add("Hi");

        //список прощаний
        ArrayList<String> listBye = new ArrayList<String>();
        listBye.add("Good Bye");
        listBye.add("Bye");

        //список списков
        ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
        lists.add(listHello);
        lists.add(listBye);
    }
}
