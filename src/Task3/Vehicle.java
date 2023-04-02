package Task3;

public class Vehicle {
    protected int year;
    protected double speed, price;

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void info(){
        System.out.println("Speed " + speed + " km/h");
        System.out.println("Year is " + year);
        System.out.println("Price is " + price);
    }
}
