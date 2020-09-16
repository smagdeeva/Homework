package lesson2.animal;

public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = {
                new Cat("", ""),
                new Dog("", ""),
                new Horse("", "")
        };
        for (int i = 0; i < animals.length; i++) {
            vet.treatAnimal(animals[i]);
        }
    }
}
