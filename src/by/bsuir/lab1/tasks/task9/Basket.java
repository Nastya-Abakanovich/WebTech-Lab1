package by.bsuir.lab1.tasks.task9;

public class Basket {
    private int blueBallsNumber = 0;
    private double totalWeight = 0;

    public void catchBall(Ball ball) {
        totalWeight += ball.weight;
        if (ball.color == Colors.BLUE) {
            blueBallsNumber++;
        }
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public int getBlueBallsNumber() {
        return blueBallsNumber;
    }
}
