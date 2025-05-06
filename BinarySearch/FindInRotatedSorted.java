package BinarySearch;

public class FindInRotatedSorted {
    public static void main(String[] args) {


    }


    //when duplicates are there
    public boolean search1(int[] nums, int target) {
        int low = 0;
        int high  = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                ans = mid;
            }
            if(nums[low]==nums[mid] && nums[high]==nums[mid]){
                low = low+1;
                high = high-1;
                continue;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high  = mid -1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<=target&& target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
        }

        if(ans==-1){
            return false;
        }
        else{
            return true;
        }


    }

    //when duplicates are not there
    public int search(int[] nums, int target) {
        int low = 0;
        int high  = nums.length-1;
        int ans = -1;
        while(low<=high){

            int mid = (low+high)/2;
            if(nums[mid]==target ){
                return mid;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high  = mid -1;

                }
                else{
                    low = mid+1;
                }

            }
            else{
                if(nums[mid]<=target&& target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;

    }
}
