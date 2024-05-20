package Module1.Level19.Tasks.TaskJavarushQuest;

public class Solution {
    public static void main(String[] args) {
        JavarushQuest[] javarushQuests = JavarushQuest.values();

        for (JavarushQuest elem : javarushQuests) {
            System.out.println(elem.ordinal());
        }
    }
}
