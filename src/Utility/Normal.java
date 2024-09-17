package Utility;

public class Normal {
    public double x, y, z;

    public Normal() {}

    public Normal(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = y;
    }

    public Normal(Normal normal) {
        x = normal.x;
        y = normal.y;
        z = normal.z;
    }

    public double dot(Normal normal) {
        return x* normal.x + y * normal.y + z * normal.z;
    }

    // inplace normalisation.
    public void normalisation() {
        double magnitude = Math.sqrt(x*x + y*y + z*z);

        x /= magnitude;
        y /= magnitude;
        z /= magnitude;
    }
}
