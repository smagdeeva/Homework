package lesson5.fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {


    private List<T> fruitList;

    {
        fruitList = new ArrayList<>();
    }

    public double getWeight() {
        if (fruitList.size() == 0) {
            return 0;
        } else {
            return fruitList.size() * fruitList.get(0).getWeight();
        }
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public boolean compare(Box<? extends Fruit> Box1) {
        return Box1.getWeight() == this.getWeight();
    }

    public void sortFruit(Box<T> Box1) {
        for (int i = 0; i < fruitList.size(); i++) {
            Box1.addFruit(fruitList.get(i));
        }

    }
}