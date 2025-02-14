package ru.ifellow.introdution;

public class FirstStep {

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
        for(int i : array) {
            sum += i;
        }

        return sum;
    }

    public int mul(int[] array){
        if(array.length == 0) {
            return 0;
        }

        int mul = 1;
        for(int i : array) {
            mul *= i;
        }

        return mul;
    }

    public int min(int[] array){
        int minVal = Integer.MAX_VALUE;
        for(int i : array) {
            minVal = Math.min(minVal, i);
        }

        return minVal;
    }

    public int max(int[] array){
        int maxVal = Integer.MIN_VALUE;
        for(int i : array) {
            maxVal = Math.max(maxVal, i);
        }

        return maxVal;
    }

    public double average(int[] array){
        if(array.length == 0) {
            return 0;
        }

        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if(array.length <= 1)
            return true;

        for(int i = 1; i < array.length; i++) {
            if(array[i-1] <= array[i]) {
                return false;
            }
        }

        return true;
    }

    public void cube(int[]array){
        for(int i = 0; i < array.length; i++) {
            int a = array[i];
            array[i] = a * a * a;
        }
    }

    public boolean find(int[]array, int value){
        for(int i : array) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }

    public void reverse(int[]array){
        int len = array.length;
        for(int i = 0; i < len / 2; i++) {
            int c = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = c;
        }
    }

    public boolean isPalindrome(int[]array){
        int left = 0, right = array.length - 1;
        while(left < right) {
            if(array[left++] != array[right--]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        int sum = 0;
        for(int[] i : matrix) {
            sum += sum(i);
        }

        return sum;
    }

    public int max(int[][] matrix){
        int maxValue = Integer.MIN_VALUE;
        for(int[] i : matrix) {
            maxValue = max(i);
        }

        return maxValue;
    }

    public int diagonalMax(int[][] matrix){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++) {
            maxValue = Math.max(maxValue, matrix[i][i]);
        }

        return maxValue;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for(int i[] : matrix) {
            if(!isSortedDescendant(i)) {
                return false;
            }
        }
        return true;
    }

}
