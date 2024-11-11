package StepikJava.ZaurJava.Course1.Lesson17;

public class ClassStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        // methods of StringBuilder//

        // .length() -> int
        int x = sb2.length();
        System.out.println(x);  // 11

        System.out.println("--------------------");

        // .charAt(int index) -> char
        char letter = sb2.charAt(5);
        System.out.println(letter); // "D"

        System.out.println("--------------------");

        // .indexOf(String s) -> int
        // .indexOf(String s, int fromIndex) -> int
        int index1 = sb2.indexOf("d");
        int index2 = sb2.indexOf("o", 2);
        System.out.println(index1); // 3
        System.out.println(index2); // 2

        System.out.println("--------------------");

        // .substring(int beginIndex) -> String
        // .substring(int beginIndex, int endIndex) -> String
        String subStr1 = sb2.substring(5);
        String subStr2 = sb2.substring(5, 8);
        System.out.println(subStr1);  // "Day!!!"
        System.out.println(subStr2);  // "Day"

        System.out.println("--------------------");

        // .subsequence(int start, int end) -> CharSequence
        CharSequence charSeq = sb2.subSequence(5, 8);
        System.out.println(charSeq);  // Day

        System.out.println("--------------------");

        // .append(dataType dt) -> StringBuilder
        System.out.println(sb2);  // "Good Day!!!"
        sb2.append(" And see you tomorrow!");
        System.out.println(sb2);  // "Good Day!!! And see you tomorrow!"

        System.out.println("--------------------");

        // .insert(int toIndex, dataType dt) -> StringBuilder
        sb3.append("How ae you?");
        System.out.println(sb3);
        sb3.insert(5, "r");
        System.out.println(sb3);  // "How are you?"

        System.out.println("--------------------");

        // .delete(int start, int end) -> StringBuilder
        sb3.delete(8, 13);
        System.out.println(sb3);
        sb3.append("we?");
        System.out.println(sb3);  // "How are we?"

        // .deleteCharAt(int index) -> StringBuilder
        System.out.println(sb2);  // ""Good Day!!! And see you tomorrow!""
        sb2.deleteCharAt(11);
        System.out.println(sb2);  // "Good Day!!!And see you tomorrow!"

        System.out.println("--------------------");

        // .reverse() -> StringBuilder
        sb2.insert(11, " ");
        System.out.println(sb2);  // "Good Day!!! And see you tomorrow!"
        sb2.reverse();
        System.out.println(sb2);  // "!worromot uoy ees dnA !!!yaD dooG"

        System.out.println("--------------------");

        // .replace(int start, int end, String s) -> StringBuilder
        sb2.reverse().replace(0, 8, "Goog morning");
        System.out.println(sb2);  // "Goog morning!!! And see you tomorrow!"

        System.out.println("--------------------");

        // .capacity() -> int
        int cap = sb3.capacity();
        System.out.println(cap);  // 50
    }
}


























