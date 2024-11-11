package StepikJava.ZaurJava.Course1.Lesson32.CustomException;

public class CustomException {

    public void marafon(int airTemperature, int speed) throws LegException{
        if (speed > 12) {
            throw new LegException("The speed is too fast! " + speed);
        }
        if (airTemperature > 32) {
            throw new MusculException("The airtemperature is too big! " + airTemperature);
        }
        System.out.println("You win!");
    }

    public static void main(String[] args) {
        CustomException test1 = new CustomException();
        try {
            test1.marafon(33, 10);
        } catch(LegException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Грамота за участие!");
        }
    }
}
