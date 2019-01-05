package lk.ijse.dinemore.entity;

import lk.ijse.dinemore.entity.Chef;
import lk.ijse.dinemore.entity.Deliver;
import lk.ijse.dinemore.entity.OrderDetails;
import lk.ijse.dinemore.entity.Reception;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Orders {
    @Id
    private int orderid;
    @Temporal(TemporalType.DATE)
    private Date orderdate;
    @Temporal(TemporalType.TIME)
    private Date orderTime;
    private int qty;
    private double price;
    private String status;
    private String payment_Status;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    private Reception reception;
    @ManyToOne(cascade ={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE} )
    private Deliver deliver;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    private Chef chef;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    private Customer customer;

    @OneToMany(mappedBy = "orders",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    List<OrderDetails> orderDetails = new ArrayList<>();

    public Orders() {
    }

    public Orders(int orderid, Date orderdate, Date orderTime, int qty, double price, String status, String payment_Status, Reception reception, Deliver deliver, Chef chef, Customer customer, List<OrderDetails> orderDetails) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.orderTime = orderTime;
        this.qty = qty;
        this.price = price;
        this.status = status;
        this.payment_Status = payment_Status;
        this.reception = reception;
        this.deliver = deliver;
        this.chef = chef;
        this.customer = customer;
        this.orderDetails = orderDetails;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayment_Status() {
        return payment_Status;
    }

    public void setPayment_Status(String payment_Status) {
        this.payment_Status = payment_Status;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public Deliver getDeliver() {
        return deliver;
    }

    public void setDeliver(Deliver deliver) {
        this.deliver = deliver;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderid=" + orderid +
                ", orderdate=" + orderdate +
                ", orderTime=" + orderTime +
                ", qty=" + qty +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", payment_Status='" + payment_Status + '\'' +
                ", reception=" + reception +
                ", deliver=" + deliver +
                ", chef=" + chef +
                ", customer=" + customer +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
