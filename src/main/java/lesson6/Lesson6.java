package lesson6;

import java.util.Arrays;
import java.util.Collections;

public class Lesson6 {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void methodOne() {
        float[] arr = new float[SIZE];
        long a = System.currentTimeMillis();
        System.out.println("Method 1 time start: " + a);
        Arrays.fill(arr, 1);

        for (int i = 0; i <arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f +i / 2));
         }
        System.out.println("Method 1 time end: " + (System.currentTimeMillis() - a));
    }

    public static void methodTwo() {
        float[] arr = new float[SIZE];
        long a = System.currentTimeMillis();
        System.out.println("Method 2 time start: " + a);
        Arrays.fill(arr, 1);
        float[] arrOne = new float[HALF];
        float[] arrTwo = new float[HALF];

        System.arraycopy(arr, 0, arrOne, 0, HALF);
        System.arraycopy(arr, HALF, arrTwo, 0, HALF);

        MyThread m1 = new MyThread(arrOne);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(() -> {
            for (int i = 0, j = HALF; i <arrTwo.length; i++, j++) {
                arrTwo[i] = (float) (arrTwo[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        arr = Arrays.copyOf(m1.getArr(), m1.getArr().length + arrTwo.length);
        System.arraycopy(arrTwo, 0, arr, m1.getArr().length, arrTwo.length);

        System.out.println("Method 2 time end: " + (System.currentTimeMillis() - a));
    }

    public static void main(String[] args) {
        Lesson6.methodOne();
        Lesson6.methodTwo();

    }
}