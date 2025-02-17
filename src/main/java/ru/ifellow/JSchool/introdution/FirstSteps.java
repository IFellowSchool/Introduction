package ru.ifellow.JSchool.introdution;

import java.util.Arrays;

public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    }

    public int mod(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        if (xLeft > xRight) {
            throw new IllegalArgumentException("Xleft is greater than xRight");
        }
        if (yTop > yBottom) {
            throw new IllegalArgumentException("Ytop is greater than yBottom");
        }
        return xLeft <= x && xRight >= x && yTop <= y && yBottom >= y;
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public int mul(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            mul *= array[i];
        }
        return mul;
    }

    public int min(int[] array) {
        if (array.length == 0) return Integer.MAX_VALUE;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array) {
        if (array.length == 0) return Integer.MIN_VALUE;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    public double average(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;

    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public boolean find(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        for (int i = end; i >= start; i--) {
            int temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int max(int[][] matrix) {
        if (matrix.length == 0|| matrix[0].length == 0) return Integer.MIN_VALUE;

        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {
        if (matrix.length == 0|| matrix[0].length == 0) return Integer.MIN_VALUE;
        int max = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }

        return max;
    }


    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] row : matrix) {
            if (row.length > 0 && !isSortedDescendant(row)) {
                return false;
            }
        }
        return true;
    }

}
