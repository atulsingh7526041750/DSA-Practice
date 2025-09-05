package ArrayPractice;

import java.sql.Array;

public class RainWaterTrapping {
    public static void main(String[] args) {
       int [] height = {4,2,0,3,2,5};
        System.out.println(trap1(height));
        System.out.println(power(5));
//        EvilChild evilChild = new EvilChild();
//        System.out.println(evilChild.getValue());

    }

    public static int trap(int[] height) {
        /**
         * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
         * prefixMax[] = [0,1,1,2,2,2,2,3,3,3,3,3]
         *
         * suffixMax[[ = [,2,2,1
         * Output: 6
         */
        int totalWater = 0;
        int size = height.length;
        int prefixMax[] = new int[size];
        int suffixMax[] = new int[size];
        prefixMax[0] = height[0];
        suffixMax[size-1] = height[size-1];
        for(int i = 1;i<size;i++){

            prefixMax[i] = Math.max(prefixMax[i-1],height[i]);

        }
        for(int i = size-2;i>0;i--){


            suffixMax[i] = Math.max(suffixMax[i+1],height[i]);

        }
        for(int i=0;i<height.length;i++){
            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];

            if(height[i]<leftMax&& height[i]<rightMax){

            totalWater +=Math.min(leftMax,rightMax)-height[i];}


        }


        return totalWater;

    }

    public static boolean power(int num){

        while (num!=4 && num>4){
            int a= (int) Math.sqrt(num);
            num = a;
        }

        return num==4?true:false;
    }


    public static int trap1(int[] height){


        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int totalStoredWater = 0;
        while (left<right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax  =  Math.max(rightMax,height[right]);
            if(leftMax<rightMax){
                totalStoredWater += leftMax-height[left];
                left++;

            }
            else {
                totalStoredWater+=rightMax-height[right];
                right--;

            }
        }
        return totalStoredWater;
    }




}


 class BaseImmutable {
    private final String value = "Hello";
    public String getValue() {
        return value;
    }
}

class EvilChild extends BaseImmutable {
    private String fakeValue = "Hacked";

    @Override
    public String getValue() {
        return fakeValue; // breaks immutability
    }
}