package lesson2;

public class Cat implements Actioner {

    private int CAT_RUN_DISTANCE;
    private int CAT_JUMP_DISTANCE;

    public Cat() {
        this.CAT_RUN_DISTANCE = 400;
        this.CAT_JUMP_DISTANCE = 5;
    }


    @Override
    public boolean run(int distance) {
        if (distance > CAT_RUN_DISTANCE) {
            System.out.println("НЕ ПРОБЕГУ СТОЛЬКО: " + distance);
            return false;
        } else  {
            System.out.println("СТОЛЬКО ПРОБЕГУ: " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance > CAT_JUMP_DISTANCE) {
            System.out.println("НЕ ПЕРЕПРЫГНУ ЧЕРЕЗ ТАКУЮ СТЕНУ: " + distance);
            return false;
        } else  {
            System.out.println("ЧЕРЕЗ ТАКУЮ ПЕРЕПРЫГНУ: " + distance);
            return true;
        }
    }
}
