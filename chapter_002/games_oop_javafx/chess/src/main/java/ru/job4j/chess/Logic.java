package ru.job4j.chess;

import ru.job4j.chess.exeption.FigureNotFoundException;
import ru.job4j.chess.exeption.ImposibleMoveExeption;
import ru.job4j.chess.exeption.OccupiedWayException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Optional;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {
    private final Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) throws FigureNotFoundException, OccupiedWayException, ImposibleMoveExeption {
        boolean rst = true;
        int index = this.findBy(source);
        if (index != -1) {
            Cell[] steps = this.figures[index].way(source, dest);
            for (Cell step: steps) {
                for (Figure figure : figures) {
                    if (figure != null) {
                        if (step.equals(figure.position())) {
                            rst = false;
                        }
                    }
                }
            }
            if (rst) {
                this.figures[index] = this.figures[index].copy(dest);
            }
        }
        return rst;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
