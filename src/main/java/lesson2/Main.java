package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Obstacle> obs = new ArrayList<>();
        obs.add(new Track(50));
        obs.add(new Track(250));
        obs.add(new Track(150));
        obs.add(new Track(530));
        obs.add(new Track(20));
        obs.add(new Wall(2));
        obs.add(new Wall(1));
        obs.add(new Wall(5));

        List<Actioner> act = new ArrayList<>();
        act.add(new Human());
        act.add(new Cat());
        act.add(new Robot());

        for (Actioner actioner : act) {
            for (Obstacle obstacle : obs) {
                if (!obstacle.action(actioner)) break;
            }
        }
    }
}
