package Tasks;

import java.util.ArrayList;

/******Солнечная система********
В 3020 году ученые научились выращивать новые планеты, одну из которых отправили в космос
на орбиту Солнца.
Эта планета находится между Землей и Марсом.
Реализуй метод "createNewPlanet(String)", который должен добавлять переданную планету
в список planets сразу после Земли. Посмотри, как изменился порядок следования планет.

Требования:
•	Метод "createNewPlanet(String)" должен добавлять переданную планету в список "planets"
на следующую позицию после Земли.
 */

public class TaskPlanet {
    public static ArrayList<String> planets = new ArrayList<String>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Звезда Смерти");
        print();
    }

    public static void createNewPlanet(String planetName) {
        planets.add(planets.indexOf("Земля") + 1, planetName);
    }

    public static void addPlanets() {
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s - %d-я планета от Солнца", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}

















