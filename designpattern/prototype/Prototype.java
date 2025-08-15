package designpattern.prototype;

public class Prototype implements Cloneable{
    private String Ip;
    private String Server;

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public String getServer() {
        return Server;
    }

    public void setServer(String server) {
        Server = server;
    }

    public  void loadData(){
        this.Server = "this is important";
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "Ip='" + Ip + '\'' +
                ", Server='" + Server + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
