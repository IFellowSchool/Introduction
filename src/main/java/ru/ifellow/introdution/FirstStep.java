package ru.ifellow.introdution;

public class FirstStep {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return  x * y;
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
        return (x >= xLeft) && (x <= xRight) && (y >= yTop) && (y <= yBottom);
    }

    public int sum(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int sumOfArray = 0;
        for (int i : array) {
            sumOfArray += i;
        }
        return sumOfArray;
    }

    public int mul(int[] array){
        if (array == null || array.length == 0){
            return 0;
        }
        int product  = 1;
        for (int i : array) {
            product  *= i;
        }
        return product ;
    }

    public int min(int[] array){
        if (array == null || array.length == 0){
            return Integer.MAX_VALUE;
        }
        int minInArray = array[0];
        for (int i : array) {
            if (i < minInArray){
                minInArray = i;
            }
        }
        return minInArray;
    }

    public int max(int[] array){
        if (array == null || array.length == 0){
            return Integer.MIN_VALUE;
        }
        int maxValue = array[0];
        for (int i : array) {
            if (i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;
    }

    public double average(int[] array){
        if (array == null || array.length == 0){
            return 0;
        }
        int sumOfArray = 0;
        for (int i : array) {
            sumOfArray += i;
        }
        return (double) sumOfArray / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array == null || array.length == 0){
            return true;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]){
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public boolean isPalindrome(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - i - 1]){
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int sumOfMatrix = 0;
        for (int[] row : matrix) {
            for (int i : row) {
                sumOfMatrix += i;
            }
        }
        return sumOfMatrix;
    }

    public int max(int[][] matrix){
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }
        int maxValue = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int i : row) {
                if (i > maxValue){
                    maxValue = i;
                }
            }
        }
        return maxValue;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length){
                throw new IllegalArgumentException("Matrix must be square");
            }
            maxValue = Math.max(maxValue, matrix[i][i]);
        }
        return maxValue;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if (matrix == null){
            return true;
        }
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)){
                return false;
            }
        }
        return true;
    }
}
