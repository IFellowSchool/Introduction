package ru.ifellow.JSchool.introdution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FirstSteps {

    public int sum (int x, int y) {
        return x + y;
    }

    public int mul (int x, int y) {
        return x * y;
    }

    public int div (int x, int y) {
        return x / y;
    }

    public int mod (int x, int y) {
        return x % y;
    }

    public boolean isEqual (int x, int y) {
        return x == y;
    }

    public boolean isGreater (int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop &&  y <= yBottom;
    }

    public int sum(int[] array) {
        return array.length == 0 ? 0 : Arrays.stream(array)
                .sum();
    }

    public int mul(int[] array) {
        return array.length == 0 ? 0 : Arrays.stream(array)
                .reduce(1, (a, b) -> a * b);
    }

    public int min(int[] array) {
        return Arrays.stream(array)
                .min()
                .orElse(Integer.MAX_VALUE);
    }

    public int max(int[] array) {
        return Arrays.stream(array)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public double average(int[] array) {
        return array.length == 0 ? 0 : Arrays.stream(array).asDoubleStream().sum() / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array.length == 0 || array == null) return true;

        for (int i = 1; i < array.length; i++){
            if (array[i] > array[i-1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array) {
        for (int i = 0; i < array.length; i++){
            array[i] = (int) Math.pow(array[i], 3);
        }
    }

    public boolean find(int[]array, int value) {
        return Arrays.stream(array).filter(element -> element == value).findFirst().isPresent();
    }

    public void reverse(int[]array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public boolean isPalindrome(int[]array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(IntStream::of)
                .sum();
    }

    public int max(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(IntStream::of)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            max = Math.max(max, matrix[i][i]);
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix.length == 0 || matrix == null) return true;
        for (int[] array : matrix) {
            if (!isSortedDescendant(array)) return false;
        }
        return true;
    }

}
