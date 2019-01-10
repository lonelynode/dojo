package martin.devices;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import martin.interfaces.Calculator;
import martin.interfaces.Printer;
import martin.vo.Order;
import martin.vo.OrderItem;

public class CashRegister {
  private Order order;
  private Printer printer;
  private Calculator calculator;
  public static Map<String, Double> stateTax = new HashMap<String, Double>();
  public static Map<Integer, Double> disCountInfo = new TreeMap<Integer, Double>();

  static {
    stateTax.put("UT", 0.08);
    disCountInfo.put(3000, 0.9);
    disCountInfo.put(5000, 0.7);
    disCountInfo.put(10000, 0.5);
    disCountInfo.put(25000, 0.3);
    disCountInfo.put(50000, 0.1);
  }

  public CashRegister() {
    order = new Order();
    printer = new OrdinaryPrinter();
    calculator = new OrdinaryCalculator("UT");
  }

  public void calculateOrder() {
    calculator.calculateOrder(order);
  }

  public void printOrder() {
    printer.print();
  }

  public void addItem(OrderItem item) {
    this.order.getItemList().add(item);
  }

  public OrderItem remove (String itemLabel) {
    for(OrderItem item: this.order.getItemList()) {
      if(item.getItem().getItemLabel().equals(itemLabel)) {
        this.order.getItemList().remove(item);
        return item;
      }
    }
    return null;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Printer getPrinter() {
    return printer;
  }

  public void setPrinter(Printer printer) {
    this.printer = printer;
  }

  public Calculator getCalculator() {
    return calculator;
  }

  public void setCalculator(Calculator calculator) {
    this.calculator = calculator;
  }
}
