package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class WeightSort2Test {

  @Test
  public void BasicTests() {
    System.out.println("****** Basic Tests ******");
    assertEquals("2000 103 123 4444 99", WeightSort2.orderWeight("103 123 4444 99 2000"));
    assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort2.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
  }

}
