package StepikJava.ZaurJava.Lesson20;

public class TwoArrays {
    public static void main(String[] args) {
        int[][] array = new int[][]{{3,7,8}, {4,5}, {9,4,4,6,8,3}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for(int[] arr: array) {
            for(int elem: arr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
