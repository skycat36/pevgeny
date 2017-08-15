package ru.job4j.loop;

public class Paint {

    public String piramid(int h) {
        StringBuilder paint = new StringBuilder ();
        int wight = 2 * h - 1;  // ширина пирамиды
        int center = h - 1; // сентр пирамиды
        for ( int i = 0; i < h; i++ ) { // приход по уровням пирамиды
            for ( int j = 0; j < wight; j++) {

                if ( j >= (center - i) && j <= (center + i) ) {
                    paint.append("^");
                }
                else {
                    paint.append(" ");
                }
            }
            paint.append(System.getProperty("line.separator"));
        }
    return paint.toString();
    }
}
