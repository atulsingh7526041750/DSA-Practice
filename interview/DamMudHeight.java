package interview;

import java.util.Arrays;
import java.util.List;

public class DamMudHeight {
    public static int maxHeight(int[] wallPositions, int[] wallHeights) {
        int maxMudHeight = 0;

        for (int i = 1; i < wallPositions.length; i++) {
            int leftPos = wallPositions[i - 1];
            int rightPos = wallPositions[i];
            int leftHeight = wallHeights[i - 1];
            int rightHeight = wallHeights[i];

            int gap = rightPos - leftPos - 1;
            if (gap <= 0) continue; // No space for mud

            int minWallHeight = Math.min(leftHeight, rightHeight);
            int maxWallHeight = Math.max(leftHeight, rightHeight);
            int diff = maxWallHeight - minWallHeight;

            if (gap <= diff) {
                // Can't fill the entire gap with increasing mud
                maxMudHeight = Math.max(maxMudHeight, minWallHeight + gap);
            } else {
                // Calculate the peak height
                int remainingGap = gap - diff;
                int peak = maxWallHeight + (remainingGap + 1) / 2;
                maxMudHeight = Math.max(maxMudHeight, peak);
            }
        }

        return maxMudHeight;
    }



    public static List<Long> divided(List<List<Long>> arr) {
        int n = arr.size();
        long p1 = 0, p2 = 0, p3 = 0, p4 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // skip diagonals
                if (i == j || i + j == n - 1) continue;

                if (i < j && i + j < n - 1) {
                    // P2 (top side)
                    p2 += arr.get(i).get(j);
                } else if (i < j && i + j > n - 1) {
                    // P3 (right side)
                    p3 += arr.get(i).get(j);
                } else if (i > j && i + j > n - 1) {
                    // P4 (bottom side)
                    p4 += arr.get(i).get(j);
                } else if (i > j && i + j < n - 1) {
                    // P1 (left side)
                    p1 += arr.get(i).get(j);
                }
            }
        }

        return Arrays.asList(p1,p2,p3,p4);

    }
    // 2 1 10
    // 2 1 5



    public static void main(String[] args) {
        // Test cases
        int[] positions1 = {1, 2, 4, 7};
        int[] heights1 = {4, 6, 8, 11};
        System.out.println(maxHeight(positions1, heights1)); // Expected: 10

        int[] positions2 = {1, 3, 7};
        int[] heights2 = {4, 3, 3};
        System.out.println(maxHeight(positions2, heights2)); // Expected: 5

        int[] positions3 = {1, 10};
        int[] heights3 = {1, 5};
        System.out.println(maxHeight(positions3, heights3)); // Expected: 7
//
//        int[] positions4 = {2, 1, 10};
//        int[] heights4 = {2, 1, 5};
//        System.out.println(maxHeight(positions4, heights4)); // Expected: 7


        List<List<Long>> matrix = Arrays.asList(
                Arrays.asList(1L,2L,2L,1L),
                Arrays.asList(5L,1L,1L,3L),
                Arrays.asList(5L,1L,1L,3L),
                Arrays.asList(1L, 4L, 4L, 1l)

        );

        List<Long> result = divided(matrix);
        System.out.println("P1 (Left):   " + result.get(0));
        System.out.println("P2 (Top):    " + result.get(1));
        System.out.println("P3 (Right):  " + result.get(2));
        System.out.println("P4 (Bottom): " + result.get(3));

    }
}