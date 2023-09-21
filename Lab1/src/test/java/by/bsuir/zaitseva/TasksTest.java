package by.bsuir.zaitseva;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TasksTest {
    @Test
    public void testFirstTask() {
        double result = Tasks.firstTask(Math.PI/2, Math.PI/2);
        assertEquals(1.890533003303918, result, 1e-8);

        double result2 = Tasks.firstTask(Math.PI/3, Math.PI/4);
        assertEquals(1.9249999540315508, result2, 1e-8);
    }

    @Test
    public void testSecondTask() {
        boolean result1 = Tasks.secondTask(3.0, 4.0);
        assertTrue(result1);

        boolean result2 = Tasks.secondTask(-6.0, -1.0);
        assertTrue(result2);

        boolean result3 = Tasks.secondTask(7.0, 6.0);
        assertFalse(result3);
    }

    @Test
    public void testThirdTask() {
        String expectedResult = "0.0\t0.0\n1.0\t1.5574077246549023\n2.0\t-2.185039863261519\n";
        String result = Tasks.thirdTask(0.0, 2.0, 1.0);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFourthTask() {
        long[] array = {2, 3, 4, 5, 6, 7};
        ArrayList<Integer> result = Tasks.fourthTask(array);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 5));
        assertEquals(expected, result);

        long[] array2 = {13, 3, 23, 19, 6, 18};
        ArrayList<Integer> result2 = Tasks.fourthTask(array2);
        ArrayList<Integer> expected2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
        assertEquals(expected2, result2);
    }

    @Test
    public void testFifthTask() {
        int[] array = {5, 2, 8, 6, 3, 4, 7};
        int result = Tasks.fifthTask(array);
        assertEquals(3, result);

        int[] array2 = {1, 10, 3, 6, 12, 7};
        int result2 = Tasks.fifthTask(array2);
        assertEquals(2, result2);
    }

    @Test
    public void testSixthTask() {
        double[] arr = {1, 2, 3};
        double[][] result = Tasks.sixthTask(arr);
        double[][] expected = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        assertArrayEquals(expected, result);

        double[] arr2 = {4, 5, 6};
        double[][] result2 = Tasks.sixthTask(arr2);
        double[][] expected2 = {{4, 5, 6}, {5, 6, 4}, {6, 4, 5}};
        assertArrayEquals(expected2, result2);
    }

    @Test
    public void testSeventhTask() {
        double[] array = {5.0, 2.0, 8.0, 6.0, 3.0, 4.0, 7.0};
        double[] result = Tasks.seventhTask(array);
        double[] expected = {2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        assertArrayEquals(expected, result, 1e-8);

        double[] array2 = {9.0, 1.0, 0.0, -1.0};
        double[] result2 = Tasks.seventhTask(array2);
        double[] expected2 = {-1.0, 0.0, 1.0, 9.0};
        assertArrayEquals(expected2, result2, 1e-8);
    }

    @Test
    public void testEighthTask() {
        int[] sequence1 = {1, 3, 5};
        int[] sequence2 = {2, 4, 6};
        ArrayList<Integer> result = Tasks.eighthTask(sequence1, sequence2);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(expected, result);

        int[] sequence3 = {10, 20, 30};
        int[] sequence4 = {5, 15, 25};
        ArrayList<Integer> result2 = Tasks.eighthTask(sequence3, sequence4);
        ArrayList<Integer> expected2 = new ArrayList<>(Arrays.asList(0, 1, 2));
        assertEquals(expected2, result2);
    }

}
