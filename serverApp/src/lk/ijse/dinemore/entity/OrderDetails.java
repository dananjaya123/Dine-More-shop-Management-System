package lk.ijse.dinemore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class OrderDetails implements Serializable {
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @Id
    private Orders orders;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @Id
    private Item item;
    private String itemName;
    private int Order_Qty;
    private double order_price;

    public OrderDetails() {
    }

    public OrderDetails(Orders orders, Item item, String itemName, int order_Qty, double order_price) {
        this.orders = orders;
        this.item = item;
        this.itemName = itemName;
        Order_Qty = order_Qty;
        this.order_price = order_price;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getOrder_Qty() {
        return Order_Qty;
    }

    public void setOrder_Qty(int order_Qty) {
        Order_Qty = order_Qty;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orders=" + orders +
                ", item=" + item +
                ", itemName='" + itemName + '\'' +
                ", Order_Qty=" + Order_Qty +
                ", order_price=" + order_price +
                '}';
    }
}
