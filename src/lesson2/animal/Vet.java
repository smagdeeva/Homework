package lesson2.animal;

public class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.food + ", " + animal.location);
        animal.makeNoise();
        animal.eat();
        animal.sleep();
    }
}