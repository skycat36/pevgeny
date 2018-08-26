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

    /*
    private boolean isDiagonal(Cell source, Cell dest) {


        if (Math.abs(source.x - dest.x) == 1 && Math.abs(source.y - dest.y) == 1) {
            return true;
        }
        return false;
    }
    */

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
        int deltaX = source.x;
        int deltaY = source.y;
        int i=0;
        Cell[] steps = new Cell[Math.abs(source.x - dest.x)];
        if (source.x - dest.x != source.y - dest.y)
        {
            throw new ImposibleMoveExeption("Figure don't move to point of destination.");
        }
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
        if (deltaX - dest.x != 0 && deltaY - dest.y != 0) {
            throw new ImposibleMoveExeption("Figure don't move to point of destination.");
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopWhite(dest);
    }
}
