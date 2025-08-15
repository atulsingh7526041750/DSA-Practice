package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        int [] nums = {3,0,1};
//        int count = 0; // Count the number of "decreasing" pairs
//        int n = nums.length;
//
//        int k=2;
//
//        System.out.println(rotateByOnePlace(nums).toString());

//                Input: nums = [1,2,3,4,5,6,7], k = 3
        //        Input: nums = [1,2,3,4,5,6,7], k = 3
//        int [] arr   = rotateArray(nums);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//
//        }
//
//        System.out.println(missingNumber(nums));



    }

    public static int[] rotateArray(int []arr){
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Input = nums = [1,2,3] k=1;
//        Output = [3,1,2]

       
        reverseArray(arr,arr.length-4,arr.length-1);
        reverseArray(arr,0,arr.length-5);
        reverseArray(arr,0,arr.length-1);


        return arr;
    }

    public static int[] reverseArray(int[] arr,int from, int till){
       int left = from;
       int right = till;
       while (from<till) {
           int temp = arr[from];
           arr[from] = arr[till];
           arr[till] = temp;
           from++;
           till--;
       }
       return arr;
    }
    public static int[] rotateByOnePlace(int []arr){
        //Input: nums = [1,2,3,4,5,6,7], k = 3
        int last =arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];



        }
        arr[0] = last;
        return arr;

    }


    public static int[] moveAllZeroEnd(int []arr){
        //Input: nums = [0,1,0,3,12]
        //Output: [1,3,12,0,0]
        //Example 2:
        //
        //Input: nums = [0]
        //Output: [0]
        //
        int index = 0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }

        }
        while (index<arr.length){
            arr[index]=0;
            index++;
        }

        return arr;

    }



    public static int missingNumber(int[] nums) {
        if(nums.length==1&&nums[0]!=0){
            return 0;
        }

        Arrays.sort(nums);
        int index = 0;
        for(int i=0;i<=nums.length;i++){

            if(nums[i]==index){
                index++;
            }
            else{
                break;
            }
        }

        return index;

    }

}
