package interview;

import java.util.*;

class Solution1 {
    public static int minOperations(List<Integer> arr) {
        if (arr.size() <= 2) return 0;

        return Math.min(countOperations(arr, true), countOperations(arr, false));
    }

    private static int countOperations(List<Integer> arr, boolean startsWithLess) {
        int operations = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean shouldBeLess = startsWithLess ^ (i % 2 == 0);

            // Check left neighbor if exists
            if (i > 0) {
                if (shouldBeLess && arr.get(i) >= arr.get(i-1)) {
                    operations++;
                    continue; // Skip right check since we'll fix with this replacement
                }
                if (!shouldBeLess && arr.get(i) <= arr.get(i-1)) {
                    operations++;
                    continue;
                }
            }

            // Check right neighbor if exists
            if (i < arr.size() - 1) {
                if (shouldBeLess && arr.get(i) >= arr.get(i+1)) {
                    operations++;
                }
                if (!shouldBeLess && arr.get(i) <= arr.get(i+1)) {
                    operations++;
                }
            }
        }
        return operations;
    }
    public static void main(String[] args) {
        // Test case 1: [2, 1, 2, 3, 4, 5, 2, 9]
        List<Integer> test1 = Arrays.asList(2, 1, 2, 3, 4, 5, 2, 9);
        System.out.println("Test 1 result: " + minOperations(test1)); // Expected: 2

        // Test case 2: [1, 2, 4, 4, 5, 6]
        List<Integer> test2 = Arrays.asList(1, 2, 4, 4, 5, 6);
        System.out.println("Test 2 result: " + minOperations(test2)); // Expected: 2

        // Additional test cases
        List<Integer> test3 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Test 3 result: " + minOperations(test3)); // Should need operations

        List<Integer> test4 = Arrays.asList(1, 3, 2, 4, 1);
        System.out.println("Test 4 result: " + minOperations(test4)); // Should be 0 or minimal
    }
}