package ArrayPractice;

public class isSorted {
    public static void main(String[] args) {
        int [] nums = {4,5,1,2,3};
        int count = 0; // Count the number of "decreasing" pairs
        int n = nums.length;
/**
 *
 */
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
/**
 *
 */
        if(count<=1){
        // The array is a rotated sorted array if there is at most one decreasing pair
        System.out.println("sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
}
