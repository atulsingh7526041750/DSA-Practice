package interview;

import java.security.PrivateKey;

public class SingletonPractice {

}

// lazy initialization

class B{
    private static B b ;
    private B(){

    }
    public  static B getInstance(){
        synchronized (B.class){if(b==null){
            return new B();
        }
        else {
            return b;
        }}

    }
}



// eager initialization

class A{
    private static A a = new A();
    private A(){

    }
    public static A getInstance(){
        return a;
    }
}
