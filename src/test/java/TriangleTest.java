import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {
  @Test
  public void Triangle_HasThreeSides_True() {
    Triangle testTriangle = new Triangle(1,2,3);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void Triangle_IsTriangle_True() {
    Triangle testTriangle = new Triangle(1,1,3);
    assertEquals(2, testTriangle.sideTwo);
  }

  @Test
  public void Triangle_isAScalene_True() {
    Triangle testTriangle = new Triangle(1,2,3);
    assertEquals(true, testTriangle.aScalene());
  }

  @Test
  public void Triangle_isAIsosceles_True() {
    Triangle testTriangle = new Triangle(2,3,3);
    assertEquals(true, testTriangle.aIsosceles());
  }

  @Test
  public void Triangle_isAEquilateral_True() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(true, testTriangle.aEquilateral());
  }


}
