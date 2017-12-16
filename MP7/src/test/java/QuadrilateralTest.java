// CHECKSTYLE:OFF:FileLength
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class QuadrilateralTest{
    @Test
    public void TrapezoidTest(){
        MyVector side1 = new MyVector(1,0);
        MyVector side2 = new MyVector (2,0);
        MyVector side3 = new MyVector(0,1);
        MyVector side4 = new MyVector (1,-1);
        Quadrilateral quad1 = new Quadrilateral (side1,side2,side3,side4);
        assertEquals("Quadrilateral - trapezoid",quad1.classify());}
    @Test
    public void QuadrilateralTest(){
        MyVector side1 = new MyVector(0,1);
        MyVector side2 = new MyVector (2,0);
        MyVector side3 = new MyVector(1,-4);
        MyVector side4 = new MyVector (1,3);
        Quadrilateral quad2 = new Quadrilateral (side1,side2,side3,side4);
        assertEquals("Quadrilateral",quad2.classify());}
    @Test
    public void ParallelogramTest(){
        MyVector side1 = new MyVector(-1,1);
        MyVector side2 = new MyVector (-2,0);
        MyVector side3 = new MyVector(1,-1);
        MyVector side4 = new MyVector (2,0);
        Quadrilateral quad3 = new Quadrilateral (side1,side2,side3,side4);
        assertEquals("Quadrilateral - parallelogram",quad3.classify());}
    @Test
    public void RhombusTest(){
        MyVector side1 = new MyVector(-3,4);
        MyVector side2 = new MyVector (5,0);
        MyVector side3 = new MyVector(3,-4);
        MyVector side4 = new MyVector (-5,0);
        Quadrilateral quad4 = new Quadrilateral (side1,side2,side3,side4);
        assertEquals("Quadrilateral - parallelogram - rhombus",quad4.classify());}
    @Test
    public void RectangleTest(){
        MyVector side1 = new MyVector(2,0);
        MyVector side2 = new MyVector (0,-1);
        MyVector side3 = new MyVector(-2,0);
        MyVector side4 = new MyVector (0,1);
        Quadrilateral quad5 = new Quadrilateral (side1,side2,side3,side4);
        assertEquals("Quadrilateral - parallelogram - rhombus - rectangle",quad5.classify());}
    @Test
    public void SquareTest(){
        MyVector side1 = new MyVector(1,0);
        MyVector side2 = new MyVector (0,1);
        MyVector side3 = new MyVector(-1,0);
        MyVector side4 = new MyVector (0,-1);
        Quadrilateral quad6 = new Quadrilateral (side1,side2,side3,side4);
        assertEquals("Quadrilateral - parallelogram - rhombus - rectangle - square",quad6.classify());}
    }