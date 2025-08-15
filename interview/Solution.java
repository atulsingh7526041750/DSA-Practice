package interview;
import java.util.*;

public class Solution {

    public static int maximizeSum(int[] arr, int k) {
        // Convert int[] to Integer[] manually
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        // Sort by absolute value in descending order
        Arrays.sort(nums, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Math.abs(b) - Math.abs(a);
            }
        });

        // Flip negatives while k > 0
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        // If k is odd, flip the smallest absolute value
        if (k % 2 == 1) {
            int minAbsIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (Math.abs(nums[i]) < Math.abs(nums[minAbsIndex])) {
                    minAbsIndex = i;
                }
            }
            nums[minAbsIndex] = -nums[minAbsIndex];
        }

        // Calculate final sum
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    // Main method for local testing
    public static void main(String[] args) {
        int[] arr1 = {-5, -2, -3, 6, 7};
        int k1 = 3;
        System.out.println(maximizeSum(arr1, k1));  // Output: 23

        int[] arr2 = {4, 2, 1, 9};
        int k2 = 1;
        System.out.println(maximizeSum(arr2, k2));  // Output: 14
    }
}
