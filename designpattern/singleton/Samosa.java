package designpattern.singleton;

/**
 * This is the samosa class
 */
public class Samosa {

    /**
     * this is the lazy way of creating singleton object
     */
    private static Samosa samosa;

    /**
     * this is the constructor
     */
    private Samosa(){
//        if(samosa!=null){
//            throw new RuntimeException("You are trying to break the singlton desing pattern.");
//        }
    }
    /**
     * here we are creating the object if it is already no created the create the new one
     * otherwise return the reference of the old one.
     * @return this will return the object of the samosa
     */
    public  static  Samosa getSamosa(){
        if(samosa==null){
            synchronized (Samosa.class){
                if(samosa == null){
                    samosa = new Samosa();
                }
            }

        }
        return samosa;
    }
}
