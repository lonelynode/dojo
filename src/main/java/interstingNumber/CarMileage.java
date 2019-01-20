package interstingNumber;

import java.util.ArrayList;
import java.util.List;

public class CarMileage {

  public static int isInteresting(int number) {
    if(number < 100) {
      return 0;
    }
    else {
      if(digitFollowedByZeros(number))
        return 1;
      else if(digitSequentialAndInc(number))
        return 1;
      else if(digitSequentialAndDesc(number))
        return 1;
      else if(digitIsPalindrome(number))
        return 1;
      return 0;
    }
  }

  private static boolean digitIsPalindrome(int number) {
    return true;
  }

  private static boolean digitSequentialAndDesc(int number) {
    Integer[] array = numberToDigitArray(number);
    boolean isDigitSequentialAndDesc = true;
    for(int i = array.length - 1; i > 0; i--) {
      if(array[i] == 0) {
        array[i] = 10;
      }
      if ((array[i] - array[i - 1]) % 10 != 1) {
        isDigitSequentialAndDesc = false;
        break;
      }
    }
    return isDigitSequentialAndDesc;
  }

  private static boolean digitFollowedByZeros(int number) {
    Integer[] array = numberToDigitArray(number);
    int multiple = array.length - 1;
    return number % Math.pow(10, multiple) == 0;
  }

  private static boolean digitSequentialAndInc(int number) {
    Integer[] array = numberToDigitArray(number);
    boolean isDigitSequentialAndInc = true;
    for(int i = array.length - 1; i > 0; i--) {
      if(array[i] == 0) {
        array[i] = 10;
      }
      if(array[i - 1] == 0) {
        array[i - 1] = 10;
      }
      if((array[i - 1] - array[i]) % 10 != 1) {
        isDigitSequentialAndInc = false;
        break;
      }
    }
    return isDigitSequentialAndInc;
  }

  private static Integer[] numberToDigitArray(int number) {
    List<Integer> digitList = new ArrayList<Integer>();
    int digit = number % 10;
    digitList.add(digit);
    number /= 10;
    while(number > 0) {
      digit = number % 10;
      digitList.add(digit);
      number /= 10;
    }
    return digitList.toArray(new Integer[0]);
  }
}
