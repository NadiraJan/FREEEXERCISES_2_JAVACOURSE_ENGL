package ObjectOrienProgr;

public class CarApp {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);
        myCar.drive();
        myCar.brake();

        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

        System.out.println(myCar.color);
        System.out.println(myCar.year);
        System.out.println(myCar.price);
    }
}
