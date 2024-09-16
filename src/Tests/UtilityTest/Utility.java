package Tests.UtilityTest;

import  Utility.*;

public class Utility {
    public static void main(String[] args) {
        Vector3D vector = new Vector3D(1, 2, 3);
        System.out.println(vector.dot(new Point3D(1, 2, 3)));
        System.out.println(
                new Point3D(1, 2, 3)
                .dot(new Vector3D(1, 2, 3)));
    }
}
