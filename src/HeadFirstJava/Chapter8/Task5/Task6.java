package HeadFirstJava.Chapter8.Task5;

import java.util.Arrays;


public class Task6 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{8, 2, -7, 0, 10, 0};
        int[] nums2 = new int[]{6, 5, 7};
        merge(nums1, 3, nums2, 2);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        

        int[] arr = nums1.clone();
        int l = 0, r = 0;

        while (l < m && r < n) {
            if (arr[l] < nums2[r]) {
                nums1[l + r] = arr[l++];

            } else {
                nums1[l + r] = nums2[r++];
            }
        }

        while (l < m) {
            nums1[l + r] = arr[l++];
        }

        while (r < n) {
            nums1[l + r] = arr[r++];
        }
        // [6, 5, 8, 2, -7, 0]
    }
}
