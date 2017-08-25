package ru.job4j.array;

public class RotateArray {
    public int[][] rotate(int[][] array) {

        for (int i=0; i < array.length - 1; i++) {
            for (int j=0; j < array.length - 1; j++) {
                if (i == j) { //обмен противоположных элементов  главной диагонали
                    continue;
                } else {
                    int temp = array[i][j];
                    array[i][j] = array[array.length - 1 - i][array.length - 1 - j];
                    array[array.length - 1 - i][array.length - 1 - j] = temp;
                }
            }
        }
        Turn turn = new Turn();
        for(int i=0; i < array.length - 1; i++) { // переворот строк массива
            array[i] = turn.back(array[i]);
        }
    return array;
    }
}

