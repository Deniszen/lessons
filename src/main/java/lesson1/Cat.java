package lesson1;

public class Cat extends Animal {

    public Cat(String name, int runDistance, int swim) {
        this.name = name;
        this.runDistance = runDistance;
        this.swim = swim;
    }

    @Override
    public void swim(int distance) {
        if (distance <= swim) {
            System.out.println("lesson1.Cat can swim " + distance);
        } else {
            System.out.println(distance + " meters too much for the cat");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.println("lesson1.Cat can run " + distance);
        } else {
            System.out.println(distance + " meters too much for the cat");
        }
    }

    @Override
    public void run() {
        if (runDistance <= 200) {
            System.out.printf("lesson1.Cat %s can run %d\n", name, runDistance);
        } else {
            System.out.printf("%d meters too much for the cat %s\n", runDistance, name);
        }
    }

    @Override
    public void swim() {
        System.out.printf("lesson1.Cat %s cant swim :(\n", name);
    }
}
