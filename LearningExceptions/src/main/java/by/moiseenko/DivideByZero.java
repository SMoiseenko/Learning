package by.moiseenko;

import by.moiseenko.myException.MyException;
import by.moiseenko.myException.MyRuntimeException;

public class DivideByZero {
    public static float division(int a, int b) throws IllegalAccessException {
        if (a / b >= 1) {
            return (float) a / (float) b;
        } else {
            try {
                throw new IllegalAccessException("/Eeee");
            } catch (IllegalAccessException e) {
                throw e;
            }
        }
    }

    public static void testMyExeption(int i) throws MyException {
        throw new MyException("/TestMyExeption", i);
    }

    public static void testMyRuntimeExeption() {
        throw new MyRuntimeException("/Text", new NullPointerException());
    }

    public static float rethrowException(int a, int b) {
        try {
            if (b == 0) throw new NullPointerException();
            return (float) a / b;
        } catch (NullPointerException e) {
            throw new MyRuntimeException("Одумайся, пробуешь делить на ноль", e);
        }
    }

}
