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
        return x >= xLeft && x <= xRight && y <= yTop && y >= yBottom;
    }

    public int sum(int[] array) {
        int sum = 0;
        if (array != null) {
            for (int i : array) {
                sum = sum(sum, i);
            }
        }
        return sum;
    }

    public int mul(int[] array) {
        int mul = 0;
        if (array != null && array.length > 0) {
            mul = array[0];
            for (int i = 1; i < array.length; i++) {
                mul = mul(mul, array[i]);
            }
        }
        return mul;
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array != null) {
            for (int i : array) {
                if (isGreater(min, i)) {
                    min = i;
                }
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        if (array != null) {
            for (int i : array) {
                if (isGreater(i, max)) {
                    max = i;
                }
            }
        }
        return max;
    }

    public double average(int[] array) {
        double avg = 0;
        if (array != null && array.length > 0) {
            for (int i : array) {
                avg = sum((int) avg, i);
            }
            return avg / array.length;
        }
        return avg;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length - 1; i++) {
                if (isGreater(array[i+1], array[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public void cube(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = mul(mul(array[i], array[i]), array[i]);
            }
        }
    }

    public boolean find(int[] array, int value) {
        if (array != null) {
            for (int i : array) {
                if (isEqual(i, value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        if (array != null && array.length > 1) {
            for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array != null) {
            for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
                if (!isEqual(array[i], array[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public int sum(int[][] matrix) {
        int sum = 0;
        if (matrix != null) {
            for (int[] i : matrix) {
                sum += sum(i);
            }
        }
        return sum;
    }

    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if (matrix != null) {
            for (int[] i : matrix) {
                int tempMax = max(i);
                if(isGreater(tempMax, max)){
                    max = tempMax;
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if(matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                if (isGreater(matrix[i][i], max)) {
                    max = matrix[i][i];
                }
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if(matrix != null){
            int[] lastNotEmpty = null;
            for(int i = 0; i < matrix.length; i++){
                if(matrix[i].length > 0) {
                    if (i > 0 && lastNotEmpty != null) {
                        if (lastNotEmpty[lastNotEmpty.length - 1] < matrix[i][0] || !isSortedDescendant(matrix[i])) {
                            return false;
                        }
                    } else {
                        if (!isSortedDescendant(matrix[i])) {
                            return false;
                        }
                    }
                    lastNotEmpty = matrix[i];
                }
            }
        }
        return true;
    }

}
