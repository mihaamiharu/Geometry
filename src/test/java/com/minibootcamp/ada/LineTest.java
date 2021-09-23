package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LineTest {

    @Test
    public void testGetLengthGivenIdenticalEndpointsExpectReturnZero() {
        Line line = new Line(1, 1, 1, 1);

        assertEquals(0, line.getLength());
    }

    @Test
    public void testGetLengthGivenHorizontalLineExpectReturnItsLength() {
        Line line = new Line(0, 5, 1, 5);

        assertEquals(1, line.getLength());
    }

    @Test
    public void testGetLengthGivenHorizontalLineWithReversedEndpointsExpectReturnItsLength() {
        Line line = new Line(3, 0, 1, 0);

        assertEquals(2, line.getLength());
    }

    @Test
    public void testGetLengthGivenVerticalLineExpectReturnItsLength() {
        Line line = new Line(1, 2, 1, 5);

        assertEquals(3, line.getLength());
    }

    @Test
    public void testGetLengthGivenVerticalLineWithReversedEndpointsExpectReturnItsLength() {
        Line line = new Line(3, 5, 3, 1);

        assertEquals(4, line.getLength());
    }

    @Test
    public void testGetLengthGivenDiagonalLineExpectReturnItsLength() {
        Line line = new Line(3, 5, 6, 9);

        assertEquals(5, line.getLength());
    }

    @Test
    public void testEqualsGiven2IdenticalLinesExpectReturnTrue() {
        Line line1 = new Line(0, 0, 1, 1);
        Line line2 = new Line(0, 0, 1, 1);

        assertTrue(line1.equals(line2));
    }

    @Test
    public void testEqualsGiven2LinesWithOnlyY2CoordinateIsDifferentExpectReturnFalse() {
        Line line1 = new Line(0, 0, 1, 1);
        Line line2 = new Line(0, 0, 1, 2);

        assertFalse(line1.equals(line2));
    }

    @Test
    public void testEqualsGiven2LinesWithOnlyY1CoordinateIsDifferentExpectReturnFalse() {
        Line line1 = new Line(0, 0, 1, 1);
        Line line2 = new Line(0, 2, 1, 1);

        assertFalse(line1.equals(line2));
    }
}
