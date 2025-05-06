package BinarySearch;

public class findTarget {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int value = search(arr,8,80);
        int value1 = recursiveSearch(arr,0,7,80);
        System.out.println(value1);
        //nums  = [5,7,7,8,8,10]
    }
    public static int[] startingEndPosition(int [] arr, int targetValue){
        int[] arr1 = new int[2];
        int initialValue = 0;
        int lastValue = arr.length-1;
        int startingIndex = -1;
        int endingIndex = -1;
        while(initialValue<=lastValue){
        int mid = (initialValue+lastValue)/2;
     if(targetValue==arr[mid]){
      

     } else if (targetValue>arr[mid]) {
         initialValue=mid+1;

     }
     else {
         lastValue=mid-1;


     }


        }


        return null;
    }
    public static int search(int []arr, int n, int target){
       int low=0;
       int high=n-1;
       while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]==target){
               return mid;

           } else if (target>arr[mid]) {
               low=mid+1;
           }
           else {
               high=mid-1;
           }

       }
        return -1;
    }
    public static int recursiveSearch(int [] arr, int low, int high, int target){
        int mid = (low+high)/2;

        if(low>high){
            return -1;
        }

        if(arr[mid]==target){
            return mid;
        }

        else if (target>arr[mid]) {
            return recursiveSearch(arr, mid+1, high,target );
        }

        else {
           return  recursiveSearch(arr, low,mid-1,target);
        }
    }
}
