package interview;

import java.util.*;

class Node {
    int value;
    int index;
    Node prev;
    Node next;

    public Node(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

public class Solution2 {
    public static int findTotalWeight(int[] cans) {
        if (cans == null || cans.length == 0) return 0;

        int n = cans.length;
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> {
            if (a.value != b.value) return a.value - b.value;
            return a.index - b.index;
        });

        // Create doubly linked list and populate heap
        Node[] nodes = new Node[n];
        Node dummyHead = new Node(-1, -1);
        Node dummyTail = new Node(-1, -1);
        Node prev = dummyHead;

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(cans[i], i);
            prev.next = nodes[i];
            nodes[i].prev = prev;
            prev = nodes[i];
            minHeap.add(nodes[i]);
        }

        prev.next = dummyTail;
        dummyTail.prev = prev;

        int total = 0;

        while (!minHeap.isEmpty()) {
            Node current = minHeap.poll();

            // Skip if already removed
            if (current.prev == null && current.next == null) continue;

            total += current.value;

            // Determine left and right boundaries
            Node left = current.prev;
            Node right = current.next;

            // Remove current and its adjacent nodes
            Set<Node> toRemove = new HashSet<>();
            toRemove.add(current);

            if (left != dummyHead) toRemove.add(left);
            if (right != dummyTail) toRemove.add(right);

            // Remove nodes from the linked list and mark them as removed
            for (Node node : toRemove) {
                if (node.prev != null) node.prev.next = node.next;
                if (node.next != null) node.next.prev = node.prev;
                node.prev = null;
                node.next = null;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(findTotalWeight(new int[]{5, 4, 1, 3, 2})); // 3
        System.out.println(findTotalWeight(new int[]{6, 4, 9, 10, 34, 56, 54})); // 68
        System.out.println(findTotalWeight(new int[]{132, 45, 65, 765, 345, 243, 75, 67})); // 1120
    }
}