package algorithm;

import java.util.Random;

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




    /*
    * Функция генератора паролей - Принимает число для длинны пароля и символы
    * */
    public static String gen_pass(int pass_length, String character){
        StringBuilder pass = new StringBuilder();                       //StringBuilder позволяет добавлять, удалять и изменять символы в строке без создания нового объекта String.
        Random random = new Random();                                   //Random можно использовать для создания различных видов случайных данных,

        for (int i = 0; i < pass_length; i++){
            int index = random.nextInt(character.length());
            pass.append(character.charAt(index));
        }
        return pass.toString();
    }





    /*
     * Функция быстрой сортировки
     * */

    public void quick_sort(int[] sort_arr, int low, int hight){
        if (sort_arr.length == 0 || low > hight){
            return;
        }

        int middle = low + (hight - low) / 2;
        int border = sort_arr[middle];

        int i = low, j = hight;
        while(i <= j){
            while (sort_arr[i] < border){
                i++;
            }
            while (sort_arr[j] > border){
                j--;
            }
            if (i <= j){
                int swap = sort_arr[i];
                sort_arr[i] = sort_arr[j];
                sort_arr[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j){
            quick_sort(sort_arr,low,j);
        }
        if (hight > i){
            quick_sort(sort_arr,i,hight);
        }
    }

}
