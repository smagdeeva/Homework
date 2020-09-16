package lesson2.animal;

public class Dog extends Animal {
    String breed;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + food);
    }

    @Override
    protected void sleep() {
        System.out.println("Собака спит  " + location);
    }
}