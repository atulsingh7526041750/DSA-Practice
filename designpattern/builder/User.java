package designpattern.builder;

public class User {
    private String userId;
    private String userName;
    private User(UserBuilder userBuilder){
        this.userId = userBuilder.userId;
        this.userName  = userBuilder.userName;
    }
    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    //inner class to create object
    static class UserBuilder{
        private String userId;
        private String userName;
        public UserBuilder() {
        }
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public User getInstance(){
            User user = new User(this);
            return user;
        }
    }
}
