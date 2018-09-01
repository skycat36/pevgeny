package ru.job4j.white;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.exeption.FigureNotFoundException;
import ru.job4j.chess.exeption.ImposibleMoveExeption;
import ru.job4j.chess.exeption.OccupiedWayException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.white.BishopWhite;
import ru.job4j.chess.firuges.white.PawnWhite;

public class BithopWhiteTest {
    @Test
    public void wayTestWhereFigureStepTrue() {
        Logic logic = new Logic();
        Figure figure = new BishopWhite(Cell.C1);
        logic.add(figure);
        boolean result = false;
        try {
            result = logic.move(Cell.C1, Cell.E3);

        } catch (FigureNotFoundException e) {
            result = false;
            e.printStackTrace();
        } catch (OccupiedWayException e) {
            result = false;
            e.printStackTrace();
        } catch (ImposibleMoveExeption imposibleMoveExeption) {
            result = false;
            imposibleMoveExeption.printStackTrace();
        }
        Assert.assertEquals(true, result);
    }

    @Test
    public void wayTestWhereFigureStepFalse(){
        Logic logic = new Logic();
        Figure figure = new BishopWhite(Cell.C1);
        logic.add(figure);
        boolean result = true;
        try {
            logic.move(Cell.C1, Cell.E1);

        } catch (FigureNotFoundException e) {
            result = false;
            e.printStackTrace();
        } catch (OccupiedWayException e) {
            e.printStackTrace();
            result = false;
        } catch (ImposibleMoveExeption imposibleMoveExeption) {
            result = false;
        }
        Assert.assertEquals(false, result);
    }

    @Test
    public void wayTestWhereFigureCannotJumpOverFigureThenFalse(){
        Logic logic = new Logic();
        Figure figureBishopWhite = new BishopWhite(Cell.C1);
        Figure figurePawnWhite = new PawnWhite(Cell.D2);
        logic.add(figureBishopWhite);
        logic.add(figurePawnWhite);
        boolean result = true;
        try {
            result = logic.move(Cell.C1, Cell.E3);

        } catch (FigureNotFoundException e) {
            e.printStackTrace();
        } catch (OccupiedWayException e) {
            result = false;
        } catch (ImposibleMoveExeption imposibleMoveExeption) {
            imposibleMoveExeption.printStackTrace();
        }
        Assert.assertEquals(false, result);
    }

}
