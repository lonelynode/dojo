package interstingNumber;

public class CarMileage {

  public static long isInteresting(long number) {
    if(number < 100) {
      return 0;
    }
    else {
      if(number % 10 == 0)
        return 1;
      return 1;
    }
  }
}
