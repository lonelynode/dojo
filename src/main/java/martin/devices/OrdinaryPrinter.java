package martin.devices;

import martin.interfaces.Printer;

public class OrdinaryPrinter implements Printer {

  public void print() {
    System.out.println("OrdinaryPrinter printer...");
  }
}
