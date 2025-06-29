package lab4;

public class Rectangle {
    Point A;    // topleft point
    Point B;    // topright point
    Point C;    // bottomleft point
    Point D;    // bottomright point

    public Rectangle(Point A, double width, double height) {
        this.A = A;
        this.B = new Point(A.x + width, A.y);
        this.C = new Point(A.x, A.y - height);
        this.D = new Point(A.x + width, A.y - height);
    }

    public double width() {
        return A.distance(B);
    }

    public double height() {
        return A.distance(C);
    }

    public double area() {
        return width() * height();
    }

    public double perimeter() {
        return 2 * (width() + height());
    }
}