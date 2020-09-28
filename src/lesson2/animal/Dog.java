package lesson2.animal;

public class Dog extends Animal {
    private String breed;

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
    public void sleep() {
        System.out.println("Собака спит  " + location);
    }
}