package slidingwindowtwopinter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SlidingWindowTwoPointer {
    public static void main(String[] args) {
       // System.out.println(longestSubString("abcdabcbb"));
        int []arr = {7,1,5,3,6,4};
//        System.out.println(maxConsecutiveOne(arr,2));

        System.out.println(maxProfit(arr));

        
    }

    public static int maxConsecutiveOne(int []arr, int k){
        /**
         * Example 1:
         *
         * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
         * Output: 6
         * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
         * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
         */
        int left=0;
        int right= 0;
        int ans = 0;
        int zero = k;

        List<Integer>list = new ArrayList<>();
        while (right<arr.length){
            if(arr[right]>0){
                right++;
                ans = Math.max(right-left,ans);
            }
            else {
                if(zero>0){
                    right++;
                    zero--;
                    ans = Math.max(right-left,ans);
                }
                else {
                    left++;
                    right++;
                }



            }

        }

        return ans;




    }
    public static int lengthOfLongestSubstring(String s){
        int left = 0;
        int right = 0;
        int maxLen = 0;


        Set<Character>set = new HashSet<>();
        while (right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen,right-left+1);
                right++;

            }
            else {
                set.remove(s.charAt(right));
                left++;


            }


        }

        return maxLen;



    }










    public static int longestSubString(String str){

        /**
         * Input: s = "abcabcbb"
         * Output: 3
         * Explanation: The answer is "abc", with the length of 3.
         */
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int ans=0;
        while (right<str.length()){
            if (!set.contains(str.charAt(right))){
                set.add(str.charAt(right));
                right++;
                ans = Math.max(ans,right-left);
            }
            else {
//                left++;
//                right++;
                set.remove(str.charAt(left));
                left++;
            }
        }
        return ans;
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];

            } else if (prices[i]-minPrice>maxProfit) {
                maxProfit = prices[i]-minPrice;

            }
        }
        return maxProfit;


        }

        /**
         * Input: prices = [7,1,5,3,6,4]
         * Output: 5
         * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
         * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
         * Example 2:
         *
         * Input: prices = [7,6,4,3,1]
         * Output: 0
         * Explanation: In this case, no transactions are done and the max profit = 0.
         */



    }


//    public static int characterReplacement(String s, int k){
//
//    }
//
//





