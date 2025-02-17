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
        return (x >= xLeft && x <= xRight && y >= yTop && y <= yBottom);
    }

    public int sum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public int mul(int[] array){
        if (array.length == 0){
            return 0;
        }
        int mul = 1;
        for(int i = 0; i < array.length; i++){
            mul = mul * array[i];
        }
        return mul;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            min = array[i] < min ? array[i] : min;
        }
        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            max = array[i] > max ? array[i] : max;
        }
        return max;
    }

    public double average(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        double average = array.length > 0 ? sum / array.length : 0;
        return average;
    }

    public boolean isSortedDescendant(int[] array){
        boolean result = true;
        for(int i = 1; i < array.length; i++){
            if(array[i] > array[i-1]){
                result = false;
                break;
            }
        }
        return result;
    }

    public void cube(int[]array){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        boolean result = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                result = true;
                break;
            }
        }
        return result;
    }

    public void reverse(int[]array){
        int lastNumber = array.length - 1;
        for(int i = 0; i <= lastNumber/ 2; i++){
            int x = array[i];
            array[i] = array[lastNumber - i];
            array[lastNumber - i] = x;
        }
    }

    public boolean isPalindrome(int[]array){
        boolean result = true;
        for(int i = 0; i <= array.length / 2; i++){
            if(array[i] != array[array.length - 1 - i]){
                result = false;
                break;
            };
        }
        return result;
    }

    public int sum(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = matrix[i][j] > max ? matrix[i][j] : max;
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++){
            max = matrix[i][i] > max ? matrix[i][i] : max;
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        boolean result = true;
        for (int i = 0; i < matrix.length; i++){
            if(!isSortedDescendant(matrix[i])){
                result = false;
                break;
            }
        }
        return result;
    }

}
