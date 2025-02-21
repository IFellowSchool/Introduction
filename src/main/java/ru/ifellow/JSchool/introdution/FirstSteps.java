package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum (int x, int y){
        long result = (long) x + y;
        if (result >>> 31 != 0) {
            System.out.println("Overflow int!!!"); // Не знаю как выкинуть исключение в методе
            return 0;
        }
        return (int) result;
    }

    public int mul (int x, int y){
        long result = (long) x * y;
        if (result >>> 31 != 0) {
            System.out.println("Overflow int!!!"); // Не знаю как выкинуть исключение в методе
        }
        return (int) result;
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
        boolean x_in_rectangle = Math.min(xLeft, xRight) <= x && x <= Math.max(xLeft, xRight);
        boolean y_in_rectangle = Math.min(yBottom, yTop) <= y && y <= Math.max(yBottom, yTop);
        return  x_in_rectangle && y_in_rectangle;
    }

    public int sum(int[] array){
        long result = 0;

        for (int number : array) {
            result = (long) number + result;
        }

        if (result >>> 31 != 0) {
            System.out.println("Overflow int!!!"); // Не знаю как выкинуть исключение в методе
            return 0;
        }
        return (int) result;
    }

    public int mul(int[] array){
        long result = 1;
        if (array.length == 0) {
            return 0;
        }
        for (int number : array) {
            result = (long) number * result;
        }

        if (result >>> 31 != 0) {
            System.out.println("Overflow int!!!"); // Не знаю как выкинуть исключение в методе
            return 0;
        }
        return (int) result;
    }

    public int min(int[] array){
        if (array.length == 0) {
            return Integer.MAX_VALUE;
        } else {
            int min_number = array[0];
            for (int number : array) {
                if (number < min_number) {
                    min_number = number;
                }
            }
            return min_number;
        }
    }

    public int max(int[] array){
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int max_number = array[0];
            for (int number : array) {
                if (number > max_number) {
                    max_number = number;
                }
            }
            return max_number;
        }
    }

    public double average(int[] array){
        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array.length == 0) {
            return true;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (isGreater(array[i + 1], array[i])) {
                    return false;
                }
            }
        }
        return true;

    }

    public void cube(int[]array){
        var result = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (long) Math.pow(array[i], 3);
        }
    }

    public boolean find(int[]array, int value){
        for (int number : array) {
            if (isEqual(number, value)) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        int buffer;
        for (int i = 0; i < array.length / 2; i++) {
            buffer = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buffer;
        }
    }

    public boolean isPalindrome(int[]array){
        int[] initArray = array.clone();
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            if (initArray[i] != array[i]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        long result = 0;
        for (int[] array : matrix) {
            result = (long) sum(array) + result;
        }

        if (result >>> 31 != 0) {
            System.out.println("Overflow int!!!"); // Не знаю как выкинуть исключение в методе
            return 0;
        }
        return (int) result;
    }

    public int max(int[][] matrix){
        int[] result = new int [matrix.length];
        int i = 0;

        if (matrix.length == 0) {
            return Integer.MIN_VALUE;
        }
        for (int[] array : matrix) {
            result[i] = max(array);
            i++;
        }

        return max(result);
    }

    public int diagonalMax(int[][] matrix){
        int[] result = new int [matrix.length];

        if (matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 0) {
                return Integer.MIN_VALUE;
            }
            if (matrix[i].length != matrix.length) {
                System.out.println("Matrix is not SQUARE !!!");
                return Integer.MIN_VALUE;
            }
            result[i] = matrix[i][i];
        }

        return max(result);
    }

    public boolean isSortedDescendant(int[][] matrix){

        for (int[] array : matrix) {
            if (!isSortedDescendant(array)) {
                return false;
            }
        }
        return true;
    }

}
