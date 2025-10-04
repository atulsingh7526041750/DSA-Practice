package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = n - 1; i >= 1; i--) {
//            System.out.println("once");
//            int didSwap=0;
//            for (int j = 0; j <= i-1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    didSwap++;
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//            if(didSwap==0){
//                break;
//            }
//
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        //int arr1[] = {13,46,24,52,20,9};
        int arr1[] = {9,13,24,75};
        bubbleSorting(arr1);
    }


    /**
     *
     * @param arr this is the input array I am taking
     *            we need to do the adjacent swapping to achieve the bubble sorting
     */
    public static void bubbleSorting(int []arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int didSwap = 0;

            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    continue;
                }
                else {
                    System.out.println("this is running 1 time");
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap=1;

                }
            }
            if(didSwap==0){
                break;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
