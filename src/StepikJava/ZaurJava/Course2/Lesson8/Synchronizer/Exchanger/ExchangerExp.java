package StepikJava.ZaurJava.Course2.Lesson8.Synchronizer.Exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;


public class ExchangerExp {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        // создадим список первого игрока
        List<Action> listFriend1 = new ArrayList<>();
        listFriend1.add(Action.SHEAR);
        listFriend1.add(Action.PAPER);
        listFriend1.add(Action.SHEAR);

        // создадим список второго игрока
        List<Action> listFriend2 = new ArrayList<>();
        listFriend2.add(Action.PAPER);
        listFriend2.add(Action.STONE);
        listFriend2.add(Action.STONE);

        new BestFriend("Ivan", listFriend1, exchanger);
        new BestFriend("Petr", listFriend2, exchanger);

        /*
        Ivan WINS!!!
        Ivan WINS!!!
        Petr WINS!!!
         */
    }
}
