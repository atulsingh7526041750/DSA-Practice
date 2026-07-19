package ArrayPractice;

import java.util.*;

public class ArrayEasyQuestions {
    public static void main(String[] args) {
        int []nums1 = {1,-2147483648,2};
//        int n = Integer.MIN_VALUE;
//        int n2 = -2147483648;
//        boolean res = n2>n?true:false;
//        System.out.println(res);
//        int m = 3;
//        int n = 3;
//        int []nums2 = {9,4,9,8,4};
//       int []arr =  intersection(nums1,nums2);
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        int [][] practiceArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        // Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
        //Output: [[1,0,1],[0,0,0],[1,0,1]]
//        printMatric(practiceArray);
        rotateBest(practiceArray);

//        int [][] practiceArray2 = new int[5][6];
//        System.out.println(thirdMax(nums1));


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
    public static boolean linearSearchBool(int []arr, int k){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
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
        // supose a XOR b XOR a = b
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

    public static int removeDuplicatesTest(int[] nums){
        int index=1;
        int i=0;

        while (index<nums.length) {
            if (nums[i] == nums[index]) {
                index++;
            } else {
                i++;
                nums[i] = nums[index];
            }

        }
        return i+1;

    }
    public static void leftRotateByOnePlace(int[] nums) {
        //3,2,1=> 1,2,3

        for (int i = 0; i < nums.length - 1; i++) {

            int temp = nums[i]; // 3
            nums[i] = nums[i + 1]; // 1
            nums[i + 1] = temp; //
            for (int k = 0; k < nums.length; k++) {
                System.out.print(nums[k] + ", ");
            }
            System.out.println("++++++++++");
        }
    }


    public static void rotateArray(int[]arr,int start, int end){
        int n = end;
        int a=start;
        int b = n-1;
        while (a<b) {
            swap(arr, a, b);
            a++;
            b--;
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void rotateByKPlace(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        rotateArray(nums, 0, n - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, n - 1);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

    public static void moveZeroesTest(int[] nums) {
        int index1 = 0;
        int index2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                nums[index1] = nums[i];
                index1++;
            }
        }
        for(int i=index1;i<nums.length;i++){
            nums[i]=0;
        }
        for (int num:nums
             ) {
            System.out.println(num);

        }

    }
    public static void findMissingNumber(int[] nums) {
        int n = nums.length+1;
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<nums.length;i++){
            sum2 = sum2 + nums[i];
        }
        System.out.println(sum-sum2);

    }

    public static int findMaxConsecutiveOnesTest(int[] nums) {
    int max = 0;
    int count = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            count++;
            max = Math.max(count,max);
        }
        else {
            count = 0;
        }
    }
    return max;
    }


    // brute Force
    public static int longestSubArrayWithSumK(int []arr,int k){
        // int []nums = {1,2,3,1,1,1,1,4,2,3};
        int index1 = 0;
        int index2 = 0;
        int length = 0;
        int currentLength = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];
                if(sum ==k){
                    currentLength = j-i+1;
                    if(currentLength>length){
                        length = currentLength;
                        index1 = i;
                        index2 = j;
                    }

                }
            }
        }
        System.out.println("i ="+index1+" j ="+index2);
        return length;
    }

    public static int longestSubArrayWithSumKBest(int []arr,int k){
        int index1 = 0;
        int index2 = 0;
        int sum = 0;
        int length = 0;
        int a=0;
        int b = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];

            if(sum>k){
                while (sum>k){
                    sum = sum-arr[index1];
                    index1++;
                }
            }
            if(sum == k){

                length = Math.max(length,index2-index1+1);
                // Below part is to find out the exact index of the array
//                int currentLength = index2-index1+1;
//                if(currentLength>length){
//                    length = currentLength;
//                    a = index1;
//                    b = index2;
//                }
            }
            index2++;

        }
        System.out.println(a+" "+ b);
        return length;
    }


    public static int longestSubArrayWithSumKBestByStriver(int []arr,int k){
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int length = 0;
        int n = arr.length;
        while (right<n){
            while (sum>k && left<=right){
                sum = sum-arr[left];
                left++;
            }
            if(sum ==k){
                length = Math.max(length, right-left+1);
            }
            right++;
            if(right<n){
            sum += arr[right];
            }

        }
        return length;
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        int arr[]  = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
              if(nums[i]+nums[j]==target){
                  arr[0] = i;
                  arr[1] = j;
                  break;

              }
            }
        }
        return arr;
    }


    public static int[] twoSumBetter(int[] nums, int target) {
        int arr[]  = new int[2];
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int value = target-nums[i];
           if(map.containsKey(value)){
               arr[0] = map.get(value);
               arr[1] = i;
           }
           map.put(nums[i],i);

        }
        return arr;
    }


    /**
     *IN this if it is asked that don't use map
     * But in this case you will just be able to return boolean otherwise you will have to put it in some other
     * data structure with the index and every number value and then will have to sort it
     */
    public static boolean twoSumBest(int[] nums, int target) {
        int arr[]  = new int[2];
        int left = 0;
        int right = nums.length-1;
        boolean isPresent = false;
        Arrays.sort(nums);
        while (left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                isPresent = true;
                return isPresent;
            } else if (sum>target) {
                right--;

            } else if (sum<target) {
                left++;
            }
        }
        return isPresent;
    }

    public static int maxSubArray(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    /**
     * Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
     * Output: [1, 2, 3, 4, 5, 7]
     * @param arr1
     * @param arr2
     * @return
     */

    public static int[] unionArray(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] union = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

            if (arr1[i] <= arr2[j]) {
                if (k == 0 || union[k - 1] != arr1[i]) {
                    union[k++] = arr1[i];
                }
                i++;
            } else {
                if (k == 0 || union[k - 1] != arr2[j]) {
                    union[k++] = arr2[j];
                }
                j++;
            }
        }

        while (i < n1) {
            if (k == 0 || union[k - 1] != arr1[i]) {
                union[k++] = arr1[i];
            }
            i++;
        }

        while (j < n2) {
            if (k == 0 || union[k - 1] != arr2[j]) {
                union[k++] = arr2[j];
            }
            j++;
        }

        return Arrays.copyOf(union, k);
    }


    public static int[] unionArrayTest(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int [] union = new int[n1+n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                if(k==0 || union[k-1]!=arr1[i]){
                    union[k++] = arr1[i];
                }

                i++;
            }
            else {
                if(k==0 || union[k-1]!=arr2[j]){
                    union[k++] = arr2[j];
                }

                j++;

            }
        }
        while (i<n1){
            if(k==0 || union[k-1]!=arr1[i]){
                union[k++] = arr1[i];
            }

            i++;


        }
        while (j<n2){
            if(k==0 || union[k-1]!=arr2[j]){
                union[k++] = arr2[j];
            }

            j++;

        }
        return Arrays.copyOf(union,k);

    }

    public static int majorityElement(int[] nums) {
        int ans = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){

            if(count == 0 || nums[i] == ans){
                ans = nums[i];
                count++;
            }
            else {
                count--;
            }

        }
        return ans;
    }

    public static int[] rearrangeArray(int[] nums) {
    int n = nums.length;
    int posIndex = 0;
    int negIndex = 1;
    int []arr = new int[n];
    for(int i=0;i<n;i++){
        if(nums[i]>0){
            arr[posIndex] = nums[i];
            posIndex = posIndex+2;
        }
        else {
            arr[negIndex] = nums[i];
            negIndex = negIndex+2;
        }
    }
    return arr;
    }

    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int buyIndex = -1;
        int saleIndex = -1;
        for (int price: prices) {
            if(price<min){
                min = price;
            }
            else {
            maxProfit = Math.max(maxProfit,price-min);
            }
        }
        return maxProfit;
    }

    //prices = [7,1,5,3,6,4]
    public static int maxProfitWithIndex(int[] prices){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int buyIndex = -1;
        int saleIndex = -1;
        for (int i = 0;i<prices.length;i++) {
            if(prices[i]<min){
                min = prices[i];
                buyIndex = i;
            }
            else {
                if((prices[i]-min)>maxProfit ){
                    maxProfit = prices[i]-min;
                    saleIndex = i;
                }
//                maxProfit = Math.max(maxProfit,prices[i]-min);
            }
        }
        System.out.println(buyIndex + " " + saleIndex);
        return maxProfit;
    }

    /**
     * Input: nums = [1, 2, 5, 3, 1, 2]
     *
     * Output: [5, 3, 2]
     * @param nums
     * @return
     */
    public static int longestConsecutive(int[] nums) {
        int maxCount  = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            int n = nums[i];
            while (linearSearchHelper(nums,n++)){
                    count++;
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
    /**
     * Input: nums = [1, 2, 5, 3, 1, 2]
     * [1,1,2,2,3,5]
     * Output: [5, 3, 2]
     * @param nums
     * @return
     */
    public static int longestConsecutiveBetter(int[] nums) {
        Arrays.sort(nums);
        int maxCount = 0;
        int count = 0;
        for(int i=1;i<nums.length;i++){
            int last = nums[i-1];
            int number = nums[i];
            if(number == last){
                count = 0;
                continue;
            } else if (number == last + 1 ) {
                count++;
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
        }


    public static int longestConsecutiveBest(int[] nums) {
        int n = nums.length;
        Set<Integer>set = new HashSet<>();
        int maxCount = 1;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for (Integer num:set) {
            if(!set.contains(num-1)){
                int count = 1;
                int x = num;
                while (set.contains(x+1)){
                    x = x+1;
                    count = count+1;
                }
                maxCount = Math.max(maxCount,count);

            }
            }
        return maxCount;
    }

    /**
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     * @param nums
     * @param n
     * @return
     */
    public static boolean linearSearchHelper(int[] nums,int n) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == n){
                return true;
            }
        }
        return false;
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    /**
     * Example 1:
     *
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2]
     * Example 2:
     *
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [9,4]
     * Explanation: [4,9] is also accepted.
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        int length  = nums1.length>nums2.length?nums2.length:nums1.length;
        int [] newArray = new int[length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        //    * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        // 4,5,9
        // 4,4,8,9,9
        while (i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            } else if (nums1[i]>nums2[j]) {
                j++;
            } else if (nums1[i] == nums2[j]) {
               if(k==0 || newArray[k-1] != nums1[i]){
                   newArray[k] = nums1[i];
                   k++;
                   i++;
                   j++;
               }
               else {
                   i++;
                   j++;
               }

            }
        }
        return Arrays.copyOf(newArray,k);
    }


    // [1,2,2,5,3,5]
    // [1,2,-2147483648]
    // 1,-2147483648,2
    // need to recheck below code
    public static int thirdMax(int[] nums) {
            Long max = null;
            Long max_second = null;
            Long max_third = null;

            for(int i=0;i<nums.length;i++){
                long val = nums[i];
                if((max != null && nums[i] == val ) || (max_second != null && nums[i] == val )|| (max_third != null && nums[i] == val )){
                    continue;
                }
             if(max == null || val>max){
                 max_third = max_second;
                 max_second = max;
                 max = val;
             } else if (max_second == null || val>max_second) {
                 max_third = max_second;
                 max_second = val;
             }else if (max_third == null || val>max_third) {
                 max_third = val;
             }
            }
            return (max_third == null?max.intValue():max_third.intValue());
        }

    /**
     *
     * @param nums
     * @return
     */
    // 3,3,3
    // 4,3,2,7,8,2,3,1
    // -4,-3,-2,-7,8,2,-3,-1
    // 1,2,2,3,3,4,7,8
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>0){
                list.add(j+1);
            }
        }
        return list;
    }


    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while (start<=end){char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public static void printMatric(int[][]arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[i][j]);
            }
        }
    }

    /**
     * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[1,0,1],[0,0,0],[1,0,1]]
     * @param matrix
     */
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    markRow(matrix,i);
                    markColumn(matrix,j);
                }

            }
        }
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }

            }
        }
        printMatric(matrix);
    }
    public static void setZeroesBetter(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    row[i]=1;
                    col[j]=1;
                }

            }
        }
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;

                }

            }
        }
        printMatric(matrix);
    }

    public static void markRow(int[][] matrix,int i) {
        int n = matrix[0].length;
        for(int j=0;j<n;j++){
            matrix[i][j]=-1;
        }
    }
    public static void markColumn(int[][] matrix,int j) {
        int m = matrix.length;
        for(int i=0;i<m;i++){
            matrix[i][j]=-1;
        }
    }

    /**
     * below one is the brute force solution
     *
     * @param matrix
     */

    public static void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][]newArr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                newArr[i][j] = matrix[m-j-1][i];

            }
        }
        printMatric(newArr);

    }

    /**
     * in this solution we have done in the matrix itself
     * so first thing we did was transpose matrix
     * second thing we did was reverse the rows
     * @param matrix
     */
    public static void rotateBest(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                }
            }
        }
        printMatric(matrix);

    }
}







