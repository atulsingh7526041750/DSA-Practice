package ArrayPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayMediumQuestions {
    public static void main(String[] args) {

    }

    /**
     *
     * @param nums this is the given array.
     * @param target this is the target which is equal to the sum of two numbers.
     * @return need to return the array with those two numbers.
     */
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // if no solution
    }

    /**
     *
     * @param nums this is the array which is given to us.
     * @param target target is the sum of two numbers
     * @return we have to return the array containing the two number
     */
    public static int[] twoSumBetter(int[] nums, int target){
        int []arr = new int[2];
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int sum = nums[left]+nums[right];
            if(sum<target){
                left++;
            }
            if(sum>target){
                right--;
            }
            if(sum == target){
                arr[0]  = nums[left];
                arr[1] = nums[right];
            }
        }
        return arr;
    }


    /**
     *
     * @param nums this is the given array.
     */
    public static void sortColors(int[] nums) {
        int count = 0;

        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        for(int i = 0;i<map.get(0);i++){
            nums[i] = 0;
            count++;
        }
        for(int i=0;i<map.get(1);i++){
            nums[count] = 1;
            count++;

        }
        for (int i=0;i<map.get(2);i++){
            nums[count] = 2;
            count++;
        }
    }


    /**
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=  new HashMap<>();
        int ans = 1;
        int n =  nums.length;
        if(nums.length==1){
            return nums[0];
        }

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                int a = map.get(nums[i]);
                map.put(nums[i],a+1);
                int b = map.get(nums[i]);
                System.out.println("till here it has come"+b);
                if(b>(n/2)){
                    System.out.println("till here it has come");
                    ans = nums[i];
                    break;
                }

            }
            else {
                map.put(nums[i],1);
            }
        }
        return ans;
    }


    /**
     *
     * @param nums this is the array we have to rearrange in positive and negative ay.
     * @return I am returning the new array.
     */
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int posIndex = 0;
        int negIndex = 1;
        int arr[] = new int[n];

        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                arr[posIndex] = nums[i];
                posIndex = posIndex+2;
            }
            else {
                arr[negIndex] = nums[i];
                negIndex+=2;
            }
        }
        return arr;
    }

}
