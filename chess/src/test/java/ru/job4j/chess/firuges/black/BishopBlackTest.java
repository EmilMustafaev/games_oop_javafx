package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    public void whenPositionThenCorrect() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell position = bishop.position();
        assertEquals(Cell.C1, position);
    }

    @Test
    void whenWayThenCorrect() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] way = bishop.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, way);
    }

    @Test
    void whenCopyThenCorrect() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        BishopBlack copiedBishop = (BishopBlack) bishop.copy(Cell.E6);
        Cell newPosition = copiedBishop.position();
        assertEquals(Cell.E6, newPosition);
    }
}