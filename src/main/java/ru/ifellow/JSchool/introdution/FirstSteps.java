package ru.ifellow.JSchool.introdution;

public class FirstSteps {

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
        boolean isInside = true;
        if(x<xLeft || x>xRight || y<yTop || y>yBottom){
            return false;
        }
        return isInside;
    }

    public int sum(int[] array){
        int sum = 0;
        for (int num : array)  {
            sum += num;
        }
        return sum;
    }

    public int mul(int[] array){
        int mul = 1;
        for(int num : array)  {
            mul *= num;
        }
        return mul;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        for(int num : array)  {
            if(num < min) min = num;
        }
        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        for(int num : array)  {
            if(num > max) max = num;
        }
        return max;
    }

    public double average(int[] array){
        if(array.length == 0) return 0.0;

        int sum = 0;
        for (int num : array)  {
            sum += num;
        }
        return (double)sum/array.length;
    }

    public boolean isSortedDescendant(int[] array){
        boolean isSorted = true;
        if(array.length == 0) return isSorted;

        for(int i = 1; i < array.length; i++){
            if (array[i] > array[i - 1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public void cube(int[]array){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        boolean isFound = false;
        for(int num : array) {
            if(num == value) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public void reverse(int[]array){
        for(int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    public boolean isPalindrome(int[]array){
        boolean isPalindrome = true;
        for(int i = 0, j = array.length - 1; i < j; i++, j--) {
            if(array[i] != array[j]) return false;
        }
        return isPalindrome;
    }

    public int sum(int[][] matrix){
        int sum = 0;
        for(int[] array : matrix) {
            for(int num : array) {
                sum += num;
            }
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for(int[] array : matrix) {
            for(int num : array) {
                if(num > max) max = num;
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++) {
            if(max < matrix[i][i]) max = matrix[i][i];
            }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        boolean isSorted = true;
        for(int[] row : matrix) {
            if(!isSortedDescendant(row)) {
                return false;
            }
        }
        return isSorted;
    }

}
