package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {

    /*
        initial x = 0, y = 0, direction = NORTH
     */
    @Test
    void should_x0_y1_directionNORTH_when_execute_given_x0_y0_directionNORTH_command_MOVE() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.NORTH;

        String commands = MOVEMENT_KEYWORDS.MOVE_KEY;
        int expectedX = 0;
        int expectedY = 1;
        String expectedDirection = MOVEMENT_KEYWORDS.NORTH;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionWEST_when_execute_given_x0_y0_directionNORTH_command_LEFT() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.NORTH;

        String commands = MOVEMENT_KEYWORDS.TURN_LEFT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.WEST;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionEAST_when_execute_given_x0_y0_directionNORTH_command_RIGHT() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.NORTH;

        String commands = MOVEMENT_KEYWORDS.TURN_RIGHT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.EAST;

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
    void should_x0_yMINUS1_directionSOUTH_when_execute_given_x0_y0_directionSOUTH_command_MOVE() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.SOUTH;

        String commands = MOVEMENT_KEYWORDS.MOVE_KEY;
        int expectedX = 0;
        int expectedY = -1;
        String expectedDirection = MOVEMENT_KEYWORDS.SOUTH;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionEAST_when_execute_given_x0_y0_directionSOUTH_command_LEFT() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.SOUTH;

        String commands = MOVEMENT_KEYWORDS.TURN_LEFT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.EAST;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionWEST_when_execute_given_x0_y0_directionSOUTH_command_RIGHT() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.SOUTH;

        String commands = MOVEMENT_KEYWORDS.TURN_RIGHT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.WEST;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    /*
        initial x = 0, y = 0, direction = EAST
     */
    @Test
    void should_x1_y0_directionEAST_when_execute_given_x0_y0_directionEAST_command_MOVE() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.EAST;

        String commands = MOVEMENT_KEYWORDS.MOVE_KEY;
        int expectedX = 1;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.EAST;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionNORTH_when_execute_given_x0_y0_directionEAST_command_LEFT() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.EAST;

        String commands = MOVEMENT_KEYWORDS.TURN_LEFT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.NORTH;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionSOUTH_when_execute_given_x0_y0_directionEAST_command_RIGHT() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.EAST;

        String commands = MOVEMENT_KEYWORDS.TURN_RIGHT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.SOUTH;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    /*
        initial x = 0, y = 0, direction = WEST
     */
    @Test
    void should_xMINUS1_y0_directionWEST_when_execute_given_x0_y0_directionWEST_command_MOVE() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.WEST;

        String commands = MOVEMENT_KEYWORDS.MOVE_KEY;
        int expectedX = -1;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.WEST;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionSOUTH_when_execute_given_x0_y0_directionWEST_command_LEFT() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.WEST;

        String commands = MOVEMENT_KEYWORDS.TURN_LEFT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.SOUTH;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    @Test
    void should_x0_y0_directionNORTH_when_execute_given_x0_y0_directionWEST_command_RIGHT() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.WEST;

        String commands = MOVEMENT_KEYWORDS.TURN_RIGHT_KEY;
        int expectedX = 0;
        int expectedY = 0;
        String expectedDirection = MOVEMENT_KEYWORDS.NORTH;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

    /*
        initial x = 0, y = 0, direction = NORTH, give INVALID COMMAND F
     */
    @Test
    void should_throw_CommandNotDefinedException_when_execute_given_x0_y0_directionNORTH_command_F() {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.NORTH;

        String commands = "F";

        // when
        MarsRover rover = new MarsRover(x, y, direction);

        // then
        Assertions.assertThrows(CommandNotDefinedException.class, () -> rover.performCommands(commands));
    }

    /*
        initial x = 0, y = 0, direction = NORTH, give INVALID COMMAND F
     */
    @Test
    void should_xMINUS1_y1_directionNORTH_when_execute_given_x0_y0_directionNORTH_command_MLMR() throws CommandNotDefinedException {
        // given
        int x = 0;
        int y = 0;
        String direction = MOVEMENT_KEYWORDS.NORTH;

        String commands = "MLMR";
        int expectedX = -1;
        int expectedY = 1;
        String expectedDirection = MOVEMENT_KEYWORDS.NORTH;

        // when
        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        // then
        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }

}
