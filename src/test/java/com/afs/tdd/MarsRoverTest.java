package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {

    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";

    private static final String MOVE_KEY = "M";
    private static final String TURN_LEFT_KEY = "L";
    private static final String TURN_RIGHT_KEY = "R";

    /*
        initial x = 0, y = 0, direction = NORTH
     */
    @Test
    void should_x0_y1_directionNORTH_when_execute_given_x0_y0_directionNORTH_command_MOVE() {
        // given
        int x = 0;
        int y = 0;
        String direction = NORTH;

        String commands = MOVE_KEY;
        int expectedX = 0;
        int expectedY = 1;
        String expectedDirection = NORTH;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionWEST_when_execute_given_x0_y0_directionNORTH_command_LEFT() {
        // given
        int x = 0;
        int y = 0;
        String direction = NORTH;

        String commands = TURN_LEFT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = WEST;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionEAST_when_execute_given_x0_y0_directionNORTH_command_RIGHT() {
        // given
        int x = 0;
        int y = 0;
        String direction = NORTH;

        String commands = TURN_RIGHT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = EAST;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    /*
        initial x = 0, y = 0, direction = SOUTH
     */
    @Test
    void should_x0_yMINUS1_directionSOUTH_when_execute_given_x0_y0_directionSOUTH_command_MOVE() {
        // given
        int x = 0;
        int y = 0;
        String direction = SOUTH;

        String commands = MOVE_KEY;
        int expectedX = 0;
        int expectedY = -1;
        String expectedDirection = SOUTH;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionEAST_when_execute_given_x0_y0_directionSOUTH_command_LEFT() {
        // given
        int x = 0;
        int y = 0;
        String direction = SOUTH;

        String commands = TURN_LEFT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = EAST;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionWEST_when_execute_given_x0_y0_directionSOUTH_command_RIGHT() {
        // given
        int x = 0;
        int y = 0;
        String direction = SOUTH;

        String commands = TURN_RIGHT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = WEST;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }
}
