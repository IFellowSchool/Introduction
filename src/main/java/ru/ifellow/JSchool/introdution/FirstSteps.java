package ru.ifellow.JSchool.introdution;

public class FirstSteps {

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
        return (xLeft <= x && x <= xRight) && (yTop <= y && y <= yBottom);
    }

    public int sum(int[] array){
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum;
    }

    public int mul(int[] array){
        if (array.length == 0) {
            return 0;
        }
        int mul = 1;

        for (int num : array) {
            mul *= num;
        }

        return mul;

    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;

    }

    public double average(int[] array){
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;

    }

    public boolean isSortedDescendant(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[] array, int value){
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public boolean isPalindrome(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        int sum = 0;
        for (int[] arr : matrix) {
            for (int j : arr) {
                sum += j;
            }
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int[] arr : matrix) {
            for (int j : arr) {
                if (j > max) {
                    max = j;
                }
            }
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

    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] arr : matrix) {
            if (!isSortedDescendant(arr)) {
                return false;
            }
        }
        return true;
    }
}
