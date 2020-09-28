package lesson3.cars;

public class Engine {

    private double power;
    private String manufacturer;

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    void printInfo() {
        System.out.println("Информация о моторе " + power + manufacturer);
    }
}