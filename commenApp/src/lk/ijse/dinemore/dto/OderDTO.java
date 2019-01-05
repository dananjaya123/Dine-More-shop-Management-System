package lk.ijse.dinemore.dto;

public class OderDTO extends SuperDTO {
    private String orderid;
    private String orderTime;
    private String orderdate;
    private String payment_Status;
    private double price;
    private int qty;
    private String status;
    private String chef_chefID;
    private String deliver_DeliverID;
    private String reception_ReceptionID;
    private String customer_CustomerID;

    public OderDTO() {
    }

    public OderDTO(String orderid, String orderTime, String orderdate, String payment_Status, double price, int qty, String status, String chef_chefID, String deliver_DeliverID, String reception_ReceptionID, String customer_CustomerID) {
        this.orderid = orderid;
        this.orderTime = orderTime;
        this.orderdate = orderdate;
        this.payment_Status = payment_Status;
        this.price = price;
        this.qty = qty;
        this.status = status;
        this.chef_chefID = chef_chefID;
        this.deliver_DeliverID = deliver_DeliverID;
        this.reception_ReceptionID = reception_ReceptionID;
        this.customer_CustomerID = customer_CustomerID;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getPayment_Status() {
        return payment_Status;
    }

    public void setPayment_Status(String payment_Status) {
        this.payment_Status = payment_Status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChef_chefID() {
        return chef_chefID;
    }

    public void setChef_chefID(String chef_chefID) {
        this.chef_chefID = chef_chefID;
    }

    public String getDeliver_DeliverID() {
        return deliver_DeliverID;
    }

    public void setDeliver_DeliverID(String deliver_DeliverID) {
        this.deliver_DeliverID = deliver_DeliverID;
    }

    public String getReception_ReceptionID() {
        return reception_ReceptionID;
    }

    public void setReception_ReceptionID(String reception_ReceptionID) {
        this.reception_ReceptionID = reception_ReceptionID;
    }

    public String getCustomer_CustomerID() {
        return customer_CustomerID;
    }

    public void setCustomer_CustomerID(String customer_CustomerID) {
        this.customer_CustomerID = customer_CustomerID;
    }

    @Override
    public String toString() {
        return "OderDTO{" +
                "orderid='" + orderid + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderdate='" + orderdate + '\'' +
                ", payment_Status='" + payment_Status + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", status='" + status + '\'' +
                ", chef_chefID='" + chef_chefID + '\'' +
                ", deliver_DeliverID='" + deliver_DeliverID + '\'' +
                ", reception_ReceptionID='" + reception_ReceptionID + '\'' +
                ", customer_CustomerID='" + customer_CustomerID + '\'' +
                '}';
    }
}
