package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for( int i=0;i<=n-2;i++){
            int min=i;
            for( int j=i;j<=n-1;j++){

                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i] = temp;
        }

        for( int k=0;k<arr.length;k++)
        System.out.println(arr[k]);
    }

}
