package dsa150questionsseries;

import java.util.HashMap;
import java.util.Map;

public class TwoPointer {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));



    }
    /**
     * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     *
     * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     * Example 1:
     *
     * Input: s = "abc", t = "ahbgdc"
     * Output: true
     * Example 2:
     *
     * Input: s = "axc", t = "ahbgdc"
     * Output: false
     *
     */
    public static boolean isSubsequence(String s, String t) { int sStart = 0;
        int sEnd  = s.length()-1;
        int tStart = 0;
        int tEnd  = t.length()-1;
        if(s.length()==0){
            return true;
        }
        while (tStart<=tEnd){
            if(t.charAt(tStart)==s.charAt(sStart)){
                tStart++;
                sStart++;
            }
            else if(t.charAt(tEnd)==s.charAt(sEnd)) {
                tEnd--;
                sEnd--;
            }
            else {
                tStart++;
                tEnd--;
            }
        }
        if(sStart<=sEnd){
            return false;
        }
        return true;

    }


    /**
     * Two Sum II - Input Array Is Sorted
     * Example 1:
     *
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     * Example 2:
     *
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3]
     * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
     * Example 3:
     *
     * Input: numbers = [-1,0], target = -1
     * Output: [1,2]
     * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>map =new HashMap<>();
        int[]arr = new int[2];
        for(int i=0;i<numbers.length;i++){
            int ans  = target-numbers[i];
            if(map.containsKey(ans)){
                arr[0] = map.get(ans)+1;
                arr[1] = i+1;
                break;
            }
            else {
                map.put(numbers[i],i);
            }
        }
        return arr;

    }




    public static int[] twoSumMoreOptimal(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based index
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // not found
    }




}
