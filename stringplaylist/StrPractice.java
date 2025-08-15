package stringplaylist;

import java.security.PublicKey;
import java.util.*;

public class StrPractice {
    public static void main(String[] args) {
//        String[] strings = {"atul","Atu","At"};
//        System.out.println(reverseWords("Atul singh varanasi"));
//
//        System.out.println(strStr("sabbutsad","mad"));
//
//        System.out.println(longestSubString("abcabcdabc"));

//        System.out.println(isAnagram("deek","keed"));
//        String str = "Absdvnsd";


      //  System.out.println(firstNonRepeatingCharacter("aabbcde"));
//
// String st = "dog dog dog dog";
//
//        System.out.println(wordPattern("abba",st));
//        System.out.println(findShortestSubstring("xabbcacpqr"));


//        System.out.println(strings[0].indexOf("tul"));
////        String str = "Hello From Mumbai";
//        System.out.println(longestCommonPrefix(strings));
//        System.out.println(str.indexOf("t"));
//        char [] chars=  new char[str.length()];
//        System.out.println(chars[0]+" "+chars.length+""+str.charAt(0));
//        int start = 0;
//        for(int i=str.length()-1;i>=0;i--)
//            {
//            chars[start] = str.charAt(i);
//            start++;
//            }
//        for(int i = 0;i< chars.length;i++){
//        System.out.print(chars[i]);}
//
//
//StringBuilder stringBuilder = new StringBuilder();

//        String[]str = {"flower","flow","fl"};
//
////        longestCommonPref(str);
//        System.out.println(longestCommonPref(str));


//        System.out.println(longCom("aabbbdbccccc"));
        System.out.println(checkAnagram("litsen","silent"));


    }

    /**
     * find the longest common prefix
     */

    public static String longestCommonPrefix(String [] strs){
        if(strs.length==0 || strs==null){
            return "";
        }
        String prefix = strs[0].toLowerCase();
        for(int i = 0;i< strs.length;i++){
            while (strs[i].toLowerCase().indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0){
                    return "";
                }
            }
        }
        return prefix;
    }


    //String[]str = {"flower","flow","fl"};
    //Ans = fl
    public static String longestCommonPref(String []str){
        String str1 = str[0];
        for(int i=0;i<str.length;i++){
            while (str[i].toLowerCase().indexOf(str1)!=0){
                str1 = str1.substring(0,str1.length()-1);
            }

            if(str1.length()==0){
                return "";
            }

        }

        return str1;

    }

//    public static char firstNonRep(String str){
//        Map<Character,Integer>map = new LinkedHashMap<>();
//        for(int i=0;i<str.length();i++){
//            if(map.containsKey(str.charAt(i))){
//                map.put(str.charAt(i),map.get(str.charAt(i))+1);
//            }
//            else {
//                map.put(str.charAt(i),0);
//            }
//        }
//
//       for (Map.Entry<Character,Integer>entry: map.entrySet()){
//           if(entry.getValue().equals(0)){
//               return entry.getKey();
//           }
//       }
//       return "dfs";
//    }

//    public static String subString(String str){
//        int left = 0;
//        int right = 0;
//        String ans = "";
//        int maxLength = 0;
//        while (right<str.length()){
//            if(str.charAt(right)==str.charAt(left)){
//                right++;
//
//
//                ans = str.substring(left,right);
//            }
//            else{
//                left = right;
//            }
//
//
//        }
//    }











    /**
     *
     * @param n fizz buzz issues to solve
     * @return
     */

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for( int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");

            }
            else if(i%3==0){
                list.add("Fizz");

            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else{
                list.add(Integer.toString(i));
            }
        }

        return list;

    }

    /**
     *
     * @param s this is the given string
     * @return need to return the lenght of the last word
     */

    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;

    }




    /**
     *
     * @param haystack is the given string
     * @param needle needs to be checked in haystack
     * @return this would be the index of the string
     */

    public static int strStr(String haystack, String needle) {
        for(int i= 0;i<haystack.length()-1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String newStr = haystack.substring(i,i+needle.length());
                if(newStr.equals(needle))
                    return i;

            }
        }
        return -1;

    }


    /**
     *
     * @param s this will be the input string which we have to reverse
     * @return return the final string
     */
    public static String reverseWords(String s) {
        String str = s.trim();
        String[] strings = str.split(" +");
        String str1= "";
        for(int i=strings.length-1;i>=0;i--){
            str1 = str1+strings[i]+" ";
        }
        return str1.trim();


    }
    public static String reverseSingleWord(String str){
        String str1 = "";
        for(int i = str.length()-1;i>=0;i--){
            str1 = str1+str.charAt(i);

        }
        return str1;
    }

    /**
     *
     * @param str this is the input string method is taking
     * @return we have to return the longest sub string from the method.
     */
    public static int longestSubString(String str){

       int left=0;
       int right = 0;
       int len = 0;
        HashSet<Character> set = new HashSet<>();
        while (right<str.length()){
            if(!set.contains(str.charAt(right))){
                set.add(str.charAt(right));
                len = Math.max(len,right-left+1);
                right++;
            }
            else{
                set.remove(str.charAt(left));
                left++;
            }
        }
        return len;

    }


    /**
     *
     * @param s this is the string input
     * @param t this is the string input
     * @return we have to retunr whether two string are equal or not like anagram
     */
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] characters = s.toCharArray();
        char[] chars = t.toCharArray();
        Arrays.sort(characters);
        Arrays.sort(chars);
        if(Arrays.equals(characters,chars)){
            return true;
        }


        return false;
    }

    /**
     *
     * @param str this is the input string
     * @return we have to return the first non repeating character
     */
    public static int firstNonRepeatingCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
            else {
                continue;
            }
        }
        return -1;
    }




//    public static String reverseVowelOfString(String str){
//        int left = 0;
//        int right = str.length()-1;
//        String st = "aeiou";
//
//    }

    public static int findShortestSubstring(String s) {
        int n = s.length();
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // If all characters are already distinct, return 0
        boolean allDistinct = true;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                allDistinct = false;
                break;
            }
        }
        if (allDistinct) return 0;

        // Find the shortest substring to remove
        int minLen = n;

        // Try each possible substring
        for (int i = 0; i < n; i++) {
            int[] tempFreq = freq.clone();

            for (int j = i; j < n; j++) {
                // Remove character at position j from frequency
                tempFreq[s.charAt(j) - 'a']--;

                // Check if all remaining characters are distinct
                boolean distinct = true;
                for (int k = 0; k < 26; k++) {
                    if (tempFreq[k] > 1) {
                        distinct = false;
                        break;
                    }
                }

                if (distinct) {
                    minLen = Math.min(minLen, j - i + 1);
                    break; // Found minimum for this starting position
                }
            }
        }

        return minLen;
    }

    public static boolean isPalindrome(String s) {
        String st = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int first = 0;
        int last = st.length()-1;
        while(first<last){
            if(st.charAt(first)==st.charAt(last)){
                first++;
                last--;
            }
            else{
                return false;
            }
        }
        return false;


    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[]st = s.split(" ");
        if(pattern.length()!=st.length){
            return false;

        }
        else {

            for(int i=0;i<pattern.length();i++){
                if(map.containsKey(pattern.charAt(i))){
                    if(map.get(pattern.charAt(i)).equals(st[i])){
                        continue;

                    }
                    else {
                        return false;
                    }
                }
                else {
                    if(map.containsValue(st[i])){
                        return false;
                    }
                    else {
                    map.put(pattern.charAt(i),st[i]);}
                }
            }
        }

        return true;

    }


    public static int longCom(String str){
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int ans = 0;
        int a=0;
        int b = 0;


        while (right<str.length()){
            if(str.charAt(right)==str.charAt(left)){
                right++;
                ans = right-left+1;
                if(ans>maxLen){
                maxLen = Math.max(maxLen,right-left+1);
                a = left;
                b = right;
                }
            }
            else {
                left = right;
            }
        }


        return maxLen-1;
    }


    public static boolean checkAnagram(String str1, String str2){
        int[] arr = new int[26];
        if(str2.length()!=str1.length()){
            return false;
        }
        for (int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']++;
            arr[str2.charAt(i)-'a']--;
        }
        for(int count:arr){
            if(count!=0){
                return false;
            }
        }
        return true;

    }








}
