package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {

    @Test
    void should_x0_y1_directionN_when_execute_given_x0_y0_directionN_command_M() {
        int x = 0;
        int y = 0;
        String direction = "N";
        String commands = "M";

        int expectedX = 0;
        int expectedY = 1;
        String expectedDirection = "N";

        MarsRover rover = new MarsRover(x, y, direction);
        rover.performCommands(commands);

        Assertions.assertEquals(expectedX, rover.getCoordX());
        Assertions.assertEquals(expectedY, rover.getCoordY());
        Assertions.assertEquals(expectedDirection, rover.getDirection());
    }
}
