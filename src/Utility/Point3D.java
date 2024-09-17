package Utility;

/*
* 3D point class.
* @params
*   double x
*   double y
*   double z
* */

public class Point3D {
    public double x, y, z;

    public Point3D() {}

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(Point3D point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    public Point3D add(Point3D point) {
        return new Point3D(x + point.x, y + point.y, z + point.z);
    }

    public Point3D sub(Point3D point) {
        return new Point3D(x - point.x, y - point.y, z - point.z);
    }

    public double dot(Point3D point) {
        return x* point.x + y* point.y + z* point.z;
    }

    public double dot(Vector3D vector) {
        return vector.dot(this);
    }

    public double dot(Normal normal) {
        return x* normal.x + y * normal.y + z * normal.z;
    }
}
