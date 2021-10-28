package lesson1;

import java.util.Objects;

public class Tiger extends Animal {

    public Tiger(String name, int runDistance, int swim) {
        this.name = name;
        this.runDistance = runDistance;
        this.swim = swim;
    }

    @Override
    public void run(int distance) {
        System.out.println("lesson1.Tiger can run " + distance);
    }

    @Override
    public void run() {
        System.out.printf("lesson1.Tiger %s can run %d\n", name, runDistance);
    }

    @Override
    public void swim() {
        System.out.printf("lesson1.Tiger %s can swim %d\n", name, swim);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("lesson1.Tiger %s can swim %d\n", name, distance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiger tiger = (Tiger) o;
        return runDistance == tiger.runDistance && swim == tiger.swim;
    }

    @Override
    public int hashCode() {
        return Objects.hash(runDistance, swim);
    }
}
