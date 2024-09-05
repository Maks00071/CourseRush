package StepikJava.ZaurJava.Lesson17.Homework;

public class ClassStringBuilder {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("Hello!");
        StringBuilder stb2 = new StringBuilder("Hello!");
        StringBuilder stb3 = new StringBuilder("Hello?");
        StringBuilder stb4 = new StringBuilder("Hello !");

        System.out.println(ravenstvo(stb1, stb2));
        System.out.println(ravenstvo(stb1, stb3));
        System.out.println(ravenstvo(stb1, stb4));
    }

    public static boolean ravenstvo(StringBuilder a, StringBuilder b) {
        if (a.length() == b.length()) {
            String str1 = a.substring(0, a.length());
            String str2 = b.substring(0, b.length());
            return str1.equals(str2);
        }
        return false;
    }
}
