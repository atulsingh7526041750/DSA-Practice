package stringplaylist;

import java.util.PriorityQueue;

public class KthSmallestSubarraySum {


    private static KthSmallestSubarraySum kthSmallestSubarraySum = null;

    private KthSmallestSubarraySum(){}

    public static KthSmallestSubarraySum getInstance(){
        if(kthSmallestSubarraySum==null){
            kthSmallestSubarraySum  = new KthSmallestSubarraySum();

        }
        return kthSmallestSubarraySum;
    }


    public static int kthSmallestSum(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Generate all possible subarrays and store their sums in the heap
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                minHeap.add(sum);
            }
        }

        // Pop from the heap k-1 times to get the kth smallest sum
        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 4};
        int k = 4;
        System.out.println(kthSmallestSum(arr, k)); // Output: 10
    }
}
