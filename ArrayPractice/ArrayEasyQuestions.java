package ArrayPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayEasyQuestions {
    public static void main(String[] args) {

        Integer a = 128;
        Integer b = 128;
        System.out.println(a==b);
        System.out.println(a.equals(b));


//        int []arr = {-5, 8, -14, 2, 4, 12};
//        int k = -5;
//

       // rotate(arr,3);

    }

    /**
     *
     * @param arr this is the array given
     * @return this will return the largest element
     */
    public static int largestElement(int []arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
    public static int findTheSecondLargest(int []arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
        }
        return second;
    }

    /**
     *
     * @param nums this is the given array.
     * @return we have to return weather our given array is sorted or not.
     */

    public static boolean checkSorted(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        if(count<=1){
            return true;
            }
        return false;
    }

    /**
     *
     * @param nums this is the array given
     * @return need to return the value of unique element
     */
    public static int removeDuplicates(int[] nums){
        int index = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }

    /**
     *
     * @param nums this is the array given
     * @param k we have to rotate the array by k place
     */

    public static void rotate(int[] nums, int k){

        /**
         * Input: nums = [1,2,3,4,5,6,7], k = 3
         * Output: [5,6,7,1,2,3,4]
         */
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=0;i<nums.length-k;i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-k-count1];
            nums[nums.length-k-count1] = temp;
            count1++;
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        for(int i=nums.length-k;i<nums.length;i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-count2];
            nums[nums.length-1-count2] = temp;
            count2++;

        }

        System.out.println(" ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        for(int i = 0;i<nums.length;i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-count3];
            nums[nums.length-1-count3] = temp;
            count3++;
        }

        System.out.println(" ");
//      System.out.println(count3+""+count1+""+count2);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
//          System.out.println(count3+""+count1+""+count2);
        }

    }


    /**
     *
     * @param nums this is the array given.
     *             we have to move zero at the end .
     *
     */
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for(int i=index+1;i<nums.length;i++){
            nums[i] = 0;
        }
    }


    /**
     *
     * @param arr this is the array given.
     * @return return the number which we have to find.
     */
    public static int linearSearch(int []arr, int k){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return 0;
    }

    /**
     * find the union of the number
     *
     */

    public static void findUnion(){
        System.out.println("This is the union");

    }

    /**
     *
     * @param nums this is the array given
     * @return this is the missing number which we have to return
     */
    public int missingNumber(int[] nums){
        /**
         * Input: nums = [3,0,1]
         *
         * Output: 2
         */
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int actualSum = 0;
        for(int i=0;i<nums.length;i++){
            actualSum = actualSum+nums[i];
        }
        return sum-actualSum;
    }

    /**
     *
     * @param nums this is the array which is given.
     * @return max consecutive one
     */

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                count++;
                max = Math.max(max,count);
            }
            else {
                count = 0;
            }
        }
        return max;
    }

    /**
     *
     * @param nums this is the array given
     * @return this is what we have to return . which number occurs only once.
     */
    public static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }

        }
        for(Map.Entry<Integer,Integer>map1: map.entrySet()) {
            if(map1.getValue()==1){
                return map1.getKey();
            }
        }
        return 0;

/**
 *  This is the most optimal solution we have .
 *  By using XOR operator . it will cancel out the duplicate values and will give the actual values.
 */
//        public class SingleNumber {
//            public int singleNumber(int[] nums) {
//                int result = 0;
//                for (int num : nums) {
//                    result ^= num;  // XOR each number
//                }
//                return result;
//            }
//        }

    }

    /**
     *
     * @param arr this is the array which is given to us.
     * @param k this is the value sum .
     * @return number is positive
     */
    public static int longestSubarraykpositive(int[] arr, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        int n = arr.length;
        while(r<n){
            sum = sum+arr[r];
            while (sum>k){
                sum = sum-arr[l];
                l = l+1;
            }
            if(sum<=k) {
                maxLen = Math.max(maxLen, r - l + 1);
                r = r + 1;
            }
            }
        return maxLen;
    }


    /**
     *
     * @param arr this is the given array
     * @param k this is the sum value
     * @return we have to return the longest value . and given numbers are positive and negative as well
     */
    public static int longestSubarraykPositiveAndNegative(int[] arr, int k) {
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        int prefixSum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // Case 1: whole array till i has sum = k
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // Case 2: check if prefixSum - k exists
            if (sumIndexMap.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - sumIndexMap.get(prefixSum - k));
            }

            // Store prefixSum only if first occurrence
            sumIndexMap.putIfAbsent(prefixSum, i);
        }

        return maxLen;
    }
    }
