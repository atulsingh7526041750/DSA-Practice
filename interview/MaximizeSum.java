package interview;
import java.util.*;

public class MaximizeSum {

    public static int maximizeSum(int[] arr, int k) {
        // Convert int[] to Integer[] to use custom comparator
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Sort by absolute value descending
        Arrays.sort(nums, (a, b) -> Math.abs(b) - Math.abs(a));

        // Flip negative values while k > 0
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        // If k is odd, flip the smallest absolute value element
        if (k % 2 == 1) {
            int minAbsIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (Math.abs(nums[i]) < Math.abs(nums[minAbsIndex])) {
                    minAbsIndex = i;
                }
            }
            nums[minAbsIndex] = -nums[minAbsIndex];
        }

        // Calculate the sum
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {-5, -2, -3, 6, 7};
        int k1 = 3;
        System.out.println("Maximum Sum = " + maximizeSum(arr1, k1));  // Output: 23

        int[] arr2 = {4, 2, 1, 9};
        int k2 = 1;
        System.out.println("Maximum Sum = " + maximizeSum(arr2, k2));  // Output: 14
    }
}
