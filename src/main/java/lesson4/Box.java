package lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {

    private ArrayList<T> container;

    public Box() {
        this.container = new ArrayList<>();
    }

    public Box(T... container) {
        this.container = new ArrayList<>(Arrays.asList(container));
    }

    public void add(T fruit) {
        this.container.add(fruit);
    }

    public void add(T... fruits) {
        this.container.addAll(Arrays.asList(fruits));
    }

    public float getWeight() {
        if (container.size() == 0) {
            return 0.0f;
        }
        return container.size() * container.get(0).getWeight();
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void transfer(Box<? super T> another) {
        if (this == another) {
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }
}