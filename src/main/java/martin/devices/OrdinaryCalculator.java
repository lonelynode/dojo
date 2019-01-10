package martin.devices;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import martin.interfaces.Calculator;
import martin.vo.Order;
import martin.vo.OrderItem;

public class OrdinaryCalculator implements Calculator {

  private Order order;
  private String stateCode;

  public OrdinaryCalculator(String stateCode) {
    this.stateCode = stateCode;
  }

  public Order calculateOrder(Order order) {
    this.order = order;
    calculateTotalPrice();
    calculateActualPrice();
    calculateTaxes(stateCode);
    calculatePayPrice();
    return this.order;
  }

  public void calculateTotalPrice() {
    List<OrderItem> orderItemList = this.order.getItemList();
    double totalPrice = 0;
    for (OrderItem item : orderItemList) {
      totalPrice += item.getItemPrice();
    }
    this.order.setTotalPrice(totalPrice);
  }

  public void calculateActualPrice() {
    calculateDiscount();
    double actualPrice = this.order.getDiscount() * this.order.getTotalPrice();
    this.order.setActualPrice(actualPrice);
  }

  public void calculateDiscount() {
    Iterator entries = CashRegister.disCountInfo.entrySet().iterator();
    double discount = 1;
    while (entries.hasNext()) {
      Map.Entry entry = (Map.Entry) entries.next();
      Integer discountArea = (Integer) entry.getKey();
      Double areaDiscount = (Double) entry.getValue();
      if (this.order.getTotalPrice() >= discountArea) {
        discount = areaDiscount;
      }
    }
    this.order.setDiscount(discount);
  }

  public void calculateTaxes(String stateCode) {
    double taxRate = CashRegister.stateTax.get(stateCode);
    double taxes = this.order.getActualPrice() * taxRate;
    this.order.setTaxs(taxes);
  }

  public void calculatePayPrice() {
    double payPrice = this.order.getActualPrice() + this.order.getTaxs();
    this.order.setPayPrice(payPrice);
  }



}
