package ru.ifellow.introdution;

import java.util.Arrays;
import java.util.stream.Stream;

public class FirstStep {

    public int sum(int x, int y) {
        if (Integer.MAX_VALUE - x < y || Integer.MIN_VALUE - x < y) {
            throw new IllegalArgumentException(String.format("sum of numbers %d and %d over of integer range", x, y));
        }
        return x + y;
    }

    public int mul(int x, int y) {
        if (Integer.MAX_VALUE / Math.abs(x) < Math.abs(y)) {
            throw new IllegalArgumentException(String.format("product of numbers %d and %d over of integer range", x, y));
        }
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;

    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;

    }

    public int sum(int[] array) {
        return Arrays.stream(array).reduce(this::sum).orElse(0);
    }

    public int mul(int[] array) {
        return Arrays.stream(array).reduce(this::mul).orElse(0);

    }

    public int min(int[] array) {
        return Arrays.stream(array).min().orElse(Integer.MAX_VALUE);

    }

    public int max(int[] array) {
        return Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
    }

    public double average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = mul(array[i], mul(array[i], array[i]));
        }
    }

    public boolean find(int[] array, int value) {
        return Arrays.stream(array).anyMatch(i -> i == value);
    }

    public void reverse(int[] array) {
        int s = array.length / 2 - 1;
        for (int i = 0; i <= s; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        int iLeft = array.length / 2 - 1;
        int iRight = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;

        while (iLeft >= 0) {
            if (array[iLeft] != array[iRight]) {
                return false;
            }
            iLeft--;
            iRight++;
        }
        return true;
    }

    public int sum(int[][] matrix) {
        return Stream.of(matrix).flatMapToInt(Arrays::stream).reduce(this::sum).orElse(0);
    }

    public int max(int[][] matrix) {
        return Stream.of(matrix).flatMapToInt(Arrays::stream).max().orElse(Integer.MIN_VALUE);
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            max = Math.max(max,matrix[i][i]);
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) {
                return false;
            }
        }
        return true;
    }

}
