package lesson1;

public abstract class Animal {

    String name;

    int runDistance;

    int swim;

    public void swim(int distance) {
        System.out.println("lesson1.Animal can swim " + distance);
    };

    public void run(int distance) {
        System.out.println("lesson1.Animal can run " + distance);
    };

    public abstract void run();

    public abstract void swim();
}
