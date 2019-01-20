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

  @Test
  public void should_return_0_when_check_interesting_number_given_number_1() {
    long inputNumber = 1;
    long expectedResult = 0;
    long actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digit_followed_by_all_zeros_100() {
    long inputNumber = 100;
    long expectedResult = 1;
    long actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_incement_123() {
    long inputNumber = 123;
    long expectedResult = 1;
    long actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }
}
