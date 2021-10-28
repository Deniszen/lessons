package lesson2;

public class Wall implements Obstacle {

    private int distance;

    public Wall(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean action(Actioner actioner) {
        if (actioner.run(distance)) {
            System.out.println("Перепрыгнул " + distance);
            return true;
        } else {
            System.out.println("Не перепрыгнул " + distance);
            return false;
        }
    }
}
