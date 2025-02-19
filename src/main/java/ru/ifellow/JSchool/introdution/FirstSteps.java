package ru.ifellow.JSchool.introdution;


public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        long mulValue = (long) x * y;
        return validateLongToInt(mulValue);
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return (xLeft <= x && x <= xRight) && (yTop <= y && y <= yBottom);
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public int mul(int[] array) {
        int multi = 0;
        if (array.length != 0) {
            long temp = 1;
            for (int j : array) {
                temp *= j;
            }
            multi = validateLongToInt(temp);
        }
        return multi;
    }

    public int min(int[] array) {
        int minValue = Integer.MAX_VALUE;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
                }
            }
        }
        return minValue;
    }

    public int max(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
        }
        return maxValue;
    }

    public double average(int[] array) {
        double averageValue = 0.0;
        if (array.length != 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            averageValue = (double) sum / array.length;
        }
        return averageValue;
    }


    public boolean isSortedDescendant(int[] array) {
        boolean isSorted = true;
        if (array.length != 0) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                    isSorted = false;
                    break;
                }
            }
        }
        return isSorted;
    }

    public void cube(int[] array) {
        if (array.length != 0) {
            long temp;
            for (int i = 0; i < array.length; i++) {
                temp = (long) array[i] * array[i] * array[i];
                array[i] = validateLongToInt(temp);
            }
        }
    }

    public boolean find(int[] array, int value) {
        boolean isFind = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                isFind = true;
                break;
            }
        }
        return isFind;
    }

    public void reverse(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        boolean isPal = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                isPal = false;
                break;
            }
        }
        return isPal;
    }

    public int sum(int[][] matrix) {
        int sumMatrix = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumMatrix += matrix[i][j];
            }
        }
        return sumMatrix;
    }

    public int max(int[][] matrix) {
        int maxMatrix = Integer.MIN_VALUE;
        if (matrix.length != 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > maxMatrix)
                        maxMatrix = matrix[i][j];
                }
            }
        }
        return maxMatrix;
    }

    public int diagonalMax(int[][] matrix) {
        int diagonalMaxMatrix = Integer.MIN_VALUE;
        if (matrix.length != 0) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] > diagonalMaxMatrix)
                    diagonalMaxMatrix = matrix[i][i];
            }
        }
        return diagonalMaxMatrix;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        boolean isSortedDesc = true;
        for (int i = 0; i < matrix.length; i++) {
            isSortedDesc = isSortedDescendant(matrix[i]);
            if (!isSortedDesc) {
                break;
            }
        }
        return isSortedDesc;
    }

    public int validateLongToInt(long value) {
        int intValue;
        if (value > Integer.MAX_VALUE) {
            intValue = Integer.MAX_VALUE;
            System.out.println("Переполнение типа сверху");
        } else if (value < Integer.MIN_VALUE) {
            intValue = Integer.MIN_VALUE;
            System.out.println("Переполнение типа снизу");
        } else {
            intValue = (int) value;
        }
        return intValue;
    }

}
