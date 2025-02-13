package ru.ifellow.introdution;

import java.util.Arrays;

public class FirstStep {
    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return y != 0 ? x / y : 0;
    }

    public int mod (int x, int y){
        return y!=0 ? x % y : 0;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return (x >= xLeft && x <= xRight) && (y >=yTop && y <= yBottom);
    }

    public int sum(int[] array){
        return Arrays.stream(array).sum();
    }

    public int mul(int[] array){
        if(array.length == 0) return 0;
        return Arrays.stream(array).reduce(1, this::mul);
    }

    public int min(int[] array){
        if(array.length == 0) return Integer.MAX_VALUE;
        return Arrays.stream(array).min().getAsInt();
    }

    public int max(int[] array){
        Integer result = Integer.MIN_VALUE;

        for(Integer num : array) {
            result = num > result ? num : result;
        }

        return result;
    }

    public double average(int[] array){
        if(array.length == 0) return 0.0;
        return (double) sum(array) / array.length;

    }

    public boolean isSortedDescendant(int[] array){
        if(array.length <= 1) return true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array){
        var newArray = Arrays.stream(array).map(n -> (int) Math.pow(n, 3)).toArray();
        System.out.println(Arrays.toString(newArray));
    }

    public boolean find(int[] array, int value){
        return Arrays.stream(array).anyMatch(n -> n == value);
    }

    public void reverse(int[] array){
        int len = array.length;
        for (int i =0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public boolean isPalindrome(int[]array){
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length-1-i]) return false;
        }
        return true;
    }

    public int sum(int[][] matrix){
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }

    public int max(int[][] matrix){
        int temp = Integer.MIN_VALUE;
        for( int[] row : matrix) {
            int maxRow =  max(row);
            temp = Math.max(maxRow, temp);
        }
        return temp;
    }

    public int diagonalMax(int[][] matrix){
        int temp = Integer.MIN_VALUE;

        if(Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray().length == 0) return temp;

        for (int j = 0; j < matrix.length; j++) {
            temp = Math.max(temp, matrix[j][j]);
        }
        return temp;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if(Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray().length == 0) return true;

        int[] array = Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray();
        return isSortedDescendant(array);
    }

}
