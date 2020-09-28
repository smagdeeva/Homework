package lesson3.cars;

public class Lorry extends Car {
    private double lorryWeight;

    public Lorry(String modelName, String modelClass, double weight, Engine engine, double lorryWeight) {
        super(modelName, modelClass, weight, engine);
        this.lorryWeight = lorryWeight;
    }

    public void start() {
        System.out.println("Грузовик поехал");
    }

    public void stop() {
        System.out.println("Грузовик остановился");
    }

    public void printInfo() {
        System.out.println("Информация об автомобиле " + modelName + modelClass + weight + engine + lorryWeight);
    }
}
