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
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array){
        if (array == null) {
            //все равно упадет, но так чуть быстрее
            throw new NullPointerException("В метод передано значение null");
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public int mul(int[] array){
        if (array == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        if (array.length == 0) {
            return 0;
        }
        int mul = 1;
        for (int element : array) {
            mul *= element;
        }
        return mul;
    }

    public int min(int[] array){
        if (array == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public int max(int[] array){
        if (array == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public double average(int[] array){
        if (array == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        if (array.length == 0) {
            return 0;
        }
        return 1.0 * sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        if (array.length < 2) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        if (array == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        for (int i = 0; i < array.length; i++) {
            //дальше этого диапазона пойдет на второй круг
            if (array[i] < 1291 && array[i] > -1291) {
                array[i] = array[i] * array[i] * array[i];
            } else {
                throw new ArithmeticException("Для числа " + array[i] + " точность возведения в куб будет некорректной. Рекомендуется использовать другой метод.");
            }
        }
    }

    public boolean find(int[]array, int value){
        if (array == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        if (array == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        if (array.length > 1) {
            int tempValue;
            int length = array.length;
            for (int i = 0; i < length / 2; i++) {
                tempValue = array[i];
                array[i] = array[length - 1 - i];
                array[length - 1 - i] = tempValue;
            }
        }
    }

    public boolean isPalindrome(int[]array){
        if (array == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        if (array.length == 0) {
            return true;
        }
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        if (matrix == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        int sum = 0;
        for (int[] row : matrix) {
            sum += sum(row);
        }
        return sum;
    }

    public int max(int[][] matrix){
        if (matrix == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            max = max(row);
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix == null) {
            throw new NullPointerException("В метод передано значение null");
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
        if (matrix == null) {
            throw new NullPointerException("В метод передано значение null");
        }
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) {
                return false;
            }
        }
        return true;
    }

}
