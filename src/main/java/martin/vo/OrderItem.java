package martin.vo;

public class OrderItem {
  private Item item;
  private int quantity;
  private double itemPrice;

  public OrderItem() {}

  public OrderItem(Item item, int quantity) {
    this.item = item;
    this.quantity = quantity;
    this.itemPrice = calculateItemPrice();
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(double itemPrice) {
    this.itemPrice = itemPrice;
  }

  private double calculateItemPrice() {
    return this.quantity * this.item.getPrice();
  }

}
