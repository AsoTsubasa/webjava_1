package jp.co.systena.tigerscave.ShoppingSite.application.model;

public class Order {

  // 商品
  private Item item;

  // 個数
  private int num;

  public Item getItem() {

    return item;
  }

  public int getNum() {

    return num;
  }

  public void setItem(Item item) {

    this.item = item;
  }

  public void setNum(int num) {

    this.num = num;
  }



}
