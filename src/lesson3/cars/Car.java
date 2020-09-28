package lesson3.cars;

public abstract class Car {
    protected String modelName;
    protected String modelClass;
    protected double weight;
    protected Engine engine;

    public Car(String modelName, String modelClass, double weight, Engine engine) {
        this.modelName = modelName;
        this.modelClass = modelClass;
        this.weight = weight;
        this.engine = engine;
    }

    abstract void start();

    abstract void stop();

    void turnRight() {
        System.out.println("Поворот направо");
    }

    void turnLeft() {
        System.out.println("Поворот налево");
    }

    abstract void printInfo();


}
