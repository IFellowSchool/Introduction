package ru.ifellow.introdution;

public class Main {
    public static void main(String[] args) {
        FirstStep fs = new FirstStep();
        System.out.println(fs.sum(4, 6));
        System.out.println(fs.mul(3, 9));
        System.out.println(fs.div(9, 3));
        System.out.println(fs.mod(5, 3));
        System.out.println(fs.isEqual(4, 2));
        System.out.println(fs.isGreater(4, 5));
        System.out.println(fs.isInsideRect(2, -6, 6, -2, 4, -5));
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(fs.sum(arr));
        System.out.println(fs.mul(arr));
        System.out.println(fs.min(arr));
        System.out.println(fs.max(arr));
        System.out.println(fs.average(arr));
        System.out.println(fs.isSortedDescendant(arr));
        fs.cube(arr);
        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(fs.find(arr2, 4));
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        fs.reverse(arr3);
        int[] arr4 = {1, 2, 6, 2, 1};
        System.out.println(fs.isPalindrome(arr4));
        int[][] arr5 = {{1101, 500, 12, 30}, {4, 600, 6, 39}, {10667, 8, 700, 50}, {100, 134, 111, 1100}};
        System.out.println(fs.sum(arr5));
        System.out.println(fs.max(arr5));
        System.out.println(fs.diagonalMax(arr5));
        int[][] arr6 = {{9, 8, 7}, {6, 5, 4, 3}, {2, 1, 0}};
        System.out.println(fs.isSortedDescendant(arr6));


    }
}
