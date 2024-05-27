package Module1.Level20;

public class ExceptionThrow {
    public static void main(String[] args) {
         try {
             throw new RuntimeException();
         } catch(Exception except) {
             System.out.println("Перехватили исключение");
             throw except;
         }
    }
}
