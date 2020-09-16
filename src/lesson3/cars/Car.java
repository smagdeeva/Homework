package lesson3.cars;

public abstract class Car {
    public String modelName;
    public String modelClass;
    public double weight;
    public Engine engine;

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printInfo();

    void printInfo(String modelName, String modelClass, double weight, String engine) {
        System.out.println("Информация об автомобиле " + modelName + modelClass + weight + engine);
    }
}
