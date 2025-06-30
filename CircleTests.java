package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTests {
    @Test
    void testCircumference(){
        Circle c = new Circle(new Point(1,2),3);
        assertEquals(6*Math.PI, c.circumference());
    }

    @Test
    void testArea(){
        Circle c = new Circle(new Point(1,2),3);
        assertEquals(9*Math.PI, c.area());
    }

    @Test
    void testIsGreater(){
        Circle c = new Circle(new Point(1,2),3);
        Circle c2 = new Circle(new Point(1,2),2);
        assertTrue(c.isGreater(c2));
    }

    @Test
    void testPointInCircle(){
        Circle c = new Circle(new Point(1,2),3);
        assertTrue(c.pointInCircle(new Point(1,2)));
    }
}
