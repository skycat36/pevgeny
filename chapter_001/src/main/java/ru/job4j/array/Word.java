package ru.job4j.array;

/**
 * @author Evgeny Popov
 * @since 1.0
 */

public class Word {

    /**
     * Conversion of String in char array.
     * @param temp - Conversion word.
     * @return Char array.
     */


    public char[] wordInArray (String temp){
       return temp.toCharArray();
    }

    /**
     * Check that one word contain in two word.
     * @param origin - Conversion word.
     * @param sub - The word that we are looking for
     * @return boolean value
     */
    boolean contains(char[] origin, char[] sub){
        int key = 0, sublenth = sub.length - 1; //sublenth - Length check the word.
        for (int i = 0; i < origin.length - 1; i++) {
            if (origin[i] == sub[key]) {
                key++;
            } else {
                key = 0;
            }
            if (key == sublenth) {
                return true;
            }
        }
        return false;
    }
}
