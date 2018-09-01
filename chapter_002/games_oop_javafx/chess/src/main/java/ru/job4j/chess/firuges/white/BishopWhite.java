package ru.job4j.chess.firuges.white;

import ru.job4j.chess.exeption.FigureNotFoundException;
import ru.job4j.chess.exeption.ImposibleMoveExeption;
import ru.job4j.chess.exeption.OccupiedWayException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopWhite extends Figure {
    public BishopWhite(final Cell position) {
        super(position);
    }

    @Override
    public Cell position() {
        return this.position;
    }

    private Cell getCell(int x, int y){
        Cell cellTemp = null;
        for (Cell cell: Cell.values()) {
            if (cell.x == x && cell.y == y) {
                cellTemp = cell;
                break;
            }
        }
        return  cellTemp;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImposibleMoveExeption {
        if (Math.abs(source.x - dest.x) != Math.abs(source.y - dest.y))
        {
            throw new ImposibleMoveExeption("Figure don't move to point of destination.");
        }
        int deltaX = source.x;
        int deltaY = source.y;
        int i=0;
        Cell[] steps = new Cell[Math.abs(source.x - dest.x)];
        while (deltaX != dest.x || deltaY != dest.y){
            if (dest.x > source.x){
                deltaX++;
            }
            else{
                deltaX--;
            }
            if (dest.y > source.y){
                deltaY++;
            }
            else{
                deltaY--;
            }
            steps[i] = this.getCell(deltaX, deltaY);
            i++;

        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopWhite(dest);
    }
}
