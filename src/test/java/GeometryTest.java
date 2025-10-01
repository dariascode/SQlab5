import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometryTest {

    @Test
    void area() {
        Geometry geom = new Geometry ();
        int areaTest = geom.area(3,2);
        assertEquals ( 6 , areaTest ) ;
    }

    @Test
    void perimeter() {
        Geometry geom = new Geometry ();
        int perimeterTest = geom.perimeter(3,2);
        assertEquals ( 10 , perimeterTest ) ;
    }

    @Test
    void isTriangle() {
        Geometry geom = new Geometry ();
        boolean isTriangleTest = geom.isTriangle(3,4, 5);
        assertEquals ( true , isTriangleTest ) ;
    }
}