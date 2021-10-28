package lesson3;

import lesson3.Exceptions.MyArrayDataException;
import lesson3.Exceptions.MyArraySizeException;

public class MyArray {

    public void ColculateMyArray(String[][] arr) {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException();
                }
                    for (int j = 0; j < arr[i].length; j++) {
                        try {
                            int k = Integer.valueOf(arr[i][j]);
                            System.out.println(k);
                        } catch (Exception e) {
                            throw new MyArrayDataException("В ячейке " + i + " " + j + " лежат не читаемые данные " + arr[i][j].toString());
                        }
                    }
            }
    }
}
