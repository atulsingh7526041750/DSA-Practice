package basicquestion;

public class BasicMaths {
    public static void main(String[] args) {

        gcd(6,12);

    }
    public static void countDigit(int n){
        int count=0;
        while (n>0){
            n=n/10;
            count = count+1;
        }
        System.out.println(count);
    }
    public static void reverseNumber(int n){
        int revNum=0;
        while (n>0){
            revNum = revNum*10+(n%10);
            n=n/10;

        }
        System.out.println(revNum);
    }
    public static boolean isPalindrome(int n){
        int a = n;
        int revNum=0;
        while (n>0){
            revNum = revNum*10+(n%10);
            n=n/10;

        }
        if(a == revNum){
            return true;
        }
        return false;

    }
    public static void gcd(int n1,int n2){
        int result = 0;
        if(n1>n2 && (n1%n2==0)){
            result = n2;
        }
        if(n2>n1 && (n2%n1==0)){
            result = n1;
        }
        if(n1>n2){
            for(int i=1;i<=n2;i++){
                if((n1%i)==0 && (n2%i)==0){
                    result  = i;
                }

            }
        }
        if(n2>n1){
            for(int i=1;i<=n1;i++){
                if((n1%i)==0 && (n2%i)==0){
                    result  = i;

                }

            }

        }
        System.out.println(result);
    }
    public static boolean isArmstrong(int n){
        int count=0;
        int a= n;
        int b=n;
        int sum = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        while (a>0){
            int rem = a%10;
            sum = sum + (int)Math.pow(rem,count);
            a = a/10;
        }
        if(sum == b){
            System.out.println(sum);
            System.out.println(n);
            return true;
        }
        return false;
    }
    public static void printDivisor(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
    public static boolean isPrime(int n){
       for(int i=2;i<=n/2;i++){
           if(n%i==0){
               return false;
           }
       }
       return true;
    }
}
