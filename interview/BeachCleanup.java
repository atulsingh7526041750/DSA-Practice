package interview;

import java.util.*;

public class BeachCleanup {

    static class Can implements Comparable<Can> {
        int weight;
        int index;

        Can(int weight, int index) {
            this.weight = weight;
            this.index = index;
        }

        public int compareTo(Can other) {
            if (this.weight != other.weight) {
                return Integer.compare(this.weight, other.weight);
            }
            return Integer.compare(this.index, other.index);
        }
    }

    public static int findTotalWeight(int[] cans) {
        int n = cans.length;
        boolean[] removed = new boolean[n];
        TreeSet<Can> minHeap = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            minHeap.add(new Can(cans[i], i));
        }

        int total = 0;

        while (!minHeap.isEmpty()) {
            Can current = minHeap.pollFirst();
            int idx = current.index;

            if (removed[idx]) continue;

            // Add the weight of the lightest can chosen
            total += current.weight;

            // Mark this can and its adjacent ones as removed
            removed[idx] = true;
            if (idx > 0) removed[idx - 1] = true;
            if (idx < n - 1) removed[idx + 1] = true;

            // Remove affected cans from the TreeSet
            if (idx > 0) minHeap.remove(new Can(cans[idx - 1], idx - 1));
            minHeap.remove(new Can(cans[idx], idx));
            if (idx < n - 1) minHeap.remove(new Can(cans[idx + 1], idx + 1));
        }

        return total;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(findTotalWeight(new int[]{5, 4, 1, 3, 2})); // 3
        int[] cans1 = {6, 4, 9, 10, 34, 56, 54}; // Output: 68
        int[] cans2 = {132, 45, 65, 765, 345, 243, 75, 67}; // Output: 1120

        System.out.println(findTotalWeight(cans1));
        System.out.println(findTotalWeight(cans2));
    }
}
class M{
    M(){
        super();


        System.out.println();

    }

}
