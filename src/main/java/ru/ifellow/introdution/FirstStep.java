package ru.ifellow.introdution;

import java.util.Arrays;

public class FirstStep {

    public int sum(int x, int y) {
        //public int sum (int x, int y)Возвращает сумму чисел x и y.
        return x + y;
    }

    public int mul(int x, int y) {
        //public int mul (int x, int y)Возвращает произведение чисел x и y.
        return x * y;
    }

    public int div(int x, int y) {
        //public int div (int x, int y) Возвращает частное от деления чисел x и y. Гарантируется, что y != 0.
        int b = 0;
        if (y != 0) {
            b = x / y;
        }
        return b;
    }

    public int mod(int x, int y) {
        // public int mod (int x, int y) Возвращает остаток от деления чисел x и y. Гарантируется, что y != 0.
        int b = 0;
        if (y != 0) {
            b = x % y;
        }
        return b;
    }

    public boolean isEqual(int x, int y) {
        //public boolean isEqual (int x, int y) Возвращает true, если x равен y, иначе false.
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        //public boolean isGreater (int x, int y) Возвращает true, если x больше y, иначе false.
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        //public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y)
        // Прямоугольник с горизонтальными и вертикальными сторонами, задан двумя точками - левой верхней (xLeft, yTop)
        // и правой нижней (xRight, yBottom). На плоскости OXY ось X направлена вправо, ось Y - вниз.
        // Дана еще одна точка с координатами (x, y). Гарантируется, что xLeft < xRight и yTop < yBottom.
        // Метод должен возвращать true, если точка лежит внутри прямоугольника , иначе false.
        // Если точка лежит на границе прямоугольника, то считается, что она лежит внутри него.
        if ((x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom)) {
            return true;
        } else {
            return false;
        }
    }

    public int sum(int[] array) {
        //   public int sum(int[] array) Возвращает сумму чисел, заданных одномерным массивом array.
        //   Для пустого одномерного массива возвращает 0.
        if (array.length > 0) {
            return Arrays.stream(array).sum();
        }
        return 0;
    }

    public int mul(int[] array) {
        //public int mul(int[] array) Возвращает произведение чисел, заданных одномерным массивом array.
        // Для пустого одномерного массива возвращает 0.
        if (array.length > 0) {
            int b = 1;
            for (int e : array) {
                b = b * e;
            }
            return b;
        }
        return 0;
    }

    public static int min(int[] array) {
        // 10 public int min(int[] array) Возвращает минимальное из чисел, заданных одномерным массивом array.
        // Для пустого одномерного массива возвращает Integer.MAX_VALUE.
        if (array.length > 0) {
            int min = Integer.MAX_VALUE;
            for (int e : array) {
                if (min > e) {
                    min = e;
                }
            }
            return min;
        }
        return Integer.MAX_VALUE;
    }

    public int max(int[] array) {
        // 11 public int max(int[] array) Возвращает максимальное из чисел, заданных одномерным массивом array.
        // Для пустого одномерного массива возвращает Integer.MIN_VALUE.
        if (array.length > 0) {
            int max = Integer.MIN_VALUE;
            for (int e : array) {
                if (max < e) {
                    max = e;
                }
            }
            return max;
        }
        return Integer.MIN_VALUE;
    }

    public double average(int[] array) {
        // 12 public double average(int[] array) Возвращает среднее значение для чисел, заданных одномерным массивом array.
        // Для пустого одномерного массива возвращает 0.
        if (array.length > 0) {
            return (double) Arrays.stream(array).sum() / array.length;
        }
        return 0;
    }

    public boolean isSortedDescendant(int[] array) {
        // 13 public boolean isSortedDescendant(int[] array) Возвращает true,
        // если одномерный массив array строго упорядочен по убыванию, иначе false.
        // Пустой одномерный массив считается упорядоченным.
        if (array.length > 0) {
            int count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    count++;
                }
            }
            return count <= 0;
        }
        return true;
    }

    public void cube(int[] array) {
        //14 public void cube(int[]array) Возводит все элементы одномерного массива array в куб.
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[] array, int value) {
        //15 public boolean find(int[]array, int value)
        // Возвращает true, если в одномерном массиве array имеется элемент, равный value, иначе false.
        boolean flag = false;
        for (int e : array) {
            if (e == value) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void reverse(int[] array) {
        //16 public void reverse(int[]array)
        // Переворачивает одномерный массив array, то есть меняет местами 0-й и последний,
        // 1-й и предпоследний и т.д. элементы.
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        //17 public boolean isPalindrome(int[]array)
        // Возвращает true, если одномерный массив является палиндромом, иначе false.
        // Пустой массив считается палиндромом.
        if (array.length > 0) {
            int count = 0;
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - 1 - i]) {
                    count++;
                    break;
                }
            }
            return count <= 0;
        }
        return true;
    }

    public int sum(int[][] matrix) {
        //18 public int sum(int[][] matrix) Возвращает сумму чисел, заданных двумерным массивом matrix.
        int resultFull = 0;
        for (int i = 0; i < matrix.length; i++) {
            int result = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                result = result + matrix[i][j];
            }
            resultFull = resultFull + result;
        }
        return resultFull;
    }

    public int max(int[][] matrix) {
        //19 public int max(int[][] matrix)
        // Возвращает максимальное из чисел, заданных двумерным массивом matrix.
        // Для пустого двумерного массива возвращает Integer.MIN_VALUE.
        if (matrix.length > 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (max < matrix[i][j]) {
                        max = matrix[i][j];
                    }
                }
            }
            return max;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int diagonalMax(int[][] matrix) {
        //20 public int diagonalMax(int[][] matrix)
        // Возвращает максимальное из чисел, находящихся на главной диагонали квадратного двумерного массива matrix.
        // Для пустого двумерного массива возвращает Integer.MIN_VALUE.
        if (matrix.length > 0) {
            int n = matrix.length;
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (matrix[i].length != 0 && max1 < matrix[i][i]) {
                    max1 = matrix[i][i];
                }
                if (matrix[i].length != 0 && max2 < matrix[i][matrix[i].length - 1 - i]) {
                    max2 = matrix[i][matrix[i].length - 1 - i];
                }
            }
            if (max1 < max2) {
                return max2;
            } else {
                return max1;
            }
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public boolean isSortedDescendant(int[][] matrix) {
        //21 public boolean isSortedDescendant(int[][] matrix)
        // Возвращает true, если все строки двумерного массива matrix строго упорядочены по убыванию, иначе false.
        // Пустая строка считается упорядоченной. Разные строки массива matrix могут иметь разное количество элементов.
        // При написании метода рекомендуется внутри него вызвать метод из п. 13.
        for (int[] e : matrix) {
            if (!isSortedDescendant(e)) {
                return false;
            }
        }
        return true;
    }

}
