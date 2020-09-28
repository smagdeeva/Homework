package lesson3.cars;

public class SportCar extends Car {
    private double speed;

    public SportCar(String modelName, String modelClass, double weight, Engine engine, double speed) {
        super(modelName, modelClass, weight, engine);
        this.speed = speed;
    }

    public void start() {
        System.out.println("SportCar поехал");
    }

    public void stop() {
        System.out.println("SportCar остановился");
    }

    public void printInfo() {
        System.out.println("Информация об автомобиле " + modelName + modelClass + weight + engine + speed);
    }
}