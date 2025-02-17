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
        return (x == y) ? true : false;
    }

    public boolean isGreater(int x, int y) {
        return (x > y) ? true : false;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return (x >= xLeft && x <= xRight && y >= yTop && y <= yBottom);
    }

    public int sum(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int result = 0;
        for (int n : array) {
            result += n;
        }
        return result;
    }

    public int mul(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int result = 1;
        for (int n : array) {
            result *= n;
        }
        return result;
    }

    public int min(int[] array) {
        if (array.length == 0) {
            return Integer.MAX_VALUE;
        }
        int minNum = array[0];
        for (int n : array) {
            if (n < minNum) {
                minNum = n;
            }
        }
        return minNum;
    }

    public int max(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int maxNum = array[0];
        for (int n : array) {
            if (n > maxNum) {
                maxNum = n;
            }
        }
        return maxNum;
    }

    public double average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return (double) sum / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array.length == 0) {
            return true;
        }
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
    }

    public boolean find(int[] array, int value) {
        for (int n : array) {
            if (n == value) {
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
    }

    public boolean isPalindrome(int[] array) {
        if (array.length == 0) {
            return true;
        }
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
        int sumNum = 0;
        for (int[] row : matrix) {
            for (int s : row) {
                sumNum += s;
            }
        }
        return sumNum;
    }

    public int max(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int s : row) {
                if (s > max) {
                    max = s;
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int s = matrix[i][i];
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) {
                return false;
            }
        }
        return true;
    }

}
