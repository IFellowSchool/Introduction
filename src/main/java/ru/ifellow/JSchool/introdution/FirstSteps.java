package ru.ifellow.JSchool.introdution;

public class FirstSteps {

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

    	return (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom);
    }

    public int sum(int[] array){

    	if (array.length == 0) return 0;
    	
    	int sum = 0;
    	
    	for (int i = 0; i < array.length; ++i) {
    		
    		sum += array[i];
    	}
    	
    	return sum;
    }

    public int mul(int[] array){

    	if (array.length == 0) return 0;
    	
    	int prod = 1;
    	
    	for (int i = 0; i < array.length; ++i) {
    		
    		prod *= array[i];
    	}
    	
    	return prod;
    }

    public int min(int[] array){

    	if (array.length == 0) return Integer.MAX_VALUE;
    	
    	int min = array[0];
    	
    	for (int i = 1; i < array.length; ++i) {
    		
    		if (array[i] < min) min = array[i];
    	}
    	
    	return min;
    }

    public int max(int[] array){

    	if (array.length == 0) return Integer.MIN_VALUE;
    	
    	int max = array[0];
    	
    	for (int i = 1; i < array.length; ++i) {
    		
    		if (array[i] > max) max = array[i];
    	}
    	
    	return max;
    }

    public double average(int[] array){

    	if (array.length == 0) return 0;
    	
    	int sum = sum(array);
    	
    	return (double) sum / array.length;
    }

    public boolean isSortedDescendant(int[] array){

    	if (array.length == 0) return true;
    	
    	for (int i = 0; i < array.length - 1; ++i) {
    		
    		if (array[i] <= array[i+1]) {
    			
    			return false;
    		}
    	}
    	
    	return true;
    }

    public void cube(int[]array){
    	
    	for (int i = 0; i < array.length; ++i) {
    		
    		array[i] = array[i] * array[i] * array[i];
    	}

    }

    public boolean find(int[]array, int value){
    	
    	for (int i = 0; i < array.length; ++i) {
    		
    		if (array[i] == value) {
    			
    			return true;
    		}
    	}
    	return false;
    }

    public void reverse(int[]array){
    	
    	for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
    		
    		int temp = array[i];
    		array[i] = array[j];
    		array[j] = temp;
    	}
    }

    public boolean isPalindrome(int[]array){

    	if (array.length == 0) return true;
    	
    	for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
    		
    		if (array[i] != array[j]) return false;
    	}
    	
    	return true;
    }

    public int sum(int[][] matrix){
    	
    	int matrixSum = 0;
    	
    	for (int i = 0; i < matrix.length; ++i) {
    		
    		matrixSum += sum(matrix[i]);
    	}
    	
    	return matrixSum;
    }

    public int max(int[][] matrix){

    	if (matrix.length == 0) return Integer.MIN_VALUE;
    	
    	int matrixMax = max(matrix[0]);
    	
    	for (int i = 1; i < matrix.length; ++i) {
    		
    		int rowMax = max(matrix[i]);
    		
    		if (rowMax > matrixMax) {
    			
    			matrixMax = rowMax;
    		}
    	}
    	
    	return matrixMax;
    }

    public int diagonalMax(int[][] matrix){

    	if (matrix.length == 0) return Integer.MIN_VALUE;
    	
    	int diagMax = matrix[0][0];
    	
    	for (int i = 1; i < matrix.length; ++i) {
    		
    		if (matrix[i][i] > diagMax)
    			diagMax = matrix[i][i];
    	}
    	
    	return diagMax;
    	
    }

    public boolean isSortedDescendant(int[][] matrix){
    	
    	for (int i = 0; i < matrix.length; ++i) {
    		
    		if ( !(isSortedDescendant(matrix[i])) )
    			return false;
    	}
    	
    	return true;
    }

}
