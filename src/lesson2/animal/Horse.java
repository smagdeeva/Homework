package lesson2.animal;

public class Horse extends Animal {
    String strong;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го-го");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + food);
    }

    @Override
    protected void sleep() {
        System.out.println("Лошадь спит  " + location);
    }
}