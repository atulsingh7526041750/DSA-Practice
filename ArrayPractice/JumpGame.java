package ArrayPractice;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(nums.length);

        JumpGame jumpGame  = new JumpGame();
        jumpGame.canJump(nums);
        System.out.println(jumpGame.canJump(nums));



    }

    /**
     * Example 1:
     *
     * Input: nums = [2,3,1,1,4]
     * Output: true
     * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
     * Example 2:
     *
     * Input: nums = [3,2,1,0,4]
     * Output: false
     * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
     * @param nums
     * @return
     */
    public  boolean canJump(int[] nums) {
        int length = nums.length-1;
        int index = 0;
        while (index< length){
            if (nums[index]==0){
                return false;
            }
            index = index + nums[index];
        }
        if(index>=length){
            return true;
        }
        return false;
    }
}
