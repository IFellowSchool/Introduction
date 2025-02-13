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
        return x>xLeft && x<xRight && y>yBottom && y<yTop;
    }

    public int sum(int[] array){
        int Sum=0;
        for (int i=0; i<array.length;) Sum+=array[i++];
        return Sum;
    }

    public int mul(int[] array){
        int prod=1;
        for (int i=0; i<array.length;) prod*=array[i++];
        return prod;
    }

    public int min(int[] array){
        int Min=array[0];
        for (int i=0; i<array.length;i++) {
            if (Min > array[i]) Min = array[i];
        }
        return Min;
    }

    public int max(int[] array){
        int Max=array[0];
        for (int i=0; i<array.length; i++) {
            if (Max < array[i]) Max = array[i];
        }
        return Max;
    }

    public double average(int[] array){
        return 1.0*sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array){
    // перевел для себя, что проверяем упорядоченность по убыванию
        for (int i=1; i<array.length; i++){
            if (array[i-1]<array[i])return false;
        }
        return true;
    }

    public void cube(int[]array){
        for (int i=0; i<array.length; i++) array[i] *= array[i]*array[i];
    }

    public boolean find(int[]array, int value){
        for (int i=0; i<array.length; i++) {
            if (value == array[i]) return true;
        }
        return false;
    }

    public void reverse(int[]array){
        for (int i=0, k=array.length-1; i<k; i++, k--) {
            int tmp=array[i];
            array[i]=array[k];
            array[k]=tmp;
        }
    }

    public boolean isPalindrome(int[]array){
        for (int i=0, k=array.length-1; i<k; i++, k--) {
            if (array[i] != array[k]) return false;
        }
        return true;
    }

    public int sum(int[][] matrix){
        int Sum=0;
        for (int i=0; i<matrix.length; i++)
            for (int j=0; j<matrix[i].length; j++)
                Sum+=matrix[i][j];
        return Sum;
    }

    public int max(int[][] matrix){
        int Max=matrix[0][0];
        for (int i=0; i<matrix.length; i++)
            for (int j=0; j<matrix[i].length; j++) {
                if (Max < matrix[i][j]) Max = matrix[i][j];
            }
        return Max;
    }

    public int diagonalMax(int[][] matrix){
        int Max=matrix[0][0];
        for (int i=0; i<matrix.length; i++){
            if (Max < matrix[i][i]) Max = matrix[i][i];
        }
        return Max;
    }

    public boolean isSortedDescendant(int[][] matrix){
    // так понял, что проверяем упорядоченность каждой строки. Или не так понял?
        for (int i=0; i<matrix.length; i++)
            for (int j=1; j<matrix[i].length; j++){
                if (matrix[i][j-1]<matrix[i][j]) return false;
        }
        return true;
    }

/* for debug
    public static void main(String[] args){
        int x=15, y=6;
        int[] a={1,2,3,4,5};
        int[][] m ={
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };
        //System.out.println(isInsideRect(0,20,30,0, x, y));
        //cube(a); System.out.println(a[2]);
        //System.out.println(isSortedDescendant(m));
        //System.out.println(diagonalMax(m));
    }
*/
}
