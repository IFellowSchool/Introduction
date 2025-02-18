package ru.ifellow.introdution;

public class FirstStep {

    public  int sum(int x, int y) {
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


    public  int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }


    public  int mul(int[] array) {
        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            sum = sum * array[i];
        }
        return sum;
    }

    public  int min(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array == null) {
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    public  int max(int[] array) {

        int max = Integer.MIN_VALUE;
        if (array == null) {
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public  double average(int[] array) {
        int sum = 0;
        if (array == null) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }


    public  boolean isSortedDescendant(int[] array) {
        if ((array.length == 0) || (array.length == 1)) {
            return true;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] >= array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }


    public  void cube(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = i * i;
            System.out.println(sum);
        }
    }

    public  boolean find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public  void reverse(int[] array) {
        for (int i = 0; i < array.length - 1; i--) {
            System.out.println(array[i + array.length - 1]);
        }
    }

    public  boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }


    public  int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }


    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if (matrix == null) {
            return Integer.MIN_VALUE;
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


    public  int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if (matrix == null) {
            return Integer.MIN_VALUE;
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }

        return max;
    }


    public  boolean isSortedDescendant(int[][] matrix) {
        if ((matrix.length == 0) || (matrix.length == 1)) {
            return true;
        } else {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] <= matrix[i + 1][j + 1]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

}
