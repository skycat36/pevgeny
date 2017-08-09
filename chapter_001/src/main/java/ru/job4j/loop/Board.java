package ru.job4j.loop;

public class Board {

/**
 * Функция paint(int width, int height) принимает  в качестве параметра int width- высоту доски, int height- ширину доски
 */

public String paint(int width, int height) {
	StringBuilder board = new StringBuilder ("");
	for (int i=0; i < width; i++) {
		for ( int j=0; j < height; j++) {
			if ((i + j) % 2 == 0) {
				board.append("x");
			} else {
				board.append(" ");
			}
		}
		board.append(System.getProperty("line.separator"));

	}
	return board.toString();
}

}