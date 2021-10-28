package lesson2;

public class Track implements Obstacle {

    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean action(Actioner actioner) {
        if (actioner.run(distance)) {
            System.out.println("Пробежал " + distance);
            return true;
        } else {
            System.out.println("Не пробежал " + distance);
            return false;
        }
    }
}
