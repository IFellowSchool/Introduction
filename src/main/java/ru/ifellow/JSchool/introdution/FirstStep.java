package ru.ifellow.JSchool.introdution;

public class FirstStep {

    public int sum (int x, int y){
        return x+y;
    }

    public int mul (int x, int y){
        return x*y;
    }

    public int div (int x, int y){
        return x/y;
    }

    public int mod (int x, int y){
        return x%y;
    }

    public boolean isEqual (int x, int y){
        return x==y;
    }

    public boolean isGreater (int x, int y){
        return x>y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array){
        if (array.length == 0) {
            return 0; 
        }
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum += array[i];
        } 
        return sum;
    }

    public int mul(int[] array){
        if (array.length == 0) {
            return 0; 
        }
        int multy = 1;
        for (int i = 0; i<array.length; i++){
            multy *= array[i];
        
        } 
        return multy;
    }

    public int min(int[] array) {
        if (array.length == 0) {
            return Integer.MAX_VALUE; 
        }
        
        int min = array[0]; 
        for (int i = 1; i < array.length; i++) { 
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array){
        if (array.length == 0) {
            return Integer.MIN_VALUE; 
        }
        
        int max = array[0]; 
        for (int i = 1; i < array.length; i++) { 
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array){
        if (array.length == 0) {
            return 0; 
        }
        double sum = 0.0;
        for (int i = 0; i<array.length; i++){
            sum += array[i];
        } 
        return sum/array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array.length == 0) {
            return true; 
        }

        for (int i = 1; i<array.length; i++){
            if (array[i] >= array[i-1]){
                return false;
            }
        } 
        return true;
    }

    public void cube(int[] array){
        for (int i = 0; i<array.length; i++){
            array[i] = array[i]*array[i]*array[i];
        }
    }

    public boolean find(int[]array, int value){
        for (int i = 0; i<array.length; i++){
            if (array[i] == value){
                return true;
            }
        } 
        return false;
    }

    public void reverse(int[] array){
        int rev;
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            rev = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = rev;
        }
    }

    public boolean isPalindrome(int[] array){
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                return false; 
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        int totalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                totalSum += matrix[i][j];
            }
        }
        return totalSum;
    }
    

    public int max(int[][] matrix){
        if (matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }
    
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE; 
        }
    
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (i < matrix[i].length) { 
                if (matrix[i][i] > maxValue) {
                    maxValue = matrix[i][i];
                }
            }
        }
        return maxValue;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])) {
                return false; 
            }
        }
        return true;
    }

}
