package by.bsuir.zaitseva;

import java.util.List;


public class BasketApp {
    public static void main(String args[]) {
        Basket basket = new Basket(List.of(new Ball(5.5, Colors.WHITE), new Ball(4, Colors.BLUE), new Ball(10, Colors.BLUE)));
        System.out.println("Вес мячиков: " + basket.getBallsWeight() + ", количество синих мячиков: " + basket.getBlueBallsCount());
    }
}
