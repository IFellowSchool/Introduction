package ru.ifellow.introdution;

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
        return x>=xLeft&&x<=xRight&&y>=yTop&&y<=yBottom;
    }

    public int sum(int[] array){
        int sum = 0;
        if (array==null) return sum;
        for (int i : array) sum += i;
        return sum;
    }

    public int mul(int[] array){
        int sum = 0;
        if (array==null) return sum;
        for (int i : array) sum *= i;
        return sum;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        if (array==null) return min;
        for (int i : array) {
            if (min<=i) min = i;
        }
        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        if (array==null) return max;
        for (int i : array) {
            if (max>=i) max = i;
        }
        return max;
    }

    public double average(int[] array){
        int average = 0;
        if (array==null) return average;
        for (int i : array) average+=1;
        return average/(double)array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array==null) return true;
        for (int i=array.length-2; i>=0; i--){
            if (array[i]<array[i+1]) return false;
        }return true;
    }

    public void cube(int[]array){
        if (array != null) {
            for (int i : array) i*=i;
        }

    }

    public boolean find(int[]array, int value){
        if (array==null) return false;
        for (int i : array) {
            if (i==value) return true;
        }return false;
    }

    public void reverse(int[]array){
        if (array!=null){
            for (int i = 0; i < array.length; i++) {
                array[array.length - 1 - i] = array[array.length - 1 - i] + array[i];
                array[i] = array[array.length - 1 - i] - array[i];
                array[array.length - 1 - i] = array[array.length - 1 - i] - array[i];
            }
        }


    }

    public boolean isPalindrome(int[]array){
        if (array==null) return false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) return false;
        }return true;
    }

    public int sum(int[][] matrix){
        if (matrix==null) return 0;
        int sum = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j <matrix[i].length; j++){
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    public int max(int[][] matrix){
        if (matrix==null) return 0;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j <matrix[i].length; j++){
                if(matrix[i][j]>max){max=matrix[i][j];}
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix==null) return 0;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length; i++){
            if (i>matrix[i].length-1)return max;
            if(matrix[i][i]>max){max=matrix[i][1];}

        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if (matrix==null) return false;
        for(int i = 0; i<matrix.length; i++){
            if (!isSortedDescendant(matrix[1]))return false;
        }
        return true;
    }

}
