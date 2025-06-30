package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {
	
    static final double DELTA = 0.0001;
	
	// Test point A value from rectangle Constructor
    @Test
    void testConstructorPointA() {
        Point p = new Point(1.1, 2.2);
        double w = 10.1;
        double h = 5.5;
        Rectangle r = new Rectangle(p, w, h);
        assertEquals(1.1, r.A.x, DELTA);
        assertEquals(2.2, r.A.y, DELTA);
    }
    
	// Test point B value from rectangle Constructor
    @Test
    void testConstructorPointB() {
        Point p = new Point(1.1, 2.2);
        double w = 10.1;
        double h = 5.5;
        Rectangle r = new Rectangle(p, w, h);
        assertEquals(11.2, r.B.x, DELTA);
        assertEquals(2.2, r.B.y, DELTA);
    }
    
	// Test point C value from rectangle Constructor
    @Test
    void testConstructorPointC() {
        Point p = new Point(1.1, 2.2);
        double w = 10.1;
        double h = 5.5;
        Rectangle r = new Rectangle(p, w, h);
        assertEquals(1.1, r.C.x, DELTA);
        assertEquals(-3.3, r.C.y, DELTA);
    }
    
	// Test point D value from rectangle Constructor
    @Test
    void testConstructorPointD() {
        Point p = new Point(1.1, 2.2);
        double w = 10.1;
        double h = 5.5;
        Rectangle r = new Rectangle(p, w, h);
        assertEquals(11.2, r.D.x, DELTA);
        assertEquals(-3.3, r.D.y, DELTA);
    }
    
    // Test rect contructor with no width or height
    @Test
    void testConstructorNoDimensions() {
        Point p = new Point(1, 1);
        Rectangle r = new Rectangle(p, 0, 0);
        assertEquals(p, r.A);
        assertEquals(p, r.B);
        assertEquals(p, r.C);
        assertEquals(p, r.D);
    }

	// Test width() with positive width
    @Test
    void testWidthPositiveWidth() {
        Rectangle r = new Rectangle(new Point(1.1, 2.2), 5.5, 4.4);
        assertEquals(5.5, r.width(), DELTA);
    }

	// Test width() with negative width
    @Test
    void testWidthNegativeWidth() {
        Rectangle r = new Rectangle(new Point(3.3, 3.3), -4.4, 5.5);
        assertEquals(4.4, r.width(), DELTA); 
    }
    
	// Test height() with positive co-ords
    @Test
    void testHeightPositiveCoords() {
        Rectangle r = new Rectangle(new Point(1.1, 2.2), 5.5, 6.6);
        assertEquals(6.6, r.height(), DELTA);
    }

	// Test height() with negative co-ords
    @Test
    void testHeightNegativeCoords() {
        Rectangle r = new Rectangle(new Point(6.6, 6.6), 6.6, -7.7);
        assertEquals(7.7, r.height(), DELTA); 
    }
    
    // Test area() 
    @Test
    void testArea() {
        Rectangle r = new Rectangle(new Point(0, 0), 4.4, 5.5);
        assertEquals(24.2, r.area(), DELTA);
    }
    
    // Test area() with zero width
    @Test
    void testAreaZeroWidth() {
        Rectangle r = new Rectangle(new Point(0, 0), 0, 5.5);
        assertEquals(0.0, r.area(), DELTA);
    }

    // Test area() with zero height
    @Test
    void testAreaZeroHeight() {
        Rectangle r = new Rectangle(new Point(0, 0), 4.4, 0);
        assertEquals(0.0, r.area(), DELTA);
    }

    // Test perimeter()
    @Test
    void perimeterStandardRectangle() {
        Rectangle r = new Rectangle(new Point(0, 0), 6.6, 7.7);
        assertEquals(28.6, r.perimeter(), DELTA);
    }
    
    // Test perimeter() with zero width
    @Test
    void testPerimeterZeroWidth() {
        Rectangle r = new Rectangle(new Point(5.5, 5.5), 0, 6.6);
        assertEquals(13.2, r.perimeter(), DELTA);
    }
    
    // Test perimeter() with zero height
    @Test
    void testPerimeterZeroHeight() {
        Rectangle r = new Rectangle(new Point(5.5, 5.5), 7.7, 0);
        assertEquals(15.4, r.perimeter(), DELTA);
    }

    // Test perimeter() with no dimensions
    @Test
    void testPerimeterNoDimensions() {
        Rectangle r = new Rectangle(new Point(5.5, 5.5), 0, 0);
        assertEquals(0.0, r.perimeter(), DELTA);
    }
}