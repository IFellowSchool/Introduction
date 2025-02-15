package ru.ifellow.introdution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class FirstStep {

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
        return (x >= xLeft && x <= xRight) && (y >= yTop && y<= yBottom); //скобочки для читабельности
    }

    public int sum(int[] array){
        return IntStream.of(array).sum();
    }

    public int mul(int[] array){
        return array.length == 0 ? 0 : IntStream.of(array).reduce(1, (a, b) -> a * b);
    }

    public int min(int[] array){
        return IntStream.of(array).min().orElse(Integer.MAX_VALUE);
    }

    public int max(int[] array){
        return IntStream.of(array).max().orElse(Integer.MIN_VALUE);
    }

    public double average(int[] array){
        return IntStream.of(array).average().orElse(0);
    }

    public boolean isSortedDescendant(int[] array){
        return Arrays.equals(array,
                IntStream.of(array).boxed().sorted(Comparator.reverseOrder())
                        .mapToInt(Integer ::intValue)
                        .toArray());//podumatb
    }

    public void cube(int[]array){
        IntStream.range(0, array.length)
                .forEach(i -> array[i] = array[i] * array[i] * array[i]);
    }

    public boolean find(int[]array, int value){
        return IntStream.of(array).anyMatch(it -> it == value);
    }

    public void reverse(int[]array){
        IntStream.range(0, array.length / 2)
                .forEach(index -> {
                    int temp = array[index];
                    array[index] = array[array.length - index - 1];
                    array[array.length - index - 1] = temp;
                });
    }

    public boolean isPalindrome(int[]array){
        return IntStream.range(0, array.length /2 )
                .allMatch(index -> array[index] == array[array.length - index - 1]);
    }

    public int sum(int[][] matrix){
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }

    public int max(int[][] matrix){
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .max().orElse(Integer.MIN_VALUE);
    }

    public int diagonalMax(int[][] matrix){
        return IntStream.range(0, matrix[0].length)
                .map(index -> matrix[index][index])
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public boolean isSortedDescendant(int[][] matrix){
        return Arrays.stream(matrix)
                .allMatch(array -> isSortedDescendant(array));
    }

}
