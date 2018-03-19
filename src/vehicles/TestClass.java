package vehicles;

public class TestClass {
    public static void main(String[] args) {
        //comment
        Car car = new Car("BMW 740", 10000);
        car.setYearOfProduction(1997);

        System.out.println(car.getBrand());
        System.out.println(car.getDrivenKm());
        System.out.println(car.getYearOfProduction());
        car.move();

        System.out.println();

        MotorByke motorByke = new MotorByke("Harley", 20000);
        motorByke.setYearOfProduction(1999);
        System.out.println(motorByke.getBrand());
        System.out.println(motorByke.getDrivenKm());
        System.out.println(motorByke.getYearOfProduction());
        motorByke.move();
    }
}
