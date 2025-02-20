package ru.ifellow.JSchool.introdution;

import java.lang.reflect.Array;

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
        return (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom);
    }

    public int sum(int[] array){
        int sum = 0;
        for (int i: array){
            sum += i;
        }
        return sum;
    }

    public int mul(int[] array){
        int mul = 1;

        if (array.length == 0){
            return 0;
        }

        for (int i: array){
            mul *= i;
        }
        return mul;
    }

    public int min(int[] array){
        if (array.length == 0){
            return Integer.MAX_VALUE;
        }

        int min = array[0];

        for (int i: array){
            if (i < min){
                min = i;
            }
        }
        return  min;
    }

    public int max(int[] array){
        if (array.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = array[0];

        for (int i: array){
            if (i > max){
                max = i;
            }
        }
        return  max;
    }

    public double average(int[] array){
        if (array.length == 0){
            return 0;
        }

        double aver = 0;

        for (double i: array){
            aver += i ;
        }
        return aver / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array.length == 0){
            return true;
        }

        for (int i = 1; i < array.length; i++){
            if (array[i] > array[i-1]){
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        for (int i : array){
            if (value == i){
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

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int max(int[][] matrix){
        if (matrix.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][i] > max){
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int[] i: matrix){
            if(!isSortedDescendant(i)){
                return false;
            }
        }
        return true;
    }

}
