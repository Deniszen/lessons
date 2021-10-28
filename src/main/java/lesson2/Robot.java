package lesson2;

public class Robot implements Actioner {

    private int ROBOT_RUN_DISTANCE;
    private int ROBOT_JUMP_DISTANCE;

    public Robot() {
        this.ROBOT_RUN_DISTANCE = 1350;
        this.ROBOT_JUMP_DISTANCE = 20;
    }

    @Override
    public boolean run(int distance) {
        if (distance > ROBOT_RUN_DISTANCE) {
            System.out.println("НЕ ПРОБЕГУ СТОЛЬКО: " + distance);
            return false;
        } else  {
            System.out.println("СТОЛЬКО ПРОБЕГУ: " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance > ROBOT_JUMP_DISTANCE) {
            System.out.println("НЕ ПЕРЕПРЫГНУ ЧЕРЕЗ ТАКУЮ СТЕНУ: " + distance);
            return false;
        } else  {
            System.out.println("ЧЕРЕЗ ТАКУЮ ПЕРЕПРЫГНУ: " + distance);
            return true;
        }
    }
}
