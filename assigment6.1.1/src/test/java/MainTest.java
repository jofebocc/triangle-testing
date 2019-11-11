import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        Point punto1 = new Point(1, 1);
        Point punto2 = new Point(1, 1);
        Point punto3 = new Point(1, 1);
        Triangle triangle = new Triangle();
        double D1 = punto1.distance(punto2);
        double D2 = punto1.distance(punto3);
        double D3 = punto2.distance(punto3);
        triangle.TriangleAngle(D1,D2,D3);
        triangle.TriangleSides(D1,D2,D3);
        triangle.toString();
        assertEquals("Not a Triangle Right" , triangle.toString());
        assertNotNull(triangle.getArea(D1,D2,D3));
    }

    @Test
    public void main1() {
        Triangle triangle = new Triangle();
        double D1 = 2;
        double D2 = 3;
        double D3 = 3;
        triangle.TriangleAngle(D1,D2,D3);
        triangle.TriangleSides(D1,D2,D3);
        triangle.toString();
        assertEquals("Isosceles Obtuse" , triangle.toString());
    }

    @Test
    public void main2() {
        Point punto1 = new Point(2, 2);
        Point punto2 = new Point(4, 5);
        Point punto3 = new Point(6, 6);
        Triangle triangle = new Triangle();
        double D1 = punto1.distance(punto2);
        double D2 = punto1.distance(punto3);
        double D3 = punto2.distance(punto3);
        triangle.TriangleAngle(D1,D2,D3);
        triangle.TriangleSides(D1,D2,D3);
        triangle.toString();
        assertEquals("Scalene Obtuse" , triangle.toString());

    }

    @Test
    public void main3() {
        Triangle triangle = new Triangle();
        double D1 = 3;
        double D2 = 3;
        double D3 = 3;
        triangle.TriangleAngle(D1,D2,D3);
        triangle.TriangleSides(D1,D2,D3);
        triangle.toString();
        assertEquals("Equilateral Obtuse" , triangle.toString());
    }

    @Test
    public void main4() {
        Triangle triangle = new Triangle();
        double D1 = 10;
        double D2 = 3;
        double D3 = 3;
        triangle.TriangleAngle(D1,D2,D3);
        triangle.TriangleSides(D1,D2,D3);
        triangle.toString();
        assertEquals("Not a Triangle Obtuse" , triangle.toString());
    }

    @Test
    public void main5() throws FileNotFoundException {
        double x2 = 0;
        assertNotNull(x2);
        double y2 = 0;
        assertNotNull(y2);
        double x3 = 0;
        assertNotNull(x3);
        double y3 = 0;
        assertNotNull(y3);
        double x = 0;
        assertNotNull(x);
        double y = 0;
        assertNotNull(y);
        double D1 = 0;
        assertNotNull(D1);
        double D2 = 0;
        assertNotNull(D2);
        double D3= 0 ;
        assertNotNull(D3);
        int flag = 0;
        assertNotNull(flag);
        assertEquals(0 , flag);

    }
}