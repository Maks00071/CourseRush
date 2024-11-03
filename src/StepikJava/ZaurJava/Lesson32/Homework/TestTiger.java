package StepikJava.ZaurJava.Lesson32.Homework;

public class TestTiger {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger("Bobby");

        tiger1.eat("meat");

        try {
            tiger1.drink("water");
            try {
                tiger1.drink("bear");
            } catch (NotWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("This is a finally block inner try-catch");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
