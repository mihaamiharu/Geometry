package com.minibootcamp.ada;

public class Line {
    private int x1;
    private int x2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getLength() {
        return x2 - x1;
    }
}
