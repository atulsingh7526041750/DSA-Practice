package interview;
import java.util.*;

public class ResourceProcessor {

    public static int calculateCycles(String[] resources, int conversionRate) {
        // Use LinkedList for efficient front/back operations
        LinkedList<String> queue = new LinkedList<>(Arrays.asList(resources));
        int cycleCount = 0;

        while (true) {
            int pCountFromEnd = 0;

            // Count trailing P's from the end
            ListIterator<String> reverseItr = queue.listIterator(queue.size());
            while (reverseItr.hasPrevious()) {
                if (!reverseItr.previous().equals("P")) break;
                pCountFromEnd++;
            }

            // Rule 1: Convert P → A
            if (pCountFromEnd >= conversionRate) {
                for (int i = 0; i < conversionRate; i++) {
                    queue.removeLast();
                }
                queue.addFirst("A");
            }
            // Rule 2: Convert last A → P
            else if (queue.contains("A")) {
                for (int i = queue.size() - 1; i >= 0; i--) {
                    if (queue.get(i).equals("A")) {
                        queue.set(i, "P");
                        break;
                    }
                }
            }
            // Rule 3: No operation can be applied
            else {
                break;
            }

            cycleCount++;
        }

        return cycleCount;
    }

    // Example usage
    public static void main(String[] args) {
        String[] case1 = {"A", "A", "A", "P", "P", "P"};
        System.out.println("Cycles: " + calculateCycles(case1, 2));  // Output: 13

        String[] case2 = {"A", "A"};
        System.out.println("Cycles: " + calculateCycles(case2, 2));  // Output: 4

        String[] case3 = {"P", "P", "P"};
        System.out.println("Cycles: " + calculateCycles(case3, 3));  // Output: 2
    }
}
