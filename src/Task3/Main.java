package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter info for car");
        Car car = new Car();
        System.out.println("Speed");
        car.setSpeed(in.nextDouble());
        System.out.println("Year");
        car.setYear(in.nextInt());
        System.out.println("Price");
        car.setPrice(in.nextInt());
        in.nextLine();

        System.out.println("Enter info for ship");
        Ship ship = new Ship();
        System.out.println("Name of the port");
        ship.setPort(in.nextLine());
        System.out.println("Passegers number");
        ship.setPassagers(in.nextInt());
        System.out.println("Speed");
        ship.setSpeed(in.nextDouble());
        System.out.println("Year");
        ship.setYear(in.nextInt());
        System.out.println("Price");
        ship.setPrice(in.nextInt());

        System.out.println("Enter info for plane");
        Plane plane = new Plane();
        System.out.println("Maximum hight if fly");
        plane.setHight(in.nextInt());
        System.out.println("Passegers number");
        plane.setPassagers(in.nextInt());
        System.out.println("Speed");
        plane.setSpeed(in.nextDouble());
        System.out.println("Year");
        plane.setYear(in.nextInt());
        System.out.println("Price");
        plane.setPrice(in.nextInt());


        car.info();
        ship.info();
        plane.info();
    }
}
