package lesson3.cars;

public abstract class Lorry extends Car {
    public double lorryWeight;

    public void start() {
        System.out.println("Грузовик поехал");
    }

    public void stop() {
        System.out.println("Грузовик остановился");
    }

}
