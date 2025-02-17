package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        throw new ArithmeticException("'y' не может быть равен 0");
    }

    public int mod(int x, int y) {
        if (y != 0) {
            return x % y;
        }
        throw new ArithmeticException("'y' не может быть равен 0");
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y <= yBottom && y >= yTop;
    }

    public int sum(int[] array) {
        int summa = 0;
        for (int el : array) {
            summa += el;

        }
        return summa;
    }

    public int mul(int[] array) {
        if (array != null && array.length > 0) {
            int productOfNumbers = 1;
            for (int num : array) {
                productOfNumbers *= num;
            }
            return productOfNumbers;
        }
        return 0;
    }

    public int min(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < minNumber) {
                minNumber = num;
            }
        }
        return minNumber;
    }

    public int max(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public double average(int[] array) {
        if (array != null && array.length > 0) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return (double) sum / array.length;
        }
        return 0;
    }

    public boolean isSortedDescendant(int[] array) {
        boolean isSorted = true;
        if (array != null && array.length > 0) {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] < array[i]) {
                    isSorted = false;
                    break;
                }
            }
        }
        return isSorted;
    }

    public void cube(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[] array, int value) {
        if (array == null) {
            return false;
        }

        for (int number : array) {
            if (number == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int right = array.length - 1;
        int left = 0;
        while (left < right) {
            int tmp = array[right];
            array[right] = array[left];
            array[left] = tmp;
            left++;
            right--;
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return true;
        }

        int right = array.length - 1;
        int left = 0;
        boolean isPalindrom = true;
        while (left < right) {
            if (array[left] != array[right]) {
                isPalindrom = false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrom;
    }

    public int sum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int max(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    public int diagonalMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > maxValue) {
                maxValue = matrix[i][i];
            }
        }
        return maxValue;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix == null) {
            return true;
        }

        for (int[] array : matrix) {
            if (!isSortedDescendant(array)) {
                return false;
            }
        }
        return true;
    }
}
