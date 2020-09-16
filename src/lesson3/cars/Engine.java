package lesson3.cars;

public class Engine {

    public double power;
    public String manufacturer;

    void printInfo(double power, String manufacturer) {
        System.out.println("Информация о моторе " + power + manufacturer);
    }
}