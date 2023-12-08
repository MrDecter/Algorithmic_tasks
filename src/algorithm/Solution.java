package algorithm;

/*
* Поиск числа K в матрице, самым оптимальным способом.
* Проверяем столбцы матрицы, если начальное число столбца больше числа k
* исключаем столбец. Если меньше, далее повторяем принцип но с строками
* */
public class Solution {
    public static boolean searchMatrix(int[][] matrix, int k){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;

        while (i < m && j >= 0){
            if (matrix[i][j] == k){
                return true;
            }
            if (matrix[i][j] > k){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
/*
* Дается число в виде массива чисел( 100 = [1,0,0] и т.д.).
* Увеличиваем его на 1 и возвращаем результат
* */
    public static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 9){
                digits[i] = 0;
            }else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


}
