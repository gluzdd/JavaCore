package hw2;

import java.util.Arrays;

public class Programm {
    //Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public static void main(String[] args) {
//        char [][] field2 = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        char [][] field2 = new char[3][3];
        for (int i = 0; i < 3; i++) {  //идём по строкам
            for (int j = 0; j < 3; j++) {//идём по столбцам
                field2[i][j] = '.';
                System.out.print(" " + field2[i][j] + " "); //вывод элемента

            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
//        System.out.println(field2[0][0]);
//        System.out.println(field2[1][1]);
//        System.out.println(field2[2][2]);

        /*
        char[][] field = new char[3][3];
        for (int x = 0; x < 3; x++) {
            System.out.println();
//            System.out.print(field[x][0]);
//            System.out.print(field[1][x]);
//            System.out.print(field[2][x]);
            for (int y = 0; y < 3; y++) {
                field[x][y] = '.';
            }
            System.out.println(Arrays.deepToString(field));
*/
        }






/*

        int arr[] = {2, 1, 2, 3, 4};
//        int arr[] = {2, 2, 0};
//        int arr[] = {1, 3, 5};
        System.out.println(evenElements(arr));
        System.out.println(differenceMaxMinElements(arr));
        System.out.println(сheckNeighboringElements(arr));
    }
    static int evenElements(int[] arr) {
        int countElements = 0;
        for (int item: arr) {
            if (item % 2 == 0)
                countElements++;
        }
        return countElements;
    };
    //Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.

    static int differenceMaxMinElements(int[] arr) {
        int maxElements = arr[0];
        int minElements = arr[0];
        for (int item: arr) {
            if (item < minElements)
                minElements = item;
            else if (item > maxElements)
                maxElements = item;
        }
        return maxElements - minElements;
    }

    static boolean сheckNeighboringElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 2] == 0)
                return true;
        }
        return false;
    }*/

};
