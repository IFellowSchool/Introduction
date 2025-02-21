package ru.ifellow.JSchool.introdution;
public class FirstStep {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul (int x, int y) {
        return x * y;
    }

    public int div (int x, int y) {
        return y != 0 ? x / y : 0;
    }

    public int mod (int x, int y) {
        return y != 0 ? x % y : 0;
    }

    public boolean isEqual (int x, int y) {
        return x == y ? true : false;

    }

    public boolean isGreater (int x, int y) {
        return x > y ? true : false;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom ? true : false;
    }

    public int sum(int[] array) {

        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return  res;
    }

    public int mul(int[] array) {

        int res = 1;
        if (array.length == 0) {
            res = 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                res *= array[i];
            }
        }
        return res;
    }

    public int min(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    public double average(int[] array) {

        double res = 0.0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }

        return array.length > 0 ? res / array.length : 0.0;
    }

    public boolean isSortedDescendant(int[] array) {

        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void cube(int[]array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value) {

        boolean res = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                res = true;
                break;
            }
        }
        return res;
    }

    public void reverse(int[]array) {
        int[] rev_array = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            rev_array[array.length - i - 1] = array[i];
        }
    }

    public boolean isPalindrome(int[]array) {

        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public int sum(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int max(int[][] matrix) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {

        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}