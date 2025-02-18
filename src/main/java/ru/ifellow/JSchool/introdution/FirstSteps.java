package ru.ifellow.JSchool.introdution;

public class FirstSteps {

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
        return (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom);
    }

    public int sum(int[] array){
        int sumNumbers = 0;
        if (array == null) {
            return sumNumbers;
        }
        for (int num: array) {
            sumNumbers += num;
        }
        return sumNumbers;
    }

    public int mul(int[] array){
        if (array.length == 0) {
            return 0;
        }
        int productNumbers = 1;
        for (int num: array) {
            productNumbers *= num;
        }
        return productNumbers;
    }

    public int min(int[] array){
        int minNumber = Integer.MAX_VALUE;
        for (int num: array) {
            if (num < minNumber) {
                minNumber = num;
            }
        }
        return minNumber;
    }

    public int max(int[] array){
        int minNumber = Integer.MIN_VALUE;
        for (int num: array) {
            if (num > minNumber) {
                minNumber = num;
            }
        }
        return minNumber;
    }

    public double average(int[] array){
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num: array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 3);
        }
    }

    public boolean find(int[] array, int value){
        for (int num: array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public boolean isPalindrome(int[]array){
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        int sumNumbers = 0;
        for (int[] array : matrix) {
            for (int num : array) {
                sumNumbers += num;
            }
        }
        return sumNumbers;
    }

    public int max(int[][] matrix){
        int maxNumber = Integer.MIN_VALUE;
        for (int[] array : matrix) {
            for (int num : array) {
                if (maxNumber < num) {
                    maxNumber = num;
                }
            }
        }
        return maxNumber;
    }

    public int diagonalMax(int[][] matrix){
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (maxNumber < matrix[i][i]) {
                maxNumber = matrix[i][i];
            }
        }
        return maxNumber;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int[] array: matrix) {
            if (!isSortedDescendant(array)) {
                return false;
            }
        }
        return true;
    }

}
