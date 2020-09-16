package lesson3.cars;

public abstract class SportCar extends Car {
    public double speed;

    public void start() {
        System.out.println("SportCar поехал");
    }

    public void stop() {
        System.out.println("SportCar остановился");
    }

}