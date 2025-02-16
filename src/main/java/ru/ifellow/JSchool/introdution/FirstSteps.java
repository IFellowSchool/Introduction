package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum (int x, int y){
        // сложение двух чисел
        return x + y;
    }

    public int mul (int x, int y){
        //Умножение двух чисел
        return x * y;
    }

    public int div (int x, int y){
        //деление двух чисел
        return x / y;
    }

    public int mod (int x, int y){
        // остаток от деления дву чисел
        return x % y;
    }

    public boolean isEqual (int x, int y){
        //сравнивание двух чисел
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGreater (int x, int y){
        // проверяем числа, больше первое второго или нет
        if (x > y) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        // Проверяем, лежит ли точка внутри прямоугольника или на его границе
       if (x >= xLeft && x <= xRight && y >= yTop && y <= yBottom) {
           return true;
       } else {
           return false;
       }
    }

    public int sum(int[] array){

        int summa = 0; // Инициализируем переменную для хранения суммы

        if (array.length == 0) { // Проверяем, пуст ли массив
            return 0; // Возвращаем 0 для пустого массива
        }

        for (int num : array) { // Проходим по каждому элементу массива
            summa += num; // Добавляем текущий элемент к сумме
        }
        return summa; // Возвращаем сумму
    }
    }

    public int mul(int[] array){

        if (array.length == 0) { // Проверяем, пуст ли массив
            return 0; // Возвращаем 0 для пустого массива
        }

        int proizv = 1; // Инициализируем переменную для хранения произведения
        for (int num : array) { // Проходим по каждому элементу массива
            proizv *= num; // Умножаем текущий элемент на произведение
        }
        return proizv; // Возвращаем произведение
    }
    }

    public int min(int[] array){

        if (array.length == 0) { // Проверяем, пуст ли массив
            return Integer.MAX_VALUE; // Возвращаем максимальное значение для пустого массива
        }
        int min = array[0]; // Инициализируем переменную для хранения минимального значения
        for (int num : array) { // Проходим по каждому элементу массива
            if (num < min) { // Если текущий элемент меньше min
                min = num; // Обновляем min
            }
        }
        return min; // Возвращаем минимальное значение
    }

    public int max(int[] array){

        if (array.length == 0) { // Проверяем, пуст ли массив
            return Integer.MIN_VALUE; // Возвращаем минимальное значение для пустого массива
        }

        int max = array[0]; // Инициализируем переменную для хранения максимального значения
        for (int num : array) { // Проходим по каждому элементу массива
            if (num > max) { // Если текущий элемент больше max
                max = num; // Обновляем max
            }
        }
        return max; // Возвращаем максимальное значение

    }

    public double average(int[] array){
        if (array.length == 0) { // Проверяем, пуст ли массив
            return 0; // Возвращаем 0 для пустого массива
        }

        int sum = 0; // Инициализируем переменную для хранения суммы
        for (int num : array) { // Проходим по каждому элементу массива
            sum += num; // Добавляем текущий элемент к сумме
        }
        return (double) sum / array.length; // Возвращаем среднее значение
    }

    public boolean isSortedDescendant(int[] array){
        if (array.length <= 1) { // Если массив пустой или содержит один элемент
            return true; // Считаем его упорядоченным
        }

        for (int i = 1; i < array.length; i++) { // Проходим по массиву, начиная со второго элемента
            if (array[i] >= array[i - 1]) { // Если текущий элемент не меньше предыдущего
                return false; // Массив не упорядочен строго по убыванию
            }
        }
        return true; // Если все элементы прошли проверку, массив упорядочен строго по убыванию
    }

    public void cube(int[]array){
        for (int a = 0; a < array.length; a++) { // Проходим по каждому элементу массива
            array[a] = array[a] * array[a] * array[a]; // Возводим элемент в куб
        }
    }

    public boolean find(int[]array, int value){
        for (int num : array) { // Проходим по каждому элементу массива
            if (num == value) { // Если элемент равен value
                return true; // Возвращаем true
            }
    }

    public void reverse(int[]array){
            int first = 0; // Индекс начала массива
            int last = array.length - 1; // Индекс конца массива

            while (first < last) { // Пока не дошли до середины
                // Меняем местами элементы
                int temp = array[first];
                array[first] = array[last];
                array[last] = temp;

                // Сдвигаем указатели
                first++;
                last--;
            }
    }

    public boolean isPalindrome(int[]array){
            int first = 0; // Индекс начала массива
            int last = array.length - 1; // Индекс конца массива

            while (first < last) { // Пока не дошли до середины
                if (array[first] != array[last]) { // Если элементы не равны
                    return false; // Массив не является палиндромом
                }
                first++; // Сдвигаем указатель вправо
                last--; // Сдвигаем указатель влево
            }
            return true; // Если все элементы совпали, массив является палиндромом

    }

    public int sum(int[][] matrix){
            int summa = 0; // Инициализируем переменную для хранения суммы

            // Проходим по каждой строке матрицы
            for (int[] row : matrix) {
                // Проходим по каждому элементу строки
                for (int num : row) {
                    summa += num; // Добавляем текущий элемент к сумме
                }
            }
            return summa; // Возвращаем сумму

    }

    public int max(int[][] matrix){
            if (matrix.length == 0) { // Проверяем, массив
                return Integer.MIN_VALUE; // Возвращаем минимальное значение для пустого массива
            }

            int maximum = matrix[0][0]; // Инициализируем переменную для хранения максимального значения

            // Проходим по каждой строке матрицы
            for (int[] row : matrix) {
                // Проходим по каждому элементу строки
                for (int num : row) {
                    if (num > maximum) { // Если текущий элемент больше max
                        maximum = num; // Обновляем max
                    }
                }
            }
            return maximum;
    }

    public int diagonalMax(int[][] matrix){
            if (matrix.length == 0) { // Проверяем, пуст ли массив
                return Integer.MIN_VALUE; // Возвращаем минимальное значение для пустого массива
            }

            int maximum = matrix[0][0]; // Инициализируем переменную для хранения максимального значения

            // Проходим по главной диагонали
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] > maximum) { // Если текущий элемент диагонали больше max
                    maximum = matrix[i][i]; // Обновляем max
                }
            }
            return maximum; // Возвращаем максимальное значение

    }

    public boolean isSortedDescendant(int[][] matrix){
            for (int[] row : matrix) { // Проходим по каждой строке массива
                if (!isSortedDescendant(row)) { // Проверяем, упорядочена ли строка по убыванию
                    return false; // Если хотя бы одна строка не упорядочена, возвращаем false
                }
            }
            return true; // Если все строки упорядочены, возвращаем true
        }

    }

}


//  При решении были использованы материалы из книги "Изучаем JAVA" и JAVARUSH
