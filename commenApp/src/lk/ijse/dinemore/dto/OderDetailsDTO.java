package lk.ijse.dinemore.dto;

public class OderDetailsDTO extends SuperDTO {

    private String  orderid;
    private double price;
    private int Qty;
    private String itemCode;

    public OderDetailsDTO() {
    }

    public OderDetailsDTO(String orderid, double price, int qty, String itemCode) {
        this.orderid = orderid;
        this.price = price;
        Qty = qty;
        this.itemCode = itemCode;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "OderDetailsDTO{" +
                "orderid='" + orderid + '\'' +
                ", price=" + price +
                ", Qty=" + Qty +
                ", itemCode='" + itemCode + '\'' +
                '}';
    }
}
