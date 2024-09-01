package StepikJava.ZaurJava.Lesson16;

public class MethodsOfString {
    public static void main(String[] args) {
        String strTest = "How are you? :) ";

        // .length() - длина строки
        int strLength = strTest.length();
        System.out.println(strLength);  //=> 16

        System.out.println("---------------------------------------------------");

        // .charAt(int index) - символ из строки по индексу
        char letter = strTest.charAt(5);
        System.out.println(letter); //=> 'r'

        System.out.println("---------------------------------------------------");

        // .indexOf(char c)     -- получить символ из строки или первое вхождение строки
        // .indexOf(String s)
        // .indexOf(char c, int fromIndex)      -- -#- + с какого индекса начать
        // .indexOf(String s, int fromIndex)
        int intChar = strTest.indexOf('y');
        System.out.println(intChar);    //=> 8
        int intString = strTest.indexOf("are");
        System.out.println(intString);  //=> 4
        int intChar2 = strTest.indexOf('o', 5);
        System.out.println(intChar2);   //=> 9
        int intString2 = strTest.indexOf("ou", 3);
        System.out.println(intString2); //=> 9

        System.out.println("---------------------------------------------------");

        // .startsWith(String prefix)   -- начинается ли строка с prefix
        // .startsWith(String prefix, int from) -- начинается ли строка с prefix, начинать с индекса from
        boolean strWith = strTest.startsWith("How");
        System.out.println(strWith);    //=> true
        boolean strWith2 = strTest.startsWith("are", 4);
        System.out.println(strWith2);   //=> true

        System.out.println("---------------------------------------------------");

        // .endsWith(String suffix) -- заканчивается ли строка на suffix
        boolean endWith = strTest.endsWith(":) ");
        System.out.println(endWith);    //=> true
        boolean endWith2 = strTest.endsWith(":)");
        System.out.println(endWith2);   //=> false

        System.out.println("---------------------------------------------------");

        // .substring(int beginIndex)   -- вернуть подстроку, начиная с beginIndex
        // .substring(int beginIndex, int endIndex) -- вернуть подстроку, начиная с beginIndex по endIndex (не вкл)
        String substr1 = strTest.substring(2);
        System.out.println(substr1);    //=> "w are you? :) "
        String substr2 = strTest.substring(2, 6);
        System.out.println(substr2);    //=> "w ar"

        System.out.println("---------------------------------------------------");

        // .trim() -- удаление пробелов по краям строки
        String strTrim = strTest.trim();
        System.out.println(strTrim);    //=> "How are you? :)"

        System.out.println("---------------------------------------------------");

        // .replace(char oldChar, char newChar)
        // .replace(String oldString, String newString)
        System.out.println(strTest);    //=> "How are you? :) "

        String charReplace = strTest.replace('o', '!');
        System.out.println(charReplace);    //=> "H!w are y!u? :) "
        String stringRepl = strTest.replace("you", "they");
        System.out.println(stringRepl); //=> "How are they? :) "

        System.out.println("---------------------------------------------------");

        // .concat(String) -- конкатенация строк
        String newStr = strTest.concat(" ;D");
        System.out.println(newStr); //=> "How are you? :)  ;D"

        System.out.println("---------------------------------------------------");

        // .toLowerCase() -- строку в нижний регистр
        String lowerStr = strTest.toLowerCase();
        System.out.println(lowerStr);   //=> how are you? :)

        System.out.println("---------------------------------------------------");

        // .toUpperCase() - строку в верхний регистр
        String upperStr = strTest.toUpperCase();
        System.out.println(upperStr);   //=> "HOW ARE YOU? :) "

        System.out.println("---------------------------------------------------");

        // .contains(String str) -- содержится ли str в строке
        boolean contStr = strTest.contains("are");
        System.out.println(contStr);    //=> true

        System.out.println("---------------------------------------------------");

        // method chaining
        String str1 = strTest.toUpperCase().trim().toLowerCase().replace("you", "they");
        System.out.println(str1);   //=> "how are they? :)"

    }
}



























