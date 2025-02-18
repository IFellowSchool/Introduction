package ru.ifellow.JSchool.introdution;

import java.util.Arrays;
import java.util.stream.IntStream;

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
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return (x >= xLeft && x <= xRight && y >= yTop && y <= yBottom);
    }

    public int sum(int[] array) {
        int sumarray = 0;
        for (int i = 0; i < array.length; i++) {
            sumarray += array[i];
        }
        return sumarray;
    }

    public int mul(int[] array) {
        int proizvedenie = 0;
        if (array.length > 0) {
            proizvedenie = 1;
            for (int i = 0; i < array.length; i++) {
                proizvedenie *= array[i];
            }
        }
        return proizvedenie;
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array) {
        int middle = 0;
        if (array.length > 0) {
            middle = sum(array)/array.length;
        }
        return middle;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length) {
                if (array[i + 1] > array[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
        return;
    }

    public boolean find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        int cup;
        for (int i = 0, iend = array.length - 1; i < iend; i++, iend--) {
            cup = array[i];
            array[i] = array[iend];
            array[iend] = cup;
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array.length >1) {
            for (int i = 0, iend = array.length - 1; i < iend; i++, iend--) {
                if (array[i] != array[iend]) {
                    return false;
                }
            }
        }
        return true;
    }


    public int sum(int[][] matrix){
        int summatrix = 0;
        for (int i = 0; i < matrix.length; i++){
            summatrix += sum(matrix[i]);
        }
        return summatrix;
    }

    public int max(int[][] matrix){
        int temp;
        int maxmatrix = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            temp = max(matrix[i]);
            if (temp > maxmatrix){
                maxmatrix = temp;
            }
        }
        return maxmatrix;
    }

    public int diagonalMax(int[][] matrix){
        int temp2;
        int diagonalmax = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++){
            temp2 = matrix[i][i];
            if (temp2 > diagonalmax){
                diagonalmax = temp2;
            }
        }
        return diagonalmax;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])){
                return false;
            }
        }
        return true;
    }
}
