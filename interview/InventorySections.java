package interview;import java.util.HashMap;

public class InventorySections {

    public static int solution(int[] inventory, int k) {
        return countAtLeastKUnique(inventory, k) - countAtLeastKUnique(inventory, k + 1);
    }

    private static int countAtLeastKUnique(int[] nums, int k) {
        if (k == 0) return 0;

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            // Add current element to the frequency map
            frequencyMap.put(nums[right], frequencyMap.getOrDefault(nums[right], 0) + 1);

            // Shrink the window from the left if the number of unique elements exceeds k
            while (frequencyMap.size() > k) {
                frequencyMap.put(nums[left], frequencyMap.get(nums[left]) - 1);
                if (frequencyMap.get(nums[left]) == 0) {
                    frequencyMap.remove(nums[left]);
                }
                left++;
            }

            // All subarrays ending at right with <= k unique elements
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] inventory1 = {1, 2, 1, 1};
        int k1 = 2;
        System.out.println("Test Case 1:");
        System.out.println("Input: [1, 2, 1, 1], k = 2");
        System.out.println("Expected Output: 2");
        System.out.println("Actual Output: " + solution(inventory1, k1));
        System.out.println();

        // Test case 2
        int[] inventory2 = {1, 2, 3, 4, 1};
        int k2 = 3;
        System.out.println("Test Case 2:");
        System.out.println("Input: [1, 2, 3, 4, 1], k = 3");
        System.out.println("Expected Output: 6");
        System.out.println("Actual Output: " + solution(inventory2, k2));
        System.out.println();

        // Test case 3
        int[] inventory3 = {5, 5, 5, 5};
        int k3 = 2;
        System.out.println("Test Case 3:");
        System.out.println("Input: [5, 5, 5, 5], k = 2");
        System.out.println("Expected Output: 0");
        System.out.println("Actual Output: " + solution(inventory3, k3));
        System.out.println();

        // Test case 4
        int[] inventory4 = {5, 5, 5, 5};
        int k4 = 1;
        System.out.println("Test Case 4:");
        System.out.println("Input: [5, 5, 5, 5], k = 1");
        System.out.println("Expected Output: 4");
        System.out.println("Actual Output: " + solution(inventory4, k4));
        System.out.println();

        // Additional test case with all unique elements
        int[] inventory5 = {1, 2, 3, 4};
        int k5 = 4;
        System.out.println("Test Case 5:");
        System.out.println("Input: [1, 2, 3, 4], k = 4");
        System.out.println("Expected Output: 1");
        System.out.println("Actual Output: " + solution(inventory5, k5));
    }
}