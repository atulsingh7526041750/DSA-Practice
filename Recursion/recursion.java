package Recursion;

import javax.naming.PartialResultException;
import java.sql.Array;
import java.util.Scanner;



public class recursion {
    public static void main(String[] args) {
//        printNos(10);
//        print();
//        printName1(1,5);
//        printReverse(5,5);
//        backTracking(3,3);
//        sumReverseWay(5,0);
//        System.out.println(sumFunctionalWay(5));



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n1 = sc.nextInt();
        int [] arr = new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]= sc.nextInt();
        }

        f(0,arr,n1);


        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    public static void print(){
        System.out.println("Hello");
        print();
    }

 static int count = 1;
    public static void printNos(int n) {

        System.out.print(count);
        if(count==n){
            return;
        }
        count++;
        printNos(n);
        // Your code here

    }

    public static void printName(int i,int n){
        System.out.println("Atul");
        if(count==n){
            return;
        }
        count++;
        printName(i+1,n);
    }

//        Given an integer n, calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till n-th term.
//        Input: n = 5
//        Output: 225
//        Explanation: 13 + 23 + 33 + 43 + 53 = 225

    public static void printName1(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Atul");
        printName1(i+1,n);

    }
    public static void printReverse(int i, int n){
        if(i<1){
            return;
        }
        System.out.println(n);
        printReverse(i-1,n-1);
    }

    public static void backTracking(int i, int n){
        if(i<1){
            return;
        }
        backTracking(i-1,n);
        System.out.println(i);

    }

    public static void sumReverseWay(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumReverseWay(i-1,sum+i);

    }

    public static int sumFunctionalWay(int n){
        if(n==0){
            return 0;
        }
        return n+sumFunctionalWay(n-1);

    }



public static void f(int i, int [] arr, int n){
        if(i>=n/2){
            return;
        }
    int temp = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = temp;
        f(i++,arr,n--);

}

//public static boolean ispelindrome(int i, String str){
//
//}










}




