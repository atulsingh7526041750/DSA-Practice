package dsa150questionsseries;

public class SlidingWindow {
    public static void main(String[] args) {

    }

    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int start = 0;
        int mover = 0;
        int count = 0;

        while (sum<target){
            sum = sum+nums[mover];
            mover++;
            count++;


        }

        return 1;


    }
}
