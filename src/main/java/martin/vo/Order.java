package martin.vo;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private List<OrderItem> itemList;
  private double totalPrice = 0;
  private double actualPrice = 0;
  private double reducePrice = 0;
  private double payPrice = 0;
  private double discount = 0;
  private double taxs = 0;

  public Order() {
    itemList = new ArrayList<OrderItem>();
  }

  public List<OrderItem> getItemList() {
    return itemList;
  }

  public void setItemList(List<OrderItem> itemList) {
    this.itemList = itemList;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public double getActualPrice() {
    return actualPrice;
  }

  public void setActualPrice(double actualPrice) {
    this.actualPrice = actualPrice;
  }

  public double getReducePrice() {
    return reducePrice;
  }

  public void setReducePrice(double reducePrice) {
    this.reducePrice = reducePrice;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public double getTaxs() {
    return taxs;
  }

  public void setTaxs(double taxs) {
    this.taxs = taxs;
  }

  public double getPayPrice() {
    return payPrice;
  }

  public void setPayPrice(double payPrice) {
    this.payPrice = payPrice;
  }
}
