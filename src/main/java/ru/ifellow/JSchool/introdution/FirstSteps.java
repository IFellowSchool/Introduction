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
    	
    	if (x == y) return true;
    	return false;
    }

    public boolean isGreater (int x, int y){
    	
    	if (x > y) return true;
    	return false;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
    	
    	if ( (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom) )
    		return true;
    	return false;
    }

    public int sum(int[] array){
    	
    	if (array == null)     return 0;
    	if (array.length == 0) return 0;
    	
    	int sum = 0;
    	
    	for (int i = 0; i < array.length; ++i) {
    		
    		sum += array[i];
    	}
    	
    	return sum;
    }

    public int mul(int[] array){
    	
    	if (array == null)     return 0;
    	if (array.length == 0) return 0;
    	
    	int prod = 1;
    	
    	for (int i = 0; i < array.length; ++i) {
    		
    		prod *= array[i];
    	}
    	
    	return prod;
    }

    public int min(int[] array){
    	
    	if (array == null)     return Integer.MAX_VALUE;
    	if (array.length == 0) return Integer.MAX_VALUE;
    	
    	int min = array[0];
    	
    	for (int i = 1; i < array.length; ++i) {
    		
    		if (array[i] < min) min = array[i];
    	}
    	
    	return min;
    }

    public int max(int[] array){
    	
    	if (array == null)     return Integer.MIN_VALUE;
    	if (array.length == 0) return Integer.MIN_VALUE;
    	
    	int max = array[0];
    	
    	for (int i = 1; i < array.length; ++i) {
    		
    		if (array[i] > max) max = array[i];
    	}
    	
    	return max;
    }

    public double average(int[] array){
    	
    	if (array == null)     return 0;
    	if (array.length == 0) return 0;
    	
    	int sum = 0;
    	
    	for (int i = 0; i < array.length; ++i) {
    		
    		sum += array[i];
    	}
    	
    	return (double) sum / array.length;
    }

    public boolean isSortedDescendant(int[] array){
    	
    	if (array == null)     return true;
    	if (array.length == 0) return true;
    	
    	for (int i = 0; i < array.length - 1; ++i) {
    		
    		if (array[i] <= array[i+1]) {
    			
    			return false;
    		}
    	}
    	
    	return true;
    }

    public void cube(int[]array){
    	
    	if (array == null) return;
    	
    	for (int i = 0; i < array.length; ++i) {
    		
    		array[i] = array[i] * array[i] * array[i];
    	}

    }

    public boolean find(int[]array, int value){
    	
    	if (array == null) return false;
    	
    	for (int i = 0; i < array.length; ++i) {
    		
    		if (array[i] == value) {
    			
    			return true;
    		}
    	}
    	return false;
    }

    public void reverse(int[]array){
    	
    	if (array == null) return;
    	
    	for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
    		
    		int temp = array[i];
    		array[i] = array[j];
    		array[j] = temp;
    	}
    }

    public boolean isPalindrome(int[]array){
    	
    	if (array == null)     return true;
    	if (array.length == 0) return true;
    	
    	for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
    		
    		if (array[i] != array[j]) return false;
    	}
    	
    	return true;
    }

    public int sum(int[][] matrix){
    	
    	if (matrix == null) return 0;
    	
    	int matrixSum = 0;
    	
    	for (int i = 0; i < matrix.length; ++i) {
    		
    		for (int j = 0; j < matrix[i].length; ++j) {
    			
    			matrixSum += matrix[i][j];
    		}
    	}
    	
    	return matrixSum;
    }

    public int max(int[][] matrix){
    	
    	if (matrix == null)     return Integer.MIN_VALUE;
    	if (matrix.length == 0) return Integer.MIN_VALUE;
    	
    	int matrixMax = matrix[0][0];
    	
    	// этот цикл по нулевой строке только для того,
    	// чтобы не проверять лишний раз [0][0] в общем цикле
    	
    	for (int i = 0, j = 1; j < matrix[i].length; ++j) {
    		
    		if (matrix[i][j] > matrixMax)
    			matrixMax = matrix[i][j];
    	}
    	
    	for (int i = 1; i < matrix.length; ++i) {
    		
    		for (int j = 0; j < matrix[i].length; ++j) {
    			
    			if (matrix[i][j] > matrixMax)
    				matrixMax = matrix[i][j];
    		}
    	}
    	
    	return matrixMax;
    }

    public int diagonalMax(int[][] matrix){
    	
    	if (matrix == null)     return Integer.MIN_VALUE;
    	if (matrix.length == 0) return Integer.MIN_VALUE;
    	
    	int diagMax = matrix[0][0];
    	
    	for (int i = 1; i < matrix.length; ++i) {
    		
    		if (matrix[i][i] > diagMax)
    			diagMax = matrix[i][i];
    	}
    	
    	return diagMax;
    	
    }

    public boolean isSortedDescendant(int[][] matrix){
    	
    	/* проверяем переходы между парами строк:
    	 * (первый элемент нижней строки
    	 * и последний элемент верхней строки
    	 */
    	for (int i = 0; i < matrix.length - 1; ++i) {
    		
    		if (matrix[i+1][0] >= matrix[i][ matrix[i].length - 1 ] )
    			return false;
    	}
    	
    	// убеждаемся, что каждая строка по убыванию
    	
    	for (int i = 0; i < matrix.length; ++i) {
    		
    		if ( !(isSortedDescendant(matrix[i])) )
    			return false;
    	}
    	
    	return true;
    }

}
