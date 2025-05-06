package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,7,8,9,9,9,11};
        System.out.println(findUpperBound(arr,9, arr.length));

    }

    /**
     *
     * @param arr
     * @param x
     * @param n
     * @return
     */

    public static int findUpperBound(int []arr, int x, int n){
        int low = 0;
        int high = n-1;
        int ans = n;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                 ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
}
