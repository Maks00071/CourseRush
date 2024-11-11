package StepikJava.ZaurJava.Course1.Lesson36;

class Solution {
    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                sb.append(' ');
                sb.append(input.charAt(i));
            } else {
                sb.append(input.charAt(i));
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Solution.camelCase("camelCasing"));
    }
}


// String output = input.replaceAll("(\\p{Ll})(\\p{Lu})","$1 $2");