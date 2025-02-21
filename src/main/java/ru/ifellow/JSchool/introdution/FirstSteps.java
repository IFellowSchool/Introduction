package ru.ifellow.JSchool.introdution;

import java.io.Console;
import java.util.Arrays;

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
        return ((xLeft <= x && x <= xRight) && (yTop <= y && y <= yBottom));
    }

    public int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int total = 0;
        for (int j : array) {
            total += j;
        }
        return total;
    }

    public int mul(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int total = 1;
        for (int i : array) {
            total *= i;
        }
        return total;
    }

    public int min(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MAX_VALUE;
        }
        int minVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minVal > array[i]) {
                minVal = array[i];
            }
        }
        return minVal;
    }

    public int max(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int maxVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxVal < array[i]) {
                maxVal = array[i];
            }
        }
        return maxVal;
    }

    public double average(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (double) sum / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((array[i] * array[i] * array[i]));
        }
    }

    public boolean find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public boolean isPalindrome(int[] array) {
        if (array.length == 0) {
            return true;
        } else {
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - i - 1]) {
                    return false;
                }
            }
            return true;
        }
    }

    public int sum(int[][] matrix) {
        int total = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }
        return total;
    }

    public int max(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    public int diagonalMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = matrix[0][0];

        for (int i = 1; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j=0; j < matrix[i].length-1; j++) {
                if(matrix[i][j] < matrix[i][j+1]) {
                    return false;
                }
            }
        }
        return true;
    }

}

