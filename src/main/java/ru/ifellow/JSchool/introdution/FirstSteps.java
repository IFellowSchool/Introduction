package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum(int x, int y) {
        long result = (long) x + y;
        return (int) result;
    }

    public int mul(int x, int y) {
        long result = (long) x * y;
        return (int) result;
    }

    public int div(int x, int y) {
        return (int) ((double) x / y);
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
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public int mul(int[] array) {
        if (array.length == 0) return 0;
        long result = 1;
        for (int num : array) {
            result *= num;
        }
        return (int) result;
    }

    public int min(int[] array) {
        if (array.length == 0) return Integer.MAX_VALUE;
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    public int max(int[] array) {
        if (array.length == 0) return Integer.MIN_VALUE;
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    public double average(int[] array) {
        if (array.length == 0) return 0;
        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) return false;
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            long cube = (long) array[i] * array[i] * array[i];
            array[i] = (int) cube;
        }
    }

    public boolean find(int[] array, int value) {
        for (int num : array) {
            if (num == value) return true;
        }
        return false;
    }

    public void reverse(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public boolean isPalindrome(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    public int sum(int[][] matrix) {
        long sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        return (int) sum;
    }

    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) max = num;
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {
        if (matrix.length == 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (i < matrix[i].length && matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) return false;
        }
        return true;
    }
}