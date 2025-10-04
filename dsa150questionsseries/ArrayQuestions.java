package dsa150questionsseries;

import java.util.HashMap;
import java.util.Map;

public class ArrayQuestions {
    public static void main(String[] args) {
        int[]nums1 = {3,2,3};
//        int m = 3;
//        int n = 3;
//        int[]nums2 = {2,5,6};
//        merge(nums1,m,nums2,n);
//

        int a = majorityElement(nums1);
        System.out.println(a);


    }

    /**
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;          // last element in nums1 (initialized part)
        int p2 = n - 1;          // last element in nums2
        int p = m + n - 1;       // last index in nums1
        // Merge in reverse order
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        // If nums2 still has elements left, copy them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }


        /**
         *
         * @param nums this is the array which is given to us . We have to remove the duplicate from the array so that remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
         * @return
         */

        /**
         * Input: nums = [0,0,1,1,1,1,2,3,3]
         * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
         * Explanation: Your function should return k = 7, with the first seven elements of
         * nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
         * It does not matter what you leave beyond the returned k (hence they are underscores).
         * @param nums
         * @return
         */
        public static int removeDuplicates(int[] nums) {
            int i = 0;
            int j = 0;
            int count = 1;
            while (j<nums.length){
                if(j==nums.length-1){

                     return i;
                }
            if(nums[i]==nums[j]&& count>2){
                j++;
            } else if (nums[j]!=nums[i]) {
                nums[i]=nums[j];
                count=1;
                i++;j++;
            } else if (nums[j]==nums[i] && count<=2) {
                i++;
                nums[i]=nums[j];
                j++;
                count++;
            }
            }
            return 0;
    }


    /**
     *
     * @param nums this is the array which is given to us.
     * @return we have to return the mejority element which occurs more than n/2 times.
     */

    public static int  majorityElement(int[] nums) {
        Map<Integer,Integer>map=  new HashMap<>();
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
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     * Example 2:
     */
    public static void rotate(int[] nums, int k) {

        if(k>nums.length){
            reverseArray(nums,0,nums.length-1,k);

        }
        else{
        reverseArray(nums,0,nums.length-k-1,k);
        reverseArray(nums,nums.length-k,nums.length-1,k);
        reverseArray(nums,0,nums.length-1,k);}




    }
    public static int [] reverseArray(int []nums,int start, int end,int k){
        if(nums.length==1){
            return nums;
        }
        if(k>nums.length){
            if(k%2==0){
                return nums;

            }
            else {
                while (start<end){
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }
                return nums;


            }

        }



        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
