package martin.devices;

import martin.vo.Item;
import martin.vo.Order;
import martin.vo.OrderItem;
import org.junit.Assert;
import org.junit.Test;

public class CashRegisterTest {

  @Test
  public void should_return_true_order_result_when_calculate_order_given_one_pen_price_1_quantity_1_state_UT() {
    Item item = new Item("pen", 1);
    OrderItem orderItem = new OrderItem(item, 1);
    CashRegister cr = new CashRegister();
    cr.addItem(orderItem);
    cr.calculateOrder();
    Order order = cr.getOrder();
    System.out.println(order.getPayPrice());
    Assert.assertNotNull(order);
  }
  @Test
  public void should_return_true_order_result_when_calculate_order_given_one_pen_price_3000_quantity_1_state_UT() {
    Item item = new Item("pen", 3000);
    OrderItem orderItem = new OrderItem(item, 1);
    CashRegister cr = new CashRegister();
    cr.addItem(orderItem);
    cr.calculateOrder();
    Order order = cr.getOrder();
    System.out.println(order.getPayPrice());
    Assert.assertNotNull(order);
  }

}
