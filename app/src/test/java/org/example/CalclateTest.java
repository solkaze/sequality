package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalclateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }
}
