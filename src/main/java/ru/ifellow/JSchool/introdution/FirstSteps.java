package ru.ifellow.JSchool.introdution;



public class FirstSteps {

    public int sum (int x, int y){
        return x+y;
    } //Возвращает сумму чисел x и y.

    public int mul (int x, int y){
        return x*y;
    } //Возвращает произведение чисел x и y.

    public int div (int x, int y){
        return x/y;
    } //Возвращает частное от деления чисел x и y. Гарантируется, что y != 0.

    public int mod (int x, int y){
        return x%y;
    } //Возвращает остаток от деления чисел x и y. Гарантируется, что y != 0.

    public boolean isEqual (int x, int y){
        return (x==y) ? true : false;
    } //Возвращает true, если x равен y, иначе false.

    public boolean isGreater (int x, int y){
        return (x>y) ? true : false;
    } //Возвращает true, если x больше y, иначе false.

//    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
//
//    }

    //Возвращает сумму чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0
    public int sum(int[] array){
        int sum =0;
        if (array == null){
            return 0;
        }
        else {
            if (array.length==0){
                return 0;
            }
            else {
                if (array.length==1){
                    return array[0];
                }
                else {
                    for (int i = 0; i < array.length; i++) {
                        sum = sum + array[i];
                    }
                }
            }
        }
        return sum;
    }

    //Возвращает произведение чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
    public int mul(int[] array){
        int mul =1;
        if (array == null){
            return 0;
        }
        else {
            if (array.length==0){
                return 0;
            }
            else {
                if (array.length==1){
                    return array[0];
                }
                else {
                    for (int i = 0; i < array.length; i++) {
                        mul = mul * array[i];
                    }
                }
            }
        }
        return mul;
    }

    //Возвращает минимальное из чисел, заданных одномерным массивом array.
    //Для пустого одномерного массива возвращает Integer.MAX_VALUE.
    public int min(int[] array){
        int min = 0;
        if (array == null){
            return Integer.MAX_VALUE;
        }
        else {
            if (array.length==0){
                return Integer.MAX_VALUE;
            }
            else {
                if (array.length==1){
                    return array[0];
                }
                else {
                    min = array[0];
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] < min) {
                            min = array[i];
                        }
                    }
                }
            }
        }
        return min;
    }

    //Возвращает максимальное из чисел, заданных одномерным массивом array.
    //Для пустого одномерного массива возвращает Integer.MIN_VALUE
    public int max(int[] array){
        int max = 0;
        if (array == null){
            return Integer.MIN_VALUE;
        }
        else {
            if (array.length==0){
                return Integer.MIN_VALUE;
            }
            else {
                if (array.length==1){
                    return array[0];
                }
                else {
                    max = array[0];
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] > max) {
                            max = array[i];
                        }
                    }
                }
            }
        }
        return max;

    }


    //Возвращает среднее значение для чисел, заданных одномерным массивом array.
    //Для пустого одномерного массива возвращает 0.
    public double average(int[] array){
        /* алгоритм
        размер массива = 1 или null возвр. 0
        нахождение суммы всех элементов
        если сумма = 0 -> конец
        возвр сумма / размер
         */

        double avg = 0;
        if (array == null){
            return 0;
        }
        else {
            if (array.length==0){
                return 0;
            }
            else {
                if (array.length==1){
                    return array[0];
                }
                else {
                    int s = 0;
                    for (int value : array) {
                        s += value;
                    }
                    if (s!=0){
                        avg = (double) s / array.length;
                    }
                }
            }
        }
        return avg;

    }

    //Возвращает true, если одномерный массив array строго упорядочен по убыванию, иначе false.
    //Пустой одномерный массив считается упорядоченным.
    public boolean isSortedDescendant(int[] array){
        boolean res = true;
        if (array == null){
            return true;
        }
        else {
            if (array.length==0){
                return true;
            }
            else {
                if (array.length==1){
                    return true;
                }
                else {
                    //int temp = array[0];

                    for (int i = 0; i < array.length-1; i++) {
                        int temp = array[i];
                        if (temp<=array[i+1]){
                            res = false;
                            break;
                        } //else temp = array[i];
                    }


                }
            }
        }
        return res;
    }

    //Возводит все элементы одномерного массива array в куб.
    public void cube(int[]array){
        if (array!=null){
            if (array.length>=1){
                for (int i = 0; i < array.length; i++) {
                    int temp = array[i];
                    int cube = temp*temp*temp;
                    array[i] = cube;
                }
            }
        }
    }

    //Возвращает true, если в одномерном массиве array имеется элемент, равный value, иначе false.
    public boolean find(int[]array, int value){
        if (array == null){
            return false;
        }
        if (array.length>=1){
            for (int el:array) {
                if (el==value){
                    return true;
                }
            }
        }
        return false;
    }

    //Переворачивает одномерный массив array, то есть меняет 
    //местами 0-й и последний, 1-й и предпоследний и т.д. элементы.
    public void reverse(int[]array){
        if (array!=null){
            if (array.length>=1){
                int quantity = array.length;
                int tempArr[] = new int[quantity];
                for (int i = 0; i < quantity; i++) {
                    tempArr[quantity-1-i] = array[i];
                }
                for (int k=0; k<quantity; k++) {
                    array[k] = tempArr[k];
                }
            }
        }
    }

    //Возвращает true, если одномерный массив является палиндромом, иначе false.
    //Пустой массив считается палиндромом.
    public boolean isPalindrome(int[]array){
        return false;
    }
/*
    public int sum(int[][] matrix){

    }

    public int max(int[][] matrix){

    }

    public int diagonalMax(int[][] matrix){

    }

    public boolean isSortedDescendant(int[][] matrix){

    }
*/
}
