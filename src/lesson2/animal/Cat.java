package lesson2.animal;

public class Cat extends Animal {
    private String color;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит  " + location);
    }
}
