package ArrayPractice;

import java.util.HashMap;

public class ArrayLeetCode {
    public static void main(String[] args) {
        int[] nums = {3,7,11,15};
        int []arr = twoSum(nums,6);
        System.out.println(arr[0]+""+arr[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // if no solution
    }
}
