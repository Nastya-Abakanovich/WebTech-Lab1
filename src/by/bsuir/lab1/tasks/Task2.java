package by.bsuir.lab1.tasks;

public class Task2 {
    private int yUp = 5;
    private int yDown = -3;
    private int xUp = 4;
    private int xDown = 6;

    public Task2 () {
    }

    public Task2 (int yUp, int yDown, int xUp, int xDown) {
        this.yUp = yUp;
        this.yDown = yDown;
        this.xUp = xUp;
        this.xDown = xDown;
    }

    public boolean isBelongArea(int x, int y) {
        return ((((y >= 0) && (y <= yUp)) && (Math.abs(x) <= xUp))
                || (((y < 0) && (y >= yDown)) && (Math.abs(x) <= xDown)));
    }
}
