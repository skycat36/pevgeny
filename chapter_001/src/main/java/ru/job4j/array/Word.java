package ru.job4j.array;

public class Word {

    public char[] wordInArray (String temp){
       return temp.toCharArray();
    }

    boolean contains(char[] origin, char[] sub){
        int key = 0, sublenth = sub.length - 1;
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
