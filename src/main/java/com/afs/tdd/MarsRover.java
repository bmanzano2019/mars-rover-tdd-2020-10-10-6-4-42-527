package com.afs.tdd;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int coordX;
    private int coordY;
    private String direction;
    private List<String> rotation_mapper = new ArrayList<>(
            Arrays.asList(
                    MOVEMENT_KEYWORDS.NORTH,
                    MOVEMENT_KEYWORDS.EAST,
                    MOVEMENT_KEYWORDS.SOUTH,
                    MOVEMENT_KEYWORDS.WEST)
    );

    public MarsRover(int coordX, int coordY, String direction) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.direction = direction;
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public String getDirection() {
        return direction;
    }

    public void performCommands(String commands) {
        if (!checkIfValidCommands(commands)) {
            return;
        }

        Arrays.asList(commands.split("")).forEach(this::parseCommand);
    }

    private boolean checkIfValidCommands(String commands) {
        // TBI
        return true;
    }

    private void parseCommand(String command) {
        if (command.equals(MOVEMENT_KEYWORDS.MOVE_KEY)) {
            move();
        }
    }

    private void move() {
        switch(direction) {
            case MOVEMENT_KEYWORDS.NORTH:
                coordY++;
                break;
            case MOVEMENT_KEYWORDS.SOUTH:
                coordY--;
                break;
            case MOVEMENT_KEYWORDS.EAST:
                coordX++;
                break;
            case MOVEMENT_KEYWORDS.WEST:
                coordX--;
                break;
            default:
                break;
        }
    }

    private void turn() {
        throw new NotImplementedException();
    }
}
