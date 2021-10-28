package lesson3;

import lesson3.Exceptions.MyException;

public class Lesson3 {
    public static void main(String[] args) {
        String[][] arrs = {{"1", "2", "3", "4"}, {"3", "4","3", "4"}, {"3", "9", "1", "6"}, {"6",  "2","3", "4"}};

        MyArray myArray = new MyArray();
        try {
            myArray.ColculateMyArray(arrs);
        } catch (MyException e) {
            System.out.println("Ignored");
        }
    }
}
