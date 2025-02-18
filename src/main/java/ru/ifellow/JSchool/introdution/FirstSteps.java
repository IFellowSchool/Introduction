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
        return x < xLeft || x > xRight || y < yTop || y > yBottom;
    }


    public int sum(int[] array) {
        if (array == null) {
            return 0;
        }
        int sum = 0;
        for (Integer i : array) {
            sum = sum(array[i], sum);
        }
        return sum;
    }


    public int mul(int[] array) {
        if (array == null) {
            return 0;
        }
        int mul = 1;
        for (Integer i : array) {
            mul = mul(array[i], mul);
        }
        return mul;
    }


    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array == null) {
            return min;
        }
        for (Integer i : array) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        if (array == null) {
            return max;
        }
        for (Integer i : array) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array) {
        double average = 0;
        if (array == null) {
            return average;
        }
        for (Integer i : array) {
            average += array[i];
        }
        return average / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[] array, int value) {
        for (Integer i : array) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }


    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix) {
        int sum = 0;
        if (matrix == null || matrix.length == 0) {
            return sum;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum(sum, matrix[i][j]);
            }
        }
        return sum;
    }

    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if (matrix == null || matrix.length == 0) {
            return max;
        }
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
        int max = Integer.MIN_VALUE;
        if (matrix == null || matrix.length == 0) {
            return max;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        for (int[] line : matrix) {
            if (!isSortedDescendant(line)) {
                return false;
            }
        }
        return true;
    }
}
