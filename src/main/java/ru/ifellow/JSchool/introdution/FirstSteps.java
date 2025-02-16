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
    return x==y;
    }

    public boolean isGreater (int x, int y){
    if (x > y) {
                return true;
            } else {
                return false;
            }
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
    return xLeft<=x && x<=xRight && yTop<=y && y<=yBottom;
    }

    public int sum(int[] array){
    int sum = 0;
        if (array.length == 0) return 0;
        else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
    }

    public int mul(int[] array){
    int x = 1;
        for (int i = 0; i < array.length; i++) {
            x *= array[i];
        }
        if (array.length==0) {
            return 0;
        } else {
            return x;
        }
    }

    public int min(int[] array){
    int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = (min < array[i]) ? min : array[i];
        }
        return min;
    }

    public int max(int[] array){
    if (array.length == 0);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array){
    if (average(array) == 0) return 0;
        double sum = 0;
        for (int n = 0; n < average(array); n++) {
            sum += array[n];
        }
        return (sum / average(array));
    }

    public boolean isSortedDescendant(int[] array){
    if ((array.length == 0) || (array.length == 1)) {
            return true;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void cube(int[]array){
    for (int i = 0; i < array.length; i++)
            array[i] = array[i]*i*i;
    }

    public boolean find(int[]array, int value){
    if (array.length == value) {
            return true;
        } else {
            return false;
        }
    }

    public void reverse(int[]array){
    int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public boolean isPalindrome(int[]array){
    for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - i - 1]) {
                    return true;
                }
            }
            return false;
    }

    public int sum(int[][] matrix){
    int sum = 0;
        for (int[] ints : matrix) {
            for (int number : ints) {
                sum += number;
            }
        }
        return sum;
    }

    public int max(int[][] matrix){
    if (matrix.length == 0) return Integer.MIN_VALUE;
        int max = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
    int max = -1;
        if (matrix.length == 0 || matrix.length == 1) return Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
    for (int [] array : matrix) {
                if (!isSortedDescendant(array)) {
                    return false;
                }
            }
            return true;
    }

}
