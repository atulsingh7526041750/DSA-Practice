package java8features.lambda;

public class MultiplyImpl{

    public static void main(String[] args) {

    Multiply mul = (a,b)->{
        return a*b;
    };

        System.out.println(mul.multiply(10,20));


    }





}
