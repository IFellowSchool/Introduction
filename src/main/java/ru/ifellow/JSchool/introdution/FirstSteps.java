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
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array){
        int res = 0;
        for (int i : array) {
            res += i;
        }
        return res;
    }

    public int mul(int[] array){
        int res = 1;
        if (array.length == 0) {
            return 0;
        }
        for (int i : array) {
            res *= i;
        }
        return res;
    }

    public int min(int[] array){
        if(array.length == 0){
            return Integer.MAX_VALUE;
        }
        int res = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < res) {
                res = i;
            }
        }
        return res;
    }

    public int max(int[] array){
        if(array.length == 0){
            return Integer.MIN_VALUE;
        }
        int res = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > res) {
                res = i;
            }
        }
        return res;
    }

    public double average(int[] array){
        if(array.length == 0){
            return 0;
        }
        int res = 0;
        for(int x = 1; x < array.length; x++){
            res += array[x];
        }
        return (double) res / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array.length == 0) {
            return true;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i-1] <= array[i]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        for(int i: array){
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        int left = 0;
        int right = array.length - 1;
        if(value < array[left] || value > array[right]) {
            return false;
        }

        while (left <= right) {
            int middle = (left + right) / 2;
            if(value == array[middle]) {
                return true;
            }
            if(value < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
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
        if(array.length == 0) {
            return true;
        }
        int[] newArray = array.clone();
        reverse(newArray);
        for(int i: array){
            if(array[i] != newArray[i]){
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        int res = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                res += anInt;
            }
        }
        return res;
    }

    public int max(int[][] matrix){
        if(matrix.length == 0 || matrix[0].length == 0){
            return Integer.MIN_VALUE;
        }
        int res = Integer.MIN_VALUE;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (res < anInt) {
                    res = anInt;
                }
            }
        }
        return res;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if (matrix.length == 0 || matrix[0].length == 0) {
            return true;
        }

        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) {
                return false;
            }
        }

        return true;
    }

}
