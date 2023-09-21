package by.bsuir.zaitseva;

import java.util.ArrayList;
import java.util.Random;

public class Tasks {

    public static void main(String args[]) {
        double[][] matrix = sixthTask(new double[]{1, 2, 3});
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static double firstTask(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y))) + x;
    }

    public static boolean secondTask(double x, double y) {
        final double xUpSideMin = -4.0;
        final double xUpSideMax = 4.0;
        final double yUpSideMin = 0.0;
        final double yUpSideMax = 5.0;

        final double xDownSideMin = -6.0;
        final double xDownSideMax = 6.0;
        final double yDownSideMin = -2.0;
        final double yDownSideMax = 0.0;

        return ((x >= xUpSideMin && x <= xUpSideMax) && (y >= yUpSideMin && y <= yUpSideMax)) || ((x >= xDownSideMin && x <= xDownSideMax) && (y >= yDownSideMin && y <= yDownSideMax));
    }

    public static String thirdTask(double a, double b, double h) {
        String answerTable = "";
        for (double x = a; x <= b; x += h) {
            double result = Math.tan(x);
            answerTable += x + "\t" + result + "\n";
        }
        return answerTable;
    }

    public static ArrayList<Integer> fourthTask(long[] array) {
        ArrayList<Integer> indexArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isProbablePrime(array[i], 40)) {
                indexArray.add(i);
            }
        }
        return indexArray;
    }

    public static boolean isProbablePrime(long n, int k) {
        if (n == 2 || n == 3)
            return true;
        if (n == 1 || n % 2 == 0)
            return false;
        for (int i = 0; i < k; i++) {
            Random random = new Random();
            long a = random.nextLong();
            a = Math.abs(a);
            a = (a % (n - 2)) + 2;
            if (fastExponentiation(a, (n - 1), n) != 1)
                return false;
        }
        return true;
    }

    public static long fastExponentiation(long a, long z, long n) {
        long a1 = a;
        long z1 = z;
        long x = 1;
        while (z1 != 0) {
            while (z1 % 2 == 0) {
                z1 = z1 / 2;
                a1 = (a1 * a1) % n;
            }
            z1--;
            x = (x * a1) % n;
        }
        return x;
    }

    public static int fifthTask(int[] A) {
        int n = A.length;
        int[] dynamicProgramming = new int[n];
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            dynamicProgramming[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && dynamicProgramming[i] < dynamicProgramming[j] + 1) {
                    dynamicProgramming[i] = dynamicProgramming[j] + 1;
                }
            }
            maxLen = Math.max(maxLen, dynamicProgramming[i]);
        }
        return n - maxLen;
    }

    public static double[][] sixthTask(double[] arr) {
        double[][] matrix = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[(i + j) % arr.length];
            }
        }
        return matrix;
    }

    public static double[] seventhTask(double[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    double temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return array;
    }

    public static ArrayList<Integer> eighthTask(int[] sequence1, int[] sequence2) {
        ArrayList<Integer> insertionPoints = new ArrayList<>();
        int i = 0, j = 0;
        while (i < sequence1.length && j < sequence2.length) {
            if (sequence1[i] <= sequence2[j]) {
                i++;
            } else {
                insertionPoints.add(i);
                j++;
            }
        }
        while (j < sequence2.length) {
            insertionPoints.add(i);
            j++;
        }
        return insertionPoints;
    }


}
