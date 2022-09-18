package by.bsuir.lab1.task2;

public class Area {

    private static final int Y_UP = 5;
    private static final int Y_DOWN = -3;
    private static final int X_UP = 4;
    private static final int X_DOWN = 6;

    public static boolean IsBelongArea(int x, int y)
    {
        if ((((y >= 0) && (y <= Y_UP)) && (Math.abs(x) <= X_UP))
        || (((y < 0) && (y >= Y_DOWN)) && (Math.abs(x) <= X_DOWN))) {
            return true;
        } else {
            return false;
        }
    }
}
