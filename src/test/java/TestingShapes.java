import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTests {

    private final IShape sphere = new Sphere(5);

    @Test
    void testSphereCalculateArea() {
        assertEquals(314.159, sphere.calculateArea(), 0.001);
    }

    @Test
    void testSphereCalculateVolume() {
        assertEquals(523.598, sphere.calculateVolume(), 0.001);
    }

    @Test
    void testCubeArea() {
        IShape cube = new Cube(3);
        assertEquals(54, cube.calculateArea(), 0.001);
    }

    @Test
    void testCubeVolume() {
        IShape cube = new Cube(3);
        assertEquals(27, cube.calculateVolume(), 0.001);
    }

    @Test
    void testRectangleArea() {
        IShape rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.calculateArea(), 0.001);
    }

    @Test
    void testRectangleVolume() {
        IShape rectangle = new Rectangle(4, 5);
        assertEquals(0, rectangle.calculateVolume(), 0.001);
    }

    @Test
    void testCylinderArea() {
        IShape cylinder = new Cylinder(2, 4);
        assertEquals(2 * Math.PI * 2 * (2 + 4), cylinder.calculateArea(), 0.001);
    }

    @Test
    void testCylinderVolume() {
        IShape cylinder = new Cylinder(2, 4);
        assertEquals(Math.PI * Math.pow(2, 2) * 4, cylinder.calculateVolume(), 0.001);
    }
}

