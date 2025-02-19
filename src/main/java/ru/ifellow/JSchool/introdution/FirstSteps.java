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
        return (x >= xLeft && y >= yTop) && (x <= xRight && y <= yBottom);
    }

    public int sum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;

    }

    public int mul(int[] array){
        int mul = 1;
        for(int i : array){
            mul *= i;
        }
        return mul;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i : array){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i : array){
            if(i > max){
                max = i;
            }
        }
        return max;

    }

    public double average(int[] array){
        if (array.length == 0){
            return 0;
        }
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return (double)sum / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array.length == 0) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public void cube(int[]array){

        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value) {
                return true;
            }
        }
        return false;

    }

    public void reverse(int[]array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

    }

    public boolean isPalindrome(int[]array){
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
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
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;

    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;

    }

    public int diagonalMax(int[][] matrix){

        if (matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }

        if (matrix.length != matrix[0].length) {
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
        for(int i = 0; i < matrix.length; i++){
            if(!isSortedDescendant(matrix[i])){
                return false;
            }
        }
        return true;
    }

}
