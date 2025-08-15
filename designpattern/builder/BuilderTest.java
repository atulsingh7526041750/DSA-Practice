package designpattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
       User user =  new User.UserBuilder().setUserName("Atul").setUserId("13212").getInstance();


    }
}
