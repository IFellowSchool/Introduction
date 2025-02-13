package ru.ifellow.introdution;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Math.floorDiv;
import static java.lang.Math.multiplyExact;
import static java.util.Arrays.stream;

public class FirstStep {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return multiplyExact(x, y);
    }

    public int div(int x, int y) {
        return floorDiv(x, y);
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
        return x >= xLeft && x <= xRight && y <= yBottom && y >= yTop;
    }

    public int sum(int[] array) {
        return stream(array).sum();
    }

    public int mul(int[] array) {
        return stream(array)
                .reduce((x, y) -> x * y)
                .orElse(0);
    }

    public int min(int[] array) {
        return stream(array)
                .min()
                .orElse(Integer.MAX_VALUE);
    }

    public int max(int[] array) {
        return stream(array)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public double average(int[] array) {
        return stream(array)
                .average()
                .orElse(0);
    }

    public boolean isSortedDescendant(int[] array) {
        return IntStream
                .range(0, array.length - 1)
                .allMatch(i -> array[i] > array[i + 1]);
    }

    public void cube(int[] array) {
        IntStream
                .range(0, array.length)
                .forEach(i -> array[i] = (int) Math.pow(array[i], 3));
    }

    public boolean find(int[] array, int value) {
        return IntStream
                .range(0, array.length)
                .anyMatch(i -> array[i] == value);
    }

    public void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            int val = array[i];
            array[i] = array[j];
            array[j] = val;
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array.length == 0) {
            return true;
        }

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            if (array[i] != array[j]) {
                return false;
            }
        }

        return true;
    }


    public int sum(int[][] matrix) {
        return stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }


    public int max(int[][] matrix) {
        return stream(matrix)
                .flatMapToInt(Arrays::stream)
                .max()
                .orElse(Integer.MIN_VALUE);
    }


    public int diagonalMax(int[][] matrix) {
        return IntStream
                .range(0, matrix.length)
                .map(i -> matrix[i][i])
                .max()
                .orElse(Integer.MIN_VALUE);
    }


    public boolean isSortedDescendant(int[][] matrix) {
        return stream(matrix)
                .allMatch(this::isSortedDescendant);
    }
}
