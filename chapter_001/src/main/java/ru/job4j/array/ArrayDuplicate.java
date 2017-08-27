package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {

    public String[] remove(String[] array) {
        int count = array.length - 1; //количество уникальных ключей
        for (int i=0; i < count - 1; i++) {
            for (int j = i +1; j < count; j++) {
                if (array[i] == array[j]) {//в случае нахождения дубликата он перемещается в конец и счетчик count уменьшается
                    String temp = array[j];
                    array[j] = array[count];
                    array[count] = temp;
                    count--;
                }
            }
        }
    return Arrays.copyOf(array, count);
    }
}
