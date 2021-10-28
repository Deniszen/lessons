package lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson4 {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new Apple());
        Box<Apple> anotherAppleBox = new Box<>(new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Fruit> box = new Box<>();

        appleBox.transfer(box);
        appleBox.transfer(anotherAppleBox);
//        appleBox.transfer(orangeBox);
//        box.transfer(appleBox);

    }

    public static void swap(Object[] arr, int n1, int n2) {
        Object obj = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = obj;
    }

    public static <T> ArrayList<T> convertList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}