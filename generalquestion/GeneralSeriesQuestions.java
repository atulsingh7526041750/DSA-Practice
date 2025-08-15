package generalquestion;

import java.util.Stack;

public class GeneralSeriesQuestions {
    public static void main(String[] args) {
//        fibonacciSeries(8);
//        int []arr = {7,1,5,3,6,4};
//
//        System.out.println(maxProfit(arr));

        System.out.println(balancedParanthesis("{[()]}")); // true
        System.out.println(balancedParanthesis("{[(])}")); // false

    }

    public static boolean balancedParanthesis(String str){


        Stack<Character> stack = new Stack<>();

        for(char c: str.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
                int top = stack.pop();
                if(c==')'&&top!='('||c=='}'&&top!='{'||c==']'&&top!='['){
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int buYind = 0;
        int sellInd = 0;
        int maxProfit = 0;
        for (int i = 0; i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
                buYind = i;

            } else if (prices[i]-min>maxProfit) {
                maxProfit = prices[i]-min;

                sellInd = i;


            }
        }
        System.out.println(buYind+""+sellInd);

        return maxProfit;
    }


    public static int maxProfit1(int[] prices){
        //prices = [7,1,5,3,6,4]
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                maxProfit = maxProfit+(prices[i]-prices[i-1]);
            }
        }
        return maxProfit;
    }

    public static void fibonacciSeries(int n){
        // 0,1,1,2,3,5
        int a=0;
        int b=1;
        int c = a+b;
        System.out.print(a+","+b+",");
        for(int i=2;i<n-1;i++){
            c = a+b;
            a = b;
            b=c;

            System.out.print(c);


        }
    }
}
