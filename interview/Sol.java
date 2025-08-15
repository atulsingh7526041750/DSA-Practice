package interview;
import java.util.*;

public class Sol {
    public static int solution(int[] inventory, int k) {
        int n = inventory.length;
        int count = 0;

        // For each ending position
        for (int end = 0; end < n; end++) {
            Set<Integer> uniqueItems = new HashSet<>();

            // Expand window backwards from current end position
            for (int start = end; start >= 0; start--) {
                uniqueItems.add(inventory[start]);

                // If we have at least k unique items, this subarray is valid
                if (uniqueItems.size() >= k) {
                    // All subarrays from 0 to start (inclusive) ending at 'end' are valid
                    count += start + 1;
                    break;
                }
            }
        }

        return count;
    }

    // Alternative optimized solution using sliding window
    public static int solutionOptimized(int[] inventory, int k) {
        int n = inventory.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            int uniqueCount = 0;

            for (int j = i; j < n; j++) {
                // Add current element to window
                if (freq.getOrDefault(inventory[j], 0) == 0) {
                    uniqueCount++;
                }
                freq.put(inventory[j], freq.getOrDefault(inventory[j], 0) + 1);

                // If we have at least k unique elements, count this subarray
                if (uniqueCount >= k) {
                    result++;
                }
            }
        }

        return result;
    }

    // Test method
    public static void main(String[] args) {
        // Test case 1: inventory = [1, 2, 1, 1], k = 2
        int[] test1 = {1, 2, 1, 1};
        System.out.println("Test 1 Result: " + solution(test1, 2)); // Expected: 2

        // Test case 2: inventory = [1, 2, 3, 4, 1], k = 3
        int[] test2 = {1, 2, 3, 4, 1};
        System.out.println("Test 2 Result: " + solution(test2, 3)); // Expected: 6

        // Test case 3: inventory = [5, 5, 5, 5], k = 2
        int[] test3 = {5, 5, 5, 5};
        System.out.println("Test 3 Result: " + solution(test3, 2)); // Expected: 0

        // Test case 4: inventory = [5, 5, 5, 5], k = 1
        int[] test4 = {5, 5, 5, 5};
        System.out.println("Test 4 Result: " + solution(test4, 1)); // Expected: 4
    }
}