package Task3;

public class Ship extends Vehicle{
    protected String port;
    protected int passagers;

    public void setPort(String port) {
        this.port = port;
    }

    public void setPassagers(int passagers) {
        this.passagers = passagers;
    }

    public void info(){
        System.out.println("Ship INFO");
        System.out.println("Name of the port is " + port);
        System.out.println("Max places  - " + passagers);
        System.out.println("Speed " + speed + " miles/h");
        System.out.println("Year is " + year);
        System.out.println("Price is " + price);
    }
}
