package generalquestion;

 interface M {
     default void run(){
         System.out.println("sj,bf");
     }

}
 interface B{
     default void run(){
         System.out.println("sj,bf");
     }

}

class  H implements  M, B{

    @Override
    public void run() {
        M.super.run();
    }
}


class Z{
     public  static void call(){
         System.out.println("Atul");
     }
}

class Y extends Z{
    public static void call(){
        System.out.println("tribhuwa");
    }

    public static void main(String[] args) {
        Z z = new Y();
        Z.call();
    }
}

