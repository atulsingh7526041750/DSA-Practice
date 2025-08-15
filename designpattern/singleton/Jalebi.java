package designpattern.singleton;

public class Jalebi {

    /**
     * this is eager way of doing the initialization
     */
    private static Jalebi jalebi = new Jalebi();

    private Jalebi(){

    }
    public static Jalebi getJalebi(){
        return jalebi;
    }
}
