package lesson1;

import java.util.Objects;

public class Dog extends Animal {

    public Dog(String name, int runDistance, int swim) {
        this.name = name;
        this.runDistance = runDistance;
        this.swim = swim;
    }

    @Override
    public void run() {
        if (runDistance <= 500) {
            System.out.printf("lesson1.Dog %s can run %d\n", name, runDistance);
        } else {
            System.out.printf("%d meters too much for the dog %s\n", runDistance, name);
        }
    }

    @Override
    public void swim() {
        if (swim <= 10) {
            System.out.printf("lesson1.Dog %s can swim %d\n", name, swim);
        } else {
            System.out.printf("%d meters too much for the dog %s\n", swim, name);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swim) {
            System.out.printf("lesson1.Dog %s can swim %d\n", name, distance);
        } else {
            System.out.printf("%d meters too much for the dog %s\n", distance, name);
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.printf("lesson1.Dog %s can run %d\n", name, distance);
        } else {
            System.out.printf("%d meters too much for the dog %s\n", distance, name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return runDistance == dog.runDistance && swim == dog.swim;
    }

    @Override
    public int hashCode() {
        return Objects.hash(runDistance, swim);
    }
}
