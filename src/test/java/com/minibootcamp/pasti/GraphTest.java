package com.minibootcamp.pasti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphTest {
    @Test
    public void setCoordinate_ReturnEqual_InputIsCorrect() {

        Graph geometry = new Graph();
        int [] functionResult = geometry.setCoordinate(1, 2);

        int [] expectedResult = {1, 2};

        assertEquals(expectedResult[0], functionResult[0]);
    }
}
