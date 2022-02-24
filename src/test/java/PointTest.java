import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void pointsGetters() {
        Point p = new Point(1, 2);

        assertEquals(1, p.getX());
        assertEquals(2, p.getY());
    }

    @Test
    public void pointEquals() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(5, 3);

        assertEquals(p1, p2);
        assertEquals(p2, p1);
        assertNotEquals(p1, p3);
    }
}