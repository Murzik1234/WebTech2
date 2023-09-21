package by.bsuir.zaitseva;

public class Ball {
    private double weight;
    private Colors color;

    public Ball(double weight, Colors color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
