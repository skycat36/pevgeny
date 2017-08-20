package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int step;
        if (array.length % 2 == 0) {
            step = array.length / 2; // Полуцикл для четного количества элементов
        } else {
            step = array.length / 2 + 1; // Полуцикл для нечетного количества элементов
        }

        for (int i=0; i < step; i++) { // Обмен местами элементов с начала массива и конца
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return  array;
    }
}
