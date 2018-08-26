package ru.job4j.chess.firuges;

import ru.job4j.chess.exeption.FigureNotFoundException;
import ru.job4j.chess.exeption.ImposibleMoveExeption;
import ru.job4j.chess.exeption.OccupiedWayException;

public abstract class   Figure {
    public final Cell position;

    public Figure (Cell cell){
      position = cell;
    }

    public abstract Cell position();

    public abstract Cell[] way(Cell source, Cell dest) throws ImposibleMoveExeption, OccupiedWayException, FigureNotFoundException;

    public String icon() {
        return String.format(
                "%s.png", this.getClass().getSimpleName()
        );

    }

    public abstract Figure copy(Cell dest);

}
