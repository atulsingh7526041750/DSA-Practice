package ArrayPractice;

public class SecondLargest {
    public static void main(String[] args) {
        int[]arr = {1,3,2,5,5,3,4,6};
        int max = arr[0];
        int second = Integer.MIN_VALUE;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>second) {
                second=arr[i];
            }
        }
        System.out.println(max+""+second);
    }
}
