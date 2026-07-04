package basicquestion;

public class BasicRecursion {
    public static void main(String[] args) {

        System.out.println(isPalindrome("abccba",0,5));
    }
    public static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("Atul");
        printName(n-1);
    }
    public static void printNum(int i,int n){
        if (i > n) {
            return;
        }
        System.out.println(i);
        printNum(i + 1, n);
    }
    public static void printNum1(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        printNum1(n-1);
    }
    public static int NnumbersSum(int n){
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return n + NnumbersSum(n - 1);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void reverse(int arr[], int start, int end ){
        if(start>end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,start+1,end-1);
    }
    public static boolean isPalindrome(String str,int start, int end){
        if(start>=end){
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static int fib(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

}
