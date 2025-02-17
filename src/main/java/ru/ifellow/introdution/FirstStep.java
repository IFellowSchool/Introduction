package ru.ifellow.introdution;

public class FirstStep {

    public void tryEmpty(int[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("array is empty");
        };
    }

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
        return x > xLeft && x < xRight && y > yBottom && y < yTop;
    }

    public int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length;) sum += array[i++];
        return sum;
    }

    public int mul(int[] array){
        tryEmpty(array);
        int prod = 1;
        for (int i = 0; i < array.length;) prod *= array[i++];
        return prod;
    }

    public int min(int[] array){
        tryEmpty(array);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    public int max(int[] array){
        tryEmpty(array);
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }

    public double average(int[] array){
        tryEmpty(array);
        return 1.0 * sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        for (int i = 1; i < array.length; i++){
            if (array[i-1] < array[i]) return false;
        }
        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) array[i] *= array[i]*array[i];
    }

    public boolean find(int[]array, int value){
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) return true;
        }
        return false;
    }

    public void reverse(int[]array){
        for (int i = 0; i<array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
    }

    public boolean isPalindrome(int[]array){
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length-1-i]) return false;
        }
        return true;
    }

    public int sum(int[][] matrix){
        int sum=0;
        for (int i = 0; i < matrix.length; i++) sum += sum(matrix[i]);
        return sum;
    }

    public int max(int[][] matrix){
        if (matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("matrix is empty");
        }

        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            int num = max(matrix[i]);
            if (max < num) max = num ;
        }

        return max;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("matrix is no quadratic");
        }
        int max=matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            if (max < matrix[i][i]) max = matrix[i][i];
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int i = 0; i < matrix.length; i++)
            if (!isSortedDescendant(matrix[i])) return false;
        return true;
    }

}
