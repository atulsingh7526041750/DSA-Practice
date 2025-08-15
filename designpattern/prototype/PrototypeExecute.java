package designpattern.prototype;

public class PrototypeExecute {
    public static void main(String[] args) throws CloneNotSupportedException {

        Prototype prototype = new Prototype();
        prototype.loadData();
        System.out.println(prototype);
        Prototype pt = (Prototype) prototype.clone();
        System.out.println(pt);

    }
}
