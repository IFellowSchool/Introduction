package ru.ifellow.JSchool.introdution;

public class FirstSteps {
    public static void main(String[] args) {

    }
    public static int sum (int x, int y){

        return x + y;
    }

   public static int mul (int x, int y){

        return x * y;
    }

    public static int div (int x, int y){

        return x / y;
    }

    public static int mod (int x, int y){

        return x % y;
    }

    public static boolean isEqual (int x, int y){
        /*
        Это один способ выполнения

        if (x == y){
            return true;
        }else{
            return false;
        }
         */
        return x == y;
    }

    public static boolean isGreater (int x, int y){
        /*
        Это один способ выполнения

        if(x > y){
            return true;
        }else{
            return false;
        }
        */
        return x > y;
    }

    public static boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){

        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public static int sum(int[] array){

        int sumNumber = 0;

        if (array.length == 0) {
            return 0;
        }

        for(int num : array){
            sumNumber += num;
        }
        return sumNumber;
    }

     public static int mul(int[] array){

        if (array.length == 0) {
                return 0;
        }
        int mulNumber = 1;
        for (int num : array) {
            mulNumber *= num;
        }
        return mulNumber;
    }

    public static int min(int[] array){

        int minValue = array[0];

        if (array.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    public static int max(int[] array){

        int maxValue = array[0];

        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static double average(int[] array){

        int sumNumber = 0;

        if (array.length == 0) {
            return 0;
        }
        for(int num : array){
            sumNumber += num;
        }
        return (double) sumNumber / array.length;
    }

    public static boolean isSortedDescendant(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                    return false;
                }
        }
        return true;
    }

    public static void cube(int[]array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }
    public static boolean find(int[]array, int value){
               for (int num : array) {
                    if (num == value) {
                        return true;
                    }
               }
               return false;
    }

    public static void reverse(int[]array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

   public static boolean isPalindrome(int[]array){
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

   public static int sum(int[][] matrix){
        int sumNumber = 0;
        for (int[] line : matrix) {
            for (int num : line) {
                sumNumber += num;
            }
        }
        return sumNumber;
    }

    public static int max(int[][] matrix){
        int maxValue = Integer.MIN_VALUE;
        if (matrix.length == 0) {
            return Integer.MIN_VALUE;
        }
        for (int[] line : matrix) {
            for (int num : line) {
                if (num > maxValue) {
                maxValue = num;
                }
            }
        }
        return maxValue;
    }

     public static int diagonalMax(int[][] matrix){
         int max = Integer.MIN_VALUE;
         if (matrix.length == 0) {
             return Integer.MIN_VALUE;
         }
         for (int i = 0; i < matrix.length; i++) {
             max = Math.max(max, matrix[i][i]);
         }

         return max;
    }

    public static boolean isSortedDescendant(int[][] matrix){

        for (int[] line : matrix) {
            if (!isSortedDescendant(line)) {
                return false;
            }
        }
        return true;
    }

}
