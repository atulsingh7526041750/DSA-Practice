package hash;

import java.util.Scanner;

public class charHashing {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.next();
//        int [] hash = new int[26];

        int [] hash1 = new int[256];
        for(int i=0;i<s.length();i++){
//            hash1[s.charAt(i) - 'a'] += 1;
            hash1[s.charAt(i)] += 1;
        }
        char c;
        System.out.println("enter the character");
         c = sc.next().charAt(0);
        System.out.println(hash1[c]);
    }
}
