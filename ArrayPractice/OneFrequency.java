package ArrayPractice;

public class OneFrequency {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2};
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        System.out.println(result);
    }


}

