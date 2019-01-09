package martin.vo;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private List<OrderItem> itemList = new ArrayList<OrderItem>();
  private double totalPrice;

  public void calculateTotalPrice() {
    for(OrderItem item: itemList) {
      totalPrice += item.getItemPrice();
    }
  }


}
