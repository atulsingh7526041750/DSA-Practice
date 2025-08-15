package ArrayPractice;


import java.util.HashMap;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 1,2};
        System.out.println(removeDuplicate(arr));


    }

    public static int removeDuplicate(int []arr){
        int index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[index]){
                index++;
                arr[index] = arr[i];
            }
        }
        return index+1;
    }


}


