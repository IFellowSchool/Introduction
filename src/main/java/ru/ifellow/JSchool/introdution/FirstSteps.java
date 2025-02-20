package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
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
        return (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom);
    }

    public int sum(int[] array) {
        int sum = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public int mul(int[] array) {
        int mul = 0;

        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    return 0;
                }
                if (mul == 0) {
                    mul = array[i];
                    continue;
                }
                mul = mul * array[i];
            }
        }
        return mul;
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;

        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;

        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        return max;
    }

    public double average(int[] array) {
        double average = 0;
        double sum = 0;

        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            average = sum / array.length;
        }
        return average;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array != null) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void cube(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) Math.pow(array[i], 3);
            }
        }
    }

    public boolean find(int[] array, int value) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        if (array != null) {
            int left = 0;
            int right = array.length - 1;

            while (left < right) {
                int x = array[left];
                array[left] = array[right];
                array[right] = x;

                left++;
                right--;
            }
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array != null) {
            int left = 0;
            int right = array.length - 1;

            while (left < right) {
                if (array[left] != array[right]) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public int sum(int[][] matrix) {
        int sum = 0;

        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }

    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] > max) {
                    max = matrix[i][i];
                }
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                if (!(isSortedDescendant(matrix[i]))) {
                    return false;
                }
            }
        }
        return true;
    }
}
