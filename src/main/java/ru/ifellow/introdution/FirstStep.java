package ru.ifellow.introdution;


public class FirstStep {

    /*Т.к. во многих методах не указаны ограничения на входящие данные и может возникнуть
     переполнение возвращаемого типа, но мне не известны требования валидатора проверяющего задание,
     считаю оптимальным вариантом кидать исключения при переполнении*/

    public int sum (int x, int y){
        if((x>0 && y>Integer.MAX_VALUE-x)||(x<0&&y<Integer.MIN_VALUE-x)){
            throw new IllegalArgumentException("Переполнение типа int при выполнении операции");
        }
        return x + y;
    }

    public int mul (int x, int y){
        if((x>0&&y>0&&x>Integer.MAX_VALUE/y)
                ||(x<0&&y<0&&x<Integer.MAX_VALUE/y)
                ||(x>0&&y<0&&y<Integer.MIN_VALUE/x)
                ||(x<0&&y>0&&x<Integer.MIN_VALUE/y)){
            throw new IllegalArgumentException("Переполнение типа int при выполнении операции");
        }
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
        return (x>=xLeft) && (x<=xRight) && (y>=yTop) && (y<=yBottom);
    }

    public int sum(int[] array){
        if(array==null||array.length==0){return 0;}
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum(sum,array[i]);
        }
        return sum;
    }

    public int mul(int[] array){
        if(array==null||array.length==0){return 0;}
        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            sum = mul(array[i],sum);
        }
        return sum;

    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        if(array==null||array.length==0){return min;}
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        if(array==null||array.length==0){return max;}
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array){
        double sum = 0;
        double avg = 0;
        if(array==null||array.length==0){return avg;}
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum/array.length;
        return avg;
    }

    public boolean isSortedDescendant(int[] array){
        if(array==null){return false;}
        if(array.length==0){return true;}
        int prev = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>prev){return false;}
            prev = array[i];
        }
        return true;
    }

    public void cube(int[]array){
        if(array!=null&&array.length>0){
            for (int i = 0; i < array.length; i++) {
                double temp = Math.pow(array[i],3);
                if(temp>Integer.MAX_VALUE){
                    throw new IllegalArgumentException("Переполнение типа int при выполнении операции");
                }
                array[i] = (int)Math.pow(array[i],3);
            }
        }
    }

    public boolean find(int[]array, int value){
        if(array==null||array.length==0){return false;}
        for(int i=0;i<array.length;i++){
            if(array[i]==value){return true;}
        }
        return false;
//        если бы массив был отсортирован, то гораздо эффективнее был бы бинарный поиск.
    }

    public void reverse(int[]array){
        if(array==null||array.length==0){return;}
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }

    }

    public boolean isPalindrome(int[]array){
        if(array==null){return false;}
        if(array.length==0){return true;}
        for (int i = 0; i < array.length/2; i++) {
            if(array[i]!=array[array.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        if(matrix==null||matrix.length==0){return 0;}
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=sum(matrix[i]);
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        if(matrix==null||matrix.length==0){return max;}
        for (int i = 0; i<matrix.length; i++) {
            int m = max(matrix[i]);
            if(m>max){max=m;}
        }
        return max;

    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;
        if(matrix==null||matrix.length==0){return max;}
        for (int i = 0; i<matrix.length; i++) {
            int m = matrix[i][i];
            if(m>max){max=m;}
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        boolean result = false;
        if(matrix==null){return false;}
        if(matrix.length==0){return true;}
        for (int i = 0; i < matrix.length; i++) {
            result=isSortedDescendant(matrix[i]);
            if(!result){return false;}
        }
        return result;
    }

}
