package lesson2.animal;

public class Cat extends Animal {
    String color;

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
    protected void sleep() {
        System.out.println("Кот спит  " + location);
    }
}
