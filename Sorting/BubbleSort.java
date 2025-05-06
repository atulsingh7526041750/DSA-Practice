package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 1; i--) {
            System.out.println("once");
            int didSwap=0;
            for (int j = 0; j <= i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    didSwap++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
