package ru.ifellow.JSchool.introdution;

public  class FirstSteps {

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
        return x<=xRight && x>=xLeft && y>=yTop && y<=yBottom;
    }

    public int sum(int[] array){
        int sum = 0 ;
        if (array.length == 0 ) return 0;
        else
        {
            for (int i = 0 ; i< array.length;i++)
                sum+=array[i];
        }
        return sum;
    }

    public int mul(int[] array){
        int d = 1;
        if (array.length == 0 ) return 0;
        else {
            for (int i = 0 ; i< array.length;i++)
                d*=array[i];
        }
        return d;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        if (array.length == 0 ) return min;
        else
        {
            for (int i = 0 ; i<array.length;i++)
            {
                if (array[i]<min) min = array[i];
            }
            return min;
        }
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        if (array.length == 0 ) return max;
        else
        {
            for (int i = 0 ; i<array.length;i++)
            {
                if (array[i]>max) max = array[i];
            }
            return max;
        }
    }

    public double average(int[] array){
        if (array.length==0) return 0;
        return (double) sum(array)/array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array.length == 0 ) return true;
        else
        {
            for (int i = 1; i< array.length;i++)
            {
                if (array[i]>array[i-1]) return false;
            }
            return true;
        }
    }

    public void cube(int[]array){
        for (int i = 0 ; i< array.length; i++)
            array[i] = array[i]*array[i]*array[i];
    }

    public boolean find(int[]array, int value){
        for (int i = 0 ; i< array.length;i++)
        {
            if (array[i]==value) return true;
        }
        return false;
    }

    public void reverse(int[]array){
        int mid = array.length / 2;
        for (int i = 0 ; i<mid ; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
    }

    public boolean isPalindrome(int[]array){
        if (array.length == 0 ) return  true;
        else {
            int mid = array.length / 2;
            for (int i = 0 ; i<mid ; i++)
            {
                if (array[i] != array[array.length - i - 1]) return false;

            }
            return true;
        }
    }

    public int sum(int[][] matrix){
        int sum = 0 ;
        for (int i = 0 ; i<matrix.length; i++)
        {
            for (int j = 0 ; j<matrix[i].length; j++)
                sum+=matrix[i][j];
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i<matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++)
            {
                if (matrix[i][j]>max ) max = matrix[i][j];
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;
        if (matrix.length==0) return max;
        else {
            for (int i = 0 ; i < matrix.length;i++)
            {
                for (int j=0;j<matrix[i].length;j++)
                {
                    if (i==j)
                    {
                        if (matrix[i][j]>max ) max = matrix[i][j];
                    }
                }
            }
            return max;
        }
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int i = 0 ; i<matrix.length;i++)
        {
            if (!isSortedDescendant(matrix[i]) ) return false;
        }
        return true;
    }
    
}
