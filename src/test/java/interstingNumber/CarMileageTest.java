package interstingNumber;

import org.junit.Assert;
import org.junit.Test;

public class CarMileageTest {

  @Test
  public void should_return_0_when_check_interesting_number_given_number_0() {
    int inputNumber = 0;
    int expectedResult = 0;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_1() {
    int inputNumber = 1;
    int expectedResult = 0;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digit_followed_by_all_zeros_100() {
    int inputNumber = 100;
    int expectedResult = 1;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_incement_123() {
    int inputNumber = 123;
    int expectedResult = 1;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_incement_890() {
    int inputNumber = 890;
    int expectedResult = 1;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_incement_321() {
    int inputNumber = 321;
    int expectedResult = 1;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_incement_109() {
    int inputNumber = 109;
    int expectedResult = 1;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_a_palindrome_121() {
    int inputNumber = 121;
    int expectedResult = 1;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_124_not_match_awesomePhrases() {
    int inputNumber = 124;
    int expectedResult = 1;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{124, 245});
    Assert.assertEquals(expectedResult, actualResult);
  }
}
