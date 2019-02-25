package by.moiseenko.myException;

public class MyException extends Exception{
    private int i;

    public MyException() {
    }

    public MyException(String message, int i) {
        super(message);
        this.i = i;
    }

    public int getI() {
        return i;
    }

    @Override
    public String toString() {
        return super.toString() + " Wrong number is: " + i;
    }
}
