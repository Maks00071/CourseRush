package Module2.Level3.Lesson.InterfaceStudent;

public class Solution {
    public static void main(String[] args) {
        Student student = new StudentImpl("Ali");
        System.out.println(student.getName());
    }
}
