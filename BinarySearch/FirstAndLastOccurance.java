package BinarySearch;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,8,8,11,13};
//        System.out.println(findUpperBund(arr,8,8)-1);

//        int first = findLowerBund(arr,8,8);
//        int last = findUpperBund(arr,8,8);
//        System.out.println(first+""+(last-1));
////        int arr1[] = firstAndLastOldWay(arr,14);
////        System.out.println(arr1[0]+""+arr1[1]);
////        System.out.println(findLowerBund(arr,19,8));
//        System.out.println(findUpperBund(arr,8,8));


        System.out.println(findLowerBund(arr,8,8));
        System.out.println(findUpperBund(arr,8,8)-1);
    }
    public static int [] firstAndLastOldWay(int [] arr,int x){
        int first = -1;
        int last = -1;
        int [] arr1 = new int[2];
        for(int i = 0;i<=arr.length-1;i++){
            if(arr[i]==x){
                if(first==-1){
                    first = i;
                }
                last =i;
            }
        }
        arr1[0] = first;
        arr1[1] = last;
        return arr1;
    }
    // int arr[] = {2,4,6,8,8,8,11,13};

    public static int findLowerBund(int [] arr, int x, int n){
        int first = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                if(arr[mid]==x){
                first = mid;
                }
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return first;
    }
    // int arr[] = {2,4,6,8,8,8,11,13};
    public static int findUpperBund(int [] arr, int x, int n){
        int last = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                last = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return last;
    }




    // bu using binary serch we can do the same

}
