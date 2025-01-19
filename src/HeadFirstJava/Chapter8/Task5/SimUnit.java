package HeadFirstJava.Chapter8.Task5;

public class SimUnit {
    String botType;

    SimUnit(String botType) {
        this.botType = botType;
        System.out.println("Object has been created: " + botType);
    }

    int powerUse() {
        if ("Тепловая машина".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}
