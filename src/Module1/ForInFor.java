package Module1;

/*
вложенные циклы для обхода матриц
 */

public class ForInFor {
    public static void main(String[] args) {
        int[][] array = {
                        {0, 1, 2, 3, 4},
                        {1, 2, 3, 4, 5},
                        {2, 3, 4, 5, 6},
                        {3, 4, 5, 6, 7}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
