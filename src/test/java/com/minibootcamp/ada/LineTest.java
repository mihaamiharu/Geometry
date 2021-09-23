package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {

    @Test
    public void testGetLengthGivenIdenticalEndpointsExpectReturnZero() {
        Line line = new Line(1, 1, 1, 1);

        assertEquals(0, line.getLength());
    }
}
