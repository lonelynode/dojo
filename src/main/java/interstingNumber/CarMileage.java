package interstingNumber;

import java.util.ArrayList;
import java.util.List;

public class CarMileage {

  public static long isInteresting(long number) {
    if(number < 100) {
      return 0;
    }
    else {
      if(digitFollowedByZeros(number))
        return 1;
      else if(digitSequentialAndInc(number))
        return 1;
      return 0;
    }
  }

  private static boolean digitFollowedByZeros(long number) {
    Long[] array = numberToDigitArray(number);
    int multiple = array.length - 1;
    return number % Math.pow(10, multiple) == 0;
  }

  private static boolean digitSequentialAndInc(long number) {
    Long[] array = numberToDigitArray(number);
    boolean isDigitSequentialAndInc = true;
    for(int i = array.length - 1; i > 0; i--) {
      if(array[i - 1] - array[i] == 1) {
        isDigitSequentialAndInc = true;
      }
      else {
        isDigitSequentialAndInc = false;
        break;
      }
    }
    return isDigitSequentialAndInc;
  }

  private static Long[] numberToDigitArray(long number) {
    List<Long> digitList = new ArrayList<Long>();
    long digit = number % 10;
    digitList.add(digit);
    number /= 10;
    while(number > 0) {
      digit = number % 10;
      digitList.add(digit);
      number /= 10;
    }
    Long[] digitArray = digitList.toArray(new Long[0]);
    return digitArray;
  }
}
