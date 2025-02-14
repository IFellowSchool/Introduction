package ru.ifellow.introdution;

import java.util.Arrays;

public class FirstStep {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        if (y != 0)
            return x / y;
        throw new RuntimeException("Division by zero");
    }

    public int mod(int x, int y) {
        if (y != 0)
            return x % y;
        throw new RuntimeException("Division by zero");
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom);
    }

    public int sum(int[] array) {
        return Arrays.stream(array).sum();
    }

    public int mul(int[] array) {
        return Arrays.stream(array).reduce((sum, i) -> sum * i).orElse(0);
    }

    public int min(int[] array) {
        return Arrays.stream(array).min().orElse(Integer.MAX_VALUE);
    }

    public int max(int[] array) {
        return Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
    }

    public double average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i])
                return false;
        }

        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            array[i] = n * n * n;
        }
    }

    public boolean find(int[] array, int value) {
        return Arrays.stream(array).anyMatch(i -> i == value);
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int t = array[i];
            int endElement = array.length - 1 - i;
            array[i] = array[endElement];
            array[endElement] = t;
        }
    }

    public boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i])
                return false;
        }

        return true;
    }

    public int sum(int[][] matrix) {
        int sum = 0;

        for (int[] array : matrix) {
            sum += Arrays.stream(array).sum();
        }

        return sum;
    }

    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        for (int[] array : matrix) {
            int maxOfArray = max(array);

            if (maxOfArray > max)
                max = maxOfArray;
        }

        return max;
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max)
                max = matrix[i][i];
        }

        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] array : matrix) {
            if (!isSortedDescendant(array))
                return false;
        }

        return true;
    }

}
