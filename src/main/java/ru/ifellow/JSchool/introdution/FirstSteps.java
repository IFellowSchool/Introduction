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
        if (x < xLeft || x > xRight) {
            return false;
        }
        if (y < yTop || y > yBottom) {
            return false;
        }
        return true;
    }

    public int sum(int[] array){
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    public int mul(int[] array){
        if (array.length == 0) {
            return 0;
        }
        int mul = 1;
        for (int item : array) {
            mul *= item;
        }
        return mul;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        for (int item : array) {
            min = Math.min(min, item);
        }
        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        for (int item : array) {
            max = Math.max(max, item);
        }
        return max;
    }

    public double average(int[] array){
        if (array.length == 0) {
            return 0;
        }
        return (double)sum(array) / array.length;
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
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        for (int item : array) {
            if (value == item) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public boolean isPalindrome(int[]array){
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

    public int sum(int[][] matrix){
        int sum = 0;
        for (int[] row : matrix) {
            sum += sum(row);
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            max = Math.max(max(row), max);
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            max = Math.max(max, matrix[i][i]);
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) {
                return false;
            }
        }
        return true;
    }

}
