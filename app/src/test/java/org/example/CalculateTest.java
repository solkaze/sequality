package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum_order() {
    Calculate calculate_1 = new Calculate();
    String expected_1 = "Sum of 2 and 3 is 5. Average is 2.5.";
    assertEquals(expected_1, calculate_1.sum_order(2, 3));

    Calculate calculate_2 = new Calculate();
    String expected_2 = "Sum of 2 and 3 is 5. Average is 2.5.";
    assertEquals(expected_2, calculate_2.sum_order(3, 2));

    Calculate calculate_3 = new Calculate();
    String expected_3 = "Sum of 1 to 10 is 55. Average is 5.5.";
    assertEquals(expected_3, calculate_3.sum_order(1, 10));

    Calculate calculate_4 = new Calculate();
    String expected_4 = "Sum of 1 to 10 is 55. Average is 5.5.";
    assertEquals(expected_4, calculate_4.sum_order(10, 1));

    Calculate calculate_odd = new Calculate();
    String expected_odd = "Sum of odd of 1 to 10 is 30.\nSum of even of 1 to 10 is 30.";
    assertEquals(expected_odd, calculate_odd.sum_order(1, 10, "odd"));

    Calculate calculate_odd2 = new Calculate();
    String expected_odd2 = "Sum of odd of 10 to 1 is 30.\nSum of even of 10 to 1 is 30.";
    assertEquals(expected_odd2, calculate_odd2.sum_order(10, 1, "odd"));

    Calculate calculate_faild = new Calculate();
    String expected_faild = "Argument Error";
    assertEquals(expected_faild, calculate_faild.sum_order(0, 0, "faild"));
  }
}
