package by.bsuir.zaitseva;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    private List<Ball> balls;

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    public void addBall(Ball ball) {
        this.balls.add(ball);
    }

    public double getBallsWeight() {
        double weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getBlueBallsCount() {
        int count = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == Colors.BLUE) {
                count++;
            }
        }
        return count;
    }

}
