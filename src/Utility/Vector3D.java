package Utility;

public class Vector3D {
    public double x, y, z;

    public Vector3D() {}

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Vector3D vector) {
        //new Vector3D(vector.x, vector.y, vector.z);
        x = vector.x;
        y = vector.y;
        z = vector.z;
    }

    public Vector3D add(Vector3D vector) {
        return new Vector3D(x+ vector.x, y+ vector.y, z+ vector.z);
    }

    public Vector3D sub(Vector3D vector) {
        return new Vector3D(x- vector.x, y- vector.y, z- vector.z);
    }

    public double dot(Vector3D vector) {
        return x* vector.x + y* vector.y + z+ vector.z;
    }

    public double dot(Point3D point) {
        return dot(new Vector3D(point.x, point.y, point.z));
    }

}
