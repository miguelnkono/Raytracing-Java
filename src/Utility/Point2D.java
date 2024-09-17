package Utility;

public class Point2D {
    public double x, y;

    public Point2D() {}

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D point) {
        x = point.x;
        y = point.y;
    }
}
