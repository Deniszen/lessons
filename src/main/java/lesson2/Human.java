package lesson2;

public class Human implements Actioner {

    private int HUMAN_RUN_DISTANCE;
    private int HUMAN_JUMP_DISTANCE;

    public Human() {
        this.HUMAN_RUN_DISTANCE = 200;
        this.HUMAN_JUMP_DISTANCE = 2;
    }

    @Override
    public boolean run(int distance) {
        if (distance > HUMAN_RUN_DISTANCE) {
            System.out.println("НЕ ПРОБЕГУ СТОЛЬКО: " + distance);
            return false;
        } else  {
            System.out.println("СТОЛЬКО ПРОБЕГУ: " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance > HUMAN_JUMP_DISTANCE) {
            System.out.println("НЕ ПЕРЕПРЫГНУ ЧЕРЕЗ ТАКУЮ СТЕНУ: " + distance);
            return false;
        } else  {
            System.out.println("ЧЕРЕЗ ТАКУЮ ПЕРЕПРЫГНУ: " + distance);
            return true;
        }
    }
}
