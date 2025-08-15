package java8features.lambda;

public class LambdaExpression implements SumInterface {
    public static void main(String[] args) {

//        // holding in interface variable
//        LambdaInterface lambdaInterface = new LambdaExpression();
//        lambdaInterface.sayHello();
//
//
//        // holding the object in class variable
//        LambdaExpression lambdaExpression = new LambdaExpression();
//        lambdaInterface.sayHello();
//
//
//        //this is anonymous class impl of interface
//        LambdaInterface lambdaInterface1 = new LambdaInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is the anonymous class");
//            }
//        };
//
//        lambdaInterface1.sayHello();
//


        //using our interface with the help of lambda

        LambdaInterface lambdaInterface = ()->{
            System.out.println("this is the first time I am implementing the lambda method for functional interface");


        };

        lambdaInterface.sayHello();


    }


    @Override
    public int sum(int a, int b) {
        return 0;
    }
}
