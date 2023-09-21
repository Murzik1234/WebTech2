package by.bsuir.zaitseva;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BallsBasketTest {
    private Basket basket;

    @Before
    public void init() {
        basket = new Basket(List.of(new Ball(5.5, Colors.WHITE), new Ball(4, Colors.BLUE), new Ball(10, Colors.BLUE)));
    }

    @Test
    public void getBallsWeightTest() {
        final double EXPECTED_WEIGHT = 19.5;
        final double ACTUAL_WEIGHT = basket.getBallsWeight();
        Assert.assertEquals(EXPECTED_WEIGHT, ACTUAL_WEIGHT, 0.01);
    }

    @Test
    public void getBlueBallsCountTest() {
        final int EXPECTED_COUNT = 2;
        final int ACTUAL_COUNT = basket.getBlueBallsCount();
        Assert.assertEquals(EXPECTED_COUNT, ACTUAL_COUNT);
    }
}
