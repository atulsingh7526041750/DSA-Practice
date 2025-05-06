package interview;

public class StaticConcept {
    public static void main(String[] args) {
        Stat stat = new Stat();
//        stat.brand = "Oppo";
//        stat.price = "23132";
//        stat.name ="Atul";

        Stat stat1 = new Stat();
//        stat1.brand = "Oppo";
//        stat1.price = "23132";
//        stat1.name ="Atul";

        // suppose I have declared the name as static now and now going to change the value of it .
//        stat1.name  = "Abhisheks";
        stat.show();
        stat1.show();

    }
}

class Stat{
   String brand;
   String price;
    static String name;
   public void show(){
       System.out.println(brand+":"+price+":"+name);
   }
   static {
       name = "Atul singh";
       System.out.println("in static block");
   }
   public Stat(){
       brand = " singh ";
       price = "2313";
       name = "oppo";
   }
   public static void show1(){
   }
}
