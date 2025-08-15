package designpattern.singleton.practiceNew;

public class SingleA {

    private static SingleA singleA;
    private SingleA(){

    }
    public static SingleA getSingleA(){
        if(singleA==null){
            return new SingleA();
        }
        return singleA;
    }
}
