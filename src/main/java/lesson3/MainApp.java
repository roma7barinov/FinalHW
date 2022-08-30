package lesson3;

import java.util.Arrays;

/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;

2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

4. Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу:
индексы таких элементов равны, то есть [0][0],
                                               [1][1], [2][2], …, [n][n];

5. Написать метод, принимающий на вход два аргумента: len и initialValue, и
возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
**Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

8. *** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций.
Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) ->
[ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.
*/
public class MainApp {
    public static void main(String[] args) {
        //ex-1
        int[] arr = {1,0,1,1,0,0};
        arrayChange(arr);
        //ex-2
        int[] arr1 = new int[100];
        fielArray(arr1);
        //ex-3
        int[] arr2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        expandTheArray(arr2);
        //ex-4
        int[][] arr3 = new int[9][9];
        diagonalArray(arr3);
        //ex-5
        arraylen(10,45);
        //ex-6
        int[] arr4 = {-1,2,4,3,100,3,-123,4};
        maxAndMin(arr4);
        //ex-7
        int[] arr5 = {1,2,2,5};
        System.out.println(checkBalance(arr5));
        //ex-8
        //[1,2,3]
        int[] arr6 = {1,2,3};
        shiftArray(arr6,-1);


    }
    public static void shiftArray (int [] arr, int n) {
        int shiftNumber = n % arr.length;
        if (shiftNumber < 0) {
            shiftLeft(arr,Math.abs(shiftNumber));
        } else {
            shiftRight(arr,shiftNumber);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void shiftLeft(int[] arr,int n) {
        for (int i = 0; i < n; i++) {
            int firstValue = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = firstValue;
        }
    }
    public static void shiftRight(int[] arr,int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0 ; j--) {
                arr[j] = arr [j - 1];
            }
            arr[0] = lastValue;
        }
    }
    public static boolean checkBalance(int[] arr) {
        boolean result = false;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length ; i++) {
            rightSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                result = true;
                break;
            }
        }

        return result;
    }
    public static void maxAndMin(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                min = arr[i];
            }
        }
        System.out.println("Max : " + max + "\n" + "Min : " + min);
    }
    public static void  arraylen (int len , int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void diagonalArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i + j == arr.length - 1)) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + "  ");
                } else {
                    arr[i][j] = 0;
                    System.out.print(arr[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
    public static void expandTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void fielArray (int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void arrayChange(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
