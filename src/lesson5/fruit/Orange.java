package lesson5.fruit;

public class Orange extends Fruit {

    private double weight;

    public Orange() {
        weight = 1.5;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}