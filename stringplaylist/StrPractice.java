package stringplaylist;

import java.security.PublicKey;
import java.util.*;

public class StrPractice {
    public static void main(String[] args) {
        String str1 = "abccccdd";

        String str2 = "b23";
        String str3 = "aeiou";
//        System.out.println(str1.charAt(0) == 'I');


       System.out.println(longestPalindrome(str1));

       String str = "1234";
       String[] str12 = str.split("");
        System.out.println(str12[0]);



//        System.out.println(checkAnagram("litsen","silent"));


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
    public static int strStri(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)  && needle.length()<=haystack.length()){

                if(i+needle.length()<=haystack.length() && haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }

            }
        }
        return -1;
    }

    /**
     * Input: s = "egg", t = "add"
     * Output: true
     */
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character>map = new HashMap<>();
        if(s.length()==t.length()){
            int first = 0;
            int second = 0;
            while (first<s.length() && second<t.length()){
                if(map.containsKey(s.charAt(first)) && !map.get(s.charAt(first)).equals(t.charAt(second)) || !map.containsKey(s.charAt(first)) && map.containsValue(t.charAt(second))){
                    return false;
                }
                if(map.containsKey(s.charAt(first)) && map.get(s.charAt(first)).equals(t.charAt(second))){
                    first++;
                    second++;
                }

                else {
                    map.put(s.charAt(first),t.charAt(second));
                    first++;
                    second++;
                }
            }

        }
        else {
            return false;
        }
        return true;
    }


    /**
     *
     * @param s
     * @return
     */

        public String reverseVowels(String s) {
            int first = 0;
            char[]chars = s.toCharArray();
            int last = s.length()-1;
            while (first<=last){
                while (first<=last && !isVowel(chars[first])){
                    first++;
                }
                while (first<=last && !isVowel(chars[last])){
                    last--;
                }
                if (first >= last) {
                    break;
                }
                if (first < last) {
                    char temp = chars[first];
                    chars[first] = chars[last];
                    chars[last] = temp;
                    first++;
                    last--;
                }
            }
            return new String(chars);
        }
        public  boolean isVowel(char ch) {
            ch = Character.toLowerCase(ch);
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }



        //

    public static int longestPalindrome(String s) {
            char[]chars = s.toCharArray();
            int count =0;
            int count2 = 0;
            int longest = 0;
            Map<Character,Integer>map = new HashMap<>();
            for (int i=0;i<s.length();i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
                else {
                    map.put(s.charAt(i),1);
                }
            }
            for (Map.Entry<Character,Integer> entry:map.entrySet()){
                if(entry.getValue() == 1){
                    count =1;
                }
                else {
                    if(entry.getValue()%2 == 0){
                        longest = longest + entry.getValue();
                    }
                    else {
                        count2 =1;
                        longest = longest + entry.getValue() -1;
                    }
                }



            }
            if(count == 1 && count2 ==1){
                return longest+1;
            }
            if(count !=1 && count2 ==1){
                return longest+1;
            }
        if(count ==1 && count2 !=1){
            return longest+1;
        }
            return longest;
    }

    public static char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return result;
    }

    public static String addStrings(String num1, String num2) {
            int i = num1.length()-1;
            int j = num2.length()-1;
            int carry = 0;
            StringBuilder stringBuilder = new StringBuilder();
            while (i>=0 || j>=0 || carry != 0){
                int x = i>=0? num1.charAt(i)-'0':0;
                int y = j>=0? num2.charAt(j)-'0':0;
                int sum = x + y + carry;
                stringBuilder.append(sum%10);
                carry=  sum/10;
                 i--;
                 j--;

            }
            return stringBuilder.reverse().toString();
    }
}
