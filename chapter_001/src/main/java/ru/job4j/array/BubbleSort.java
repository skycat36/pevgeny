package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i=0; i < array.length - 2; i++) {
            boolean key = true;
            for (int j=0; j < array.length - 1 - i; j++) {
                if ( array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    key = false;
                }
            }
            if (key == true) {
                break;
            }
        }
    return array;
    }
}
