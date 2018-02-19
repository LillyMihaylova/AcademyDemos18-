package vehicles;

public class MotorByke extends Vehicle implements MoveInterface{

    private String brand;
    private int drivenKm;

    public MotorByke(String brand, int drivenKm) {
        this.brand = brand;
        this.drivenKm = drivenKm;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDrivenKm() {
        return drivenKm;
    }

    public void setDrivenKm(int drivenKm) {
        this.drivenKm = drivenKm;
    }

    @Override
    public void move() {
        System.out.println("Slow");
    }
}
