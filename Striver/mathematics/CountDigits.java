package Striver.mathematics;


public class CountDigits {
    public CountDigits() {
    }

    public static void main(String[] args) {

//        System.out.println(isPalindrome(121));
//        System.out.println(Armstrong(1634));
        printAllDivisor(35);
    }

    public static int countDigit(int N) {
        int count = 0;
        int a = N;

        while(N > 0) {
            int last = N % 10;
            N /= 10;
            if (last > 0 && a % last == 0) {
                ++count;
            }
        }

        return count;
    }

    public static int reverse(int x) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        int result = 0;

        while(x != 0) {
            int lastDigit = x % 10;
            x /= 10;
            if (result <= maxValue / 10 && (result != maxValue / 10 || lastDigit <= 7)) {
                if (result >= minValue / 10 && (result != minValue / 10 || lastDigit >= -8)) {
                    result = result * 10 + lastDigit;
                    continue;
                }

                return 0;
            }

            return 0;
        }

        return result;
    }

    public static boolean isPalindrome(int x) {
        return x == reverse(x) && x >= 0;
    }

    public static Long[] lcmAndGcd(Long a, Long b) {
        Long var10000 = a > b ? a : b;
        return new Long[]{a, b};
    }

    public static boolean Armstrong(int n){
        int count = 0;
        int number = n;
        int number1 = number;
        int sum = 0;

        while (n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);
        while(number>0){
            int result = 1;
            int last = number%10;
            number = number/10;
            for (int i=0;i<count;i++){
                result= result*last;
            }
            System.out.println(result);
            sum = sum + result;
        }
        System.out.println(sum);
        if(number1==sum){
            return true;
        }
        else {
            return false;
        }



    }

    public static void printAllDivisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }



}
