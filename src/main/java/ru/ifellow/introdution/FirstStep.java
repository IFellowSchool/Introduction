package ru.ifellow.introdution;

public class FirstStep {

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
        int result = 0;
        for (int j : array) result += j;
        return result;
    }

    public int mul(int[] array) {
        if (array.length == 0)
            return 0;
        int result = 1;
        for (int j : array) result *= j;
        return result;
    }

    public int min(int[] array) {
        int result = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < result)
                result = j;
        }
        return result;
    }

    public int max(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > result)
                result = j;
        }
        return result;
    }

    public double average(int[] array) {
        int sum = sum(array);
        if (sum > 0)
            return sum / (double) array.length;
        return 0;
    }

    public boolean isSortedDescendant(int[] array) {
        int current = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > current)
                return false;
        }
        return true;
    }

    public void cube(int[] array) {
        for (int j : array)
            array[j] = j * j * j;
    }

    public boolean find(int[] array, int value) {
        for (int j : array)
            if (j == value)
                return true;
        return false;
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1])
                return false;
        }
        return true;
    }

    public int sum(int[][] matrix) {
        int result = 0;
        for (int[] ints : matrix) {
            result += sum(ints);
        }
        return result;
    }

    public int max(int[][] matrix) {
        int result = Integer.MIN_VALUE;
        for (int[] ints : matrix) {
            int max = max(ints);
            if (max > result)
                result = max;
        }
        return result;
    }

    public int diagonalMax(int[][] matrix) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            result = matrix[i][i];
        }
        return result;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[0]))
                return false;
        }
        return true;
    }
}
