package BinarySearch;

/**
 * @Lower Bound stands for smallest index such that arr[ind]>=n
 * array has to be sorted for lower bound to be implemented .
 *
 */
public class LowerBound {
    public static void main(String[] args) {
//        int [] arr = new int[8];
          int [] arr = {1,2,3,3,7,8,9,9,9,11};
          System.out.println(findLowerBound(arr,10, arr.length));
    }

    public static int findLowerBound(int [] arr,int x, int n){

        int low = 0;
        int high = n-1;
        int ans = n;
        while ((low<=high)){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
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
