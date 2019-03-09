package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testArea(){
    Point p1 = new Point(5, 5);
    Point p2 = new Point (5, 5);
    Assert.assertEquals(p1.distance(p2), 0.0);
    Assert.assertEquals(Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)), 0.0);
  }
}
