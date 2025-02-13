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
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array){
        int sumRes = 0;

        for (int num : array) {
            sumRes += num;
        }
        return sumRes;
    }

    public int mul(int[] array){
        if (array.length == 0) return 0;

        int mulRes = 1;
        for (int num : array) {
            mulRes *= num;
        }
        return mulRes;
    }

    public int min(int[] array){
        int minRes = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < minRes) minRes = num;
        }
        return minRes;
    }

    public int max(int[] array){
        int maxRes = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > maxRes) maxRes = num;
        }
        return maxRes;
    }

    public double average(int[] array){
        if (array.length == 0) return 0;

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) return false;
        }
        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        for (int i : array) {
            if (i == value) return true;
        }
        return false;
    }

    public void reverse(int[]array){
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public boolean isPalindrome(int[]array){
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) return false;
        }
        return true;
    }

    public int sum(int[][] matrix){
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }

    public int max(int[][] matrix){
        int maxRes = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            int maxInCurrentArray = max(matrix[i]);
            maxRes = maxInCurrentArray > maxRes ? maxInCurrentArray : maxRes;
        }
        return maxRes;
    }

    public int diagonalMax(int[][] matrix){
        int maxRes = Integer.MIN_VALUE;

        for (int index = 0; index < matrix.length; index++) {
            maxRes = matrix[index][index] > maxRes ? matrix[index][index] : maxRes;
        }
        return maxRes;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) return false;
        }
        return true;
    }

}
