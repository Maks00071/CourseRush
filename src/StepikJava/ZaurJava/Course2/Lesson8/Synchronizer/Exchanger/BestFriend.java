package StepikJava.ZaurJava.Course2.Lesson8.Synchronizer.Exchanger;

import java.util.List;
import java.util.concurrent.Exchanger;


public class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    public void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.STONE && friendsAction == Action.SHEAR)
                || (myAction == Action.SHEAR && friendsAction == Action.PAPER)
                || (myAction == Action.PAPER && friendsAction == Action.STONE)) {
            System.out.println(name + " WINS!!!");
        }
    }

    @Override
    public void run() {
        Action reply; // ответ второго игрока
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}