package lesson3.Exceptions;

public class MyArraySizeException extends MyException {

    public MyArraySizeException() {
        super("Размер матрицы не 4х4");
    }
}
