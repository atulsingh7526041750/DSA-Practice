package stringplaylist;

import java.util.ArrayList;
import java.util.List;

public class StrPractice {
    public static void main(String[] args) {
        String[] strings = {"atul","Atu","At"};

//        System.out.println(strings[0].indexOf("tul"));
//        String str = "Hello From Mumbai";
        System.out.println(longestCommonPrefix(strings));
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


}
