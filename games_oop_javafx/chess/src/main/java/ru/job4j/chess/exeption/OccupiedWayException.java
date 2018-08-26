package ru.job4j.chess.exeption;

public class OccupiedWayException extends Exception{
    public OccupiedWayException (String message) {
        super(message);
    }
}
