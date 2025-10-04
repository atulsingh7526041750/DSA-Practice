package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        selectionSort(arr);


//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        int [] arr = new int[n];
//        for( int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for( int i=0;i<=n-2;i++){
//            int min=i;
//            for( int j=i;j<=n-1;j++){
//
//                if(arr[j]<arr[min]){
//                    min = j;
//                }
//            }
//            int temp = arr[min];
//            arr[min]=arr[i];
//            arr[i] = temp;
//        }
//
//        for( int k=0;k<arr.length;k++)
//        System.out.println(arr[k]);
    }


    public static void selectionSort(int []arr){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] =arr[i];
            arr[i] = temp;


        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void bubbleSort(int []arr){
        int n = arr.length;



        for(int i=1;i<n-2;i++){

            for(int j=0;j<=n-1;j++){

            }
        }
    }


}
