package ru.ifellow.JSchool.introdution;


public class FirstSteps {

    /**
     * Возвращает сумму чисел x и y.
     */
    public int sum(int x, int y) {
        return x + y;
    }

    /**
     * Возвращает произведение чисел x и y.
     */
    public int mul(int x, int y) {
        return x * y;
    }

    /**
     * Возвращает частное от деления чисел x и y. Гарантируется, что y != 0.
     */
    public int div(int x, int y) {
        return x / y;
    }

    /**
     * Возвращает остаток от деления чисел x и y. Гарантируется, что y != 0.
     */
    public int mod(int x, int y) {
        return x % y;
    }

    /**
     * Возвращает true, если x равен y, иначе false.
     */
    public boolean isEqual(int x, int y) {
        return x == y;
    }

    /**
     * Возвращает true, если x больше y, иначе false.
     */
    public boolean isGreater(int x, int y) {
        return x > y;
    }

    /**
     * Прямоугольник с горизонтальными и вертикальными сторонами, задан двумя точками - левой верхней (xLeft, yTop) и правой нижней (xRight, yBottom). На плоскости OXY ось X направлена вправо, ось Y - вниз. Дана еще одна точка с координатами (x, y). Гарантируется, что xLeft < xRight и yTop < yBottom. Метод должен возвращать true, если точка лежит внутри прямоугольника , иначе false.
     * Если точка лежит на границе прямоугольника, то считается, что она лежит внутри него.
     */
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    /**
     * Возвращает сумму чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
     */
    public int sum(int[] array) {
        if (array == null || array.length == 0) return 0;
        int result = 0;
        for (int number : array)
            result += number;
        return result;
    }

    /**
     * Возвращает произведение чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
     */
    public int mul(int[] array) {
        if (array==null || array.length == 0) return 0;
        int result = 1;
        for (int number : array)
            result *= number;
        return result;
    }

    /**
     * Возвращает минимальное из чисел, заданных одномерным массивом array.
     * Для пустого одномерного массива возвращает Integer.MAX_VALUE.
     */
    public int min(int[] array) {
        int result = Integer.MAX_VALUE;
        for (int number : array)
            result = Math.min(number, result);
        return result;
    }

    /**
     * Возвращает максимальное из чисел, заданных одномерным массивом array.
     * Для пустого одномерного массива возвращает Integer.MIN_VALUE.
     */
    public int max(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int number : array)
            result = Math.max(number, result);
        return result;
    }

    /**
     * Возвращает среднее значение для чисел, заданных одномерным массивом array.
     * Для пустого одномерного массива возвращает 0.
     */
    public double average(int[] array) {
        if (array == null || array.length == 0) return 0;
        int sum = sum(array);
        int count = array.length;
        return (double) sum / count;
    }

    /**
     * Возвращает true, если одномерный массив array строго упорядочен по убыванию, иначе false.
     * Пустой одномерный массив считается упорядоченным.
     */
    public boolean isSortedDescendant(int[] array) {
        if (array == null || array.length == 0) return true;
        for(int i=0;i<array.length-1;i++){
            if(array[i] <= array[i+1]) return false;
        }
        return true;
    }

    /**
     * Возводит все элементы одномерного массива array в куб.
     */
    public void cube(int[] array) {
        if (array == null) return;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    /**
     * Возвращает true, если в одномерном массиве array имеется элемент, равный value, иначе false.
     */
    public boolean find(int[] array, int value) {
        for (int number : array)
            if (number == value) return true;

        return false;
    }

    /**
     * Переворачивает одномерный массив array, то есть меняет местами 0-й и последний, 1-й и предпоследний и т.д. элементы.
     */
    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    /**
     * Возвращает true, если одномерный массив является палиндромом, иначе false.
     * Пустой массив считается палиндромом.
     */
    public boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++)
            if (array[i] != array[array.length - i - 1])
                return false;

        return true;
    }

    /**
     * Возвращает сумму чисел, заданных двумерным массивом matrix.
     */
    public int sum(int[][] matrix) {
        if (matrix == null) return 0;
        int result = 0;
        for (int[] array : matrix)
            result += sum(array);
        return result;
    }

    /**
     * Возвращает максимальное из чисел, заданных двумерным массивом matrix.
     * Для пустого двумерного массива возвращает Integer.MIN_VALUE.
     */
    public int max(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        for (int[] array : matrix) {
            int arrayMax = max(array);
            result = Math.max(result, arrayMax);
        }
        return result;
    }

    /**
     * Возвращает максимальное из чисел, находящихся на главной диагонали квадратного двумерного массива matrix.
     * Для пустого двумерного массива возвращает Integer.MIN_VALUE.
     */
    public int diagonalMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            result = Math.max(matrix[i][i], result);
        }
        return result;
    }

    /**
     * Возвращает true, если все строки двумерного массива matrix строго упорядочены по убыванию, иначе false. Пустая строка считается упорядоченной. Разные строки массива matrix могут иметь разное количество элементов.
     * При написании метода рекомендуется внутри него вызвать метод из п. 13.
     */
    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix == null) return true;
        for(int[] array : matrix){
            boolean arrayIsNotSorted = !isSortedDescendant(array);
            if(arrayIsNotSorted) return false;
        }
        return true;
    }

}

