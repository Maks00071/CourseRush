package Module1.Level17;
import java.util.HashMap;
import java.util.Scanner;


public class CountLetters {
    public static void main(String[] args) {
        HashMap<Character, Integer> result = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            Character letter = input.charAt(i);

            if (result.containsKey(letter)) {
                Integer oldValue = result.get(letter);
                result.put(letter, oldValue + 1);
            } else {
                result.put(letter, 1);
            }
        }
        System.out.println(result);
    }
}
