package ru.ifellow.JSchool.introdution;

public class FirstStep {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return xLeft <= x  && x <= xRight && yBottom <= y && y <= yTop;
    }

    public int sum(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public int mul(int[] array){
        if (array.length == 0) {
            return 0;
        }

        int mult = 1;

        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }

        return mult;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public double average(int[] array){
        if (array.length == 0) {
            return 0;
        }

        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i] * array[i];
        }

    }

    public boolean find(int[]array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }

    public void reverse(int[]array){
        int tmp;

        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    public boolean isPalindrome(int[]array){
        if (array.length < 2) {
            return true;
        }

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            if (array[i] != array[j]) {
                return false;
            }
        }

        return true;
    }

    public int sum(int[][] matrix){
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += sum(matrix[i]);
        }

        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            max = max(matrix[i]);
        }

        return max;
    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }

        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])) {
                return false;
            }
        }

        return true;
    }
}
