package interstingNumber;

import org.junit.Assert;
import org.junit.Test;

public class CarMileageTest {

  @Test
  public void should_return_0_when_check_interesting_number_given_number_0() {
    long inputNumber = 0;
    long expectedResult = 0;
    long actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }
}
