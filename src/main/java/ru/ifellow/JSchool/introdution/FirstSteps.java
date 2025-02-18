package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
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
        int sum = 0;

        for (int i : array) sum += i;

        return sum;
    }

    public int mul(int[] array) {
        if (array.length == 0) return 0;

        int mul = 1;
        for (int i : array) mul *= i;

        return mul;
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i : array) {
            if (i < min) min = i;
        }

        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > max) max = i;
        }

        return max;
    }

    public double average(int[] array) {
        if (array.length == 0) return 0;

        return (double) sum(array) / (double) array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array.length == 0 || array.length == 1) return true;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) return false;
        }

        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[] array, int value) {
        for (int i : array) {
            if (i == value) return true;
        }

        return false;
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) return false;
        }

        return true;
    }

    public int sum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += sum(matrix[i]);
        }

        return sum;
    }

    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            int temp = max(matrix[i]);
            if (temp > max) max = temp;
        }

        return max;
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) max = matrix[i][i];
        }

        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])) return false;
        }

        return true;
    }
}
