package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int arr1[] = {1,2,3,4};
        insertionSort(arr);


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


    public static void bubbleSortTest(int []arr){
        int didSwap = 0;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    continue;
                }
                else {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    didSwap++;
                }
            }
            System.out.println("didSwap "+didSwap);
            if (didSwap==0){
                break;
            }
        }
        for (int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }

    public static void insertionSort(int []arr){
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
            int j = i;
            while (j>0&&arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
