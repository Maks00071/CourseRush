package StepikJava.ZaurJava.Course2.Lesson3.Example;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Team<T extends Participant> {

    private String teamName;
    private List<T> participants = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Метод добавляет новых участников в команду
     * @param participant объект Participant
     */
    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("In the team " + teamName + " will add a new participant " +
                " with a name " + participant.getName());
    }

    /**
     * Метод игры одной команды с другой
     * @param team объект Team
     */
    public void playWith(Team<T> team) {
        String winnerTeam;

        Random random = new Random();

        // возвращаем одно из двух значений (0 или 1)
        int i = random.nextInt(2);

        if (i == 0) {
            winnerTeam = this.teamName;  // команда, которая вызывает метод
        } else {
            winnerTeam = team.teamName; // команда, с которой играем
        }

        System.out.println("The team " + winnerTeam + " is win!");
    }

}



























