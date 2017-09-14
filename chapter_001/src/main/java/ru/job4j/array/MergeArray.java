package ru.job4j.array;

/**
 * @author Evgeny Popov
 * @since 1.0
 */

public class MergeArray {

    /**
     * Merge two array in one.
     * @param oneArr - first array
     * @param twoArr - second array.
     * @return Merged array.
     */

    public int[] merge(int[] oneArr, int[] twoArr) {
        int lenOneArr = oneArr.length , lenTwoArr = twoArr.length ; // Длинна 1-го и 2-го массива
        int[] threeArr = new int[lenOneArr + lenTwoArr];
        int i = 0, j = 0;
        while (i < lenOneArr && j < lenTwoArr) {
            if (oneArr[i] < twoArr[j]) {
                       threeArr[i + j] = oneArr[i];
                       i++;
            } else {
                threeArr[i + j] = twoArr[j];
                j++;
            }
        }
        while (i < lenOneArr) { // Если достигнут конец одного из массива цикл дописывает оставшуюся часть доконца.
           threeArr[i + j] = oneArr[i];
           i++;
        }
        while (j < lenTwoArr) {
            threeArr[i + j] = twoArr[j];
            j++;
        }
        return threeArr;
    }
}

