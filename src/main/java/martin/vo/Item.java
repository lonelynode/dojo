package martin.vo;

public class Item {
  private String itemLabel;
  private double price;

  public Item(){}
  public Item(String itemLabel, double price) {
    this.itemLabel = itemLabel;
    this.price = price;
  }

  public String getItemLabel() {
    return itemLabel;
  }

  public void setItemLabel(String itemLabel) {
    this.itemLabel = itemLabel;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
