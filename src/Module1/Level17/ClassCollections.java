package Module1.Level17;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ClassCollections {
    public static void main(String[] args) {
        ArrayList<Integer> srcList = new ArrayList<>();
        Collections.addAll(srcList, 99, 98, 97);

        ArrayList<Integer> destList = new ArrayList<>();
        Collections.addAll(destList, 1, 2, 3, 4, 5, 6, 7);

        Collections.copy(destList, srcList);

        for (int i : destList) {
            System.out.println(i);
        }
    }
}




























