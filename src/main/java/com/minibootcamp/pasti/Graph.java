package com.minibootcamp.pasti;

public class Graph {
    public int [] setCoordinate(int x, int y) {

        int [] coordinate = new int[2];

        coordinate[0] = x;
        coordinate[1] = y;

        return coordinate;
    }

    public int calculateLength(int [] coordinate1, int [] coordinate2) {

        return (int) Math.sqrt(Math.pow(coordinate1[0] - coordinate2[0], 2) + Math.pow(coordinate2[1] - coordinate1[1], 2));
    }
}
