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
        if (x >= xLeft && x <= xRight && y >= yTop && y <= yBottom) {
            return true;
        } else {
            return false;
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        if (array != null && array.length != 0) {
            for (int i : array) {
                sum += i;
            }
        }
        return sum;
    }

    public int mul(int[] array) {
        int mul = 0;
        if (array != null && array.length != 0) {
            mul = 1;
            for (int i : array) {
                mul *= i;
            }
        }
        return mul;
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array != null && array.length != 0) {
            for (int i : array) {
                if (i < min) {
                    min = i;
                }
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        if (array != null && array.length != 0) {
            for (int i : array) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }

    public double average(int[] array) {
        double average = 0;
        if (array != null && array.length != 0) {
            average = sum(array) / array.length;
        }
        return average;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array != null && array.length != 0) {
            if (array.length < 2) {
                return true;
            }
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void cube(int[]array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 3);
        }
    }

    public boolean find(int[]array, int value) {
        if (array != null && array.length != 0) {
            for (int i : array) {
                if (i == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public void reverse(int[]array) {
        if (array != null && array.length != 0) {
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
    }

    public boolean isPalindrome(int[]array) {
        if (array != null && array.length != 0) {
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
        if (matrix != null && matrix.length != 0) {
            for (int[] array : matrix) {
                sum = sum(array);
            }
        }
        return sum;
    }

    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if (matrix != null && matrix.length != 0) {
            for (int[] array : matrix) {
                int rowMax = max(array);
                if (rowMax > max) {
                    max = rowMax;
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if (matrix != null && matrix.length != 0) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] > max) {
                    max = matrix[i][i];
                }
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix != null && matrix.length != 0) {
            for (int[] array : matrix) {
                if (!isSortedDescendant(array)) {
                    return false;
                }
            }
        }
        return true;
    }

}
