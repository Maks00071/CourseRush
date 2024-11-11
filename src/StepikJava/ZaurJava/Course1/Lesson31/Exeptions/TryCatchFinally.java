package StepikJava.ZaurJava.Course1.Lesson31.Exeptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        int[] someArray = {2, 6, 8};
        System.out.println("This is the some array!");

        try {
            System.out.println(someArray[5]);
            System.out.println("Have a good day!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception was catch: " + e);
        }
        finally {
            System.out.println("This is the finally block!");
        }

        System.out.println("Данный код будет продолжать работать");
    }
}
