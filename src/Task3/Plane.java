package Task3;

public class Plane extends Vehicle{
    protected int hight, passagers;

    public void setHight(int hight) {
        this.hight = hight;
    }

    public void setPassagers(int passagers) {
        this.passagers = passagers;
    }

    public void info(){
        System.out.println("Plane INFO");
        System.out.println("Max hight of fly is " + hight + " m");
        System.out.println("Msx passagers - " + passagers);
        System.out.println("Speed " + speed + " km/h");
        System.out.println("Year is " + year);
        System.out.println("Price is " + price);
    }
}
