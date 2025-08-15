package interview;
import java.util.List;

public class ZigZagArray {
    public static int minOperations(List<Integer> arr) {
        if (arr.size() <= 1) {
            return 0;
        }

        int pattern1 = 0; // LHLHL...
        int pattern2 = 0; // HLHLH...

        for (int i = 0; i < arr.size(); i++) {
            // Check for Pattern 1 (LHLHL...)
            if (i % 2 == 0) {
                // Even index should be lower than next (if exists)
                if (i < arr.size() - 1 && arr.get(i) >= arr.get(i + 1)) {
                    pattern1++;
                }
                // Even index should be lower than previous (if exists)
                if (i > 0 && arr.get(i) >= arr.get(i - 1)) {
                    pattern1++;
                }
            } else {
                // Odd index should be higher than next (if exists)
                if (i < arr.size() - 1 && arr.get(i) <= arr.get(i + 1)) {
                    pattern1++;
                }
                // Odd index should be higher than previous (if exists)
                if (i > 0 && arr.get(i) <= arr.get(i - 1)) {
                    pattern1++;
                }
            }

            // Check for Pattern 2 (HLHLH...)
            if (i % 2 == 0) {
                // Even index should be higher than next (if exists)
                if (i < arr.size() - 1 && arr.get(i) <= arr.get(i + 1)) {
                    pattern2++;
                }
                // Even index should be higher than previous (if exists)
                if (i > 0 && arr.get(i) <= arr.get(i - 1)) {
                    pattern2++;
                }
            } else {
                // Odd index should be lower than next (if exists)
                if (i < arr.size() - 1 && arr.get(i) >= arr.get(i + 1)) {
                    pattern2++;
                }
                // Odd index should be lower than previous (if exists)
                if (i > 0 && arr.get(i) >= arr.get(i - 1)) {
                    pattern2++;
                }
            }
        }

        // Each violation may require one replacement, but since some violations
        // can be fixed with a single replacement, we divide by 2
        return Math.min(pattern1 / 2, pattern2 / 2);
    }

    public static void main(String[] args) {
        // Test cases
        List<Integer> arr1 = List.of(1, 2, 3, 4, 5);
        System.out.println(minOperations(arr1)); // Expected: 2

        List<Integer> arr2 = List.of(2, 1, 2, 3, 4, 5, 2, 9);
        System.out.println(minOperations(arr2)); // Expected: 2

        List<Integer> arr3 = List.of(1, 2, 4, 4, 5, 6);
        System.out.println(minOperations(arr3)); // Expected: 2
    }
}