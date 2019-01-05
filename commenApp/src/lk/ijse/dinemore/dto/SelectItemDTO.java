package lk.ijse.dinemore.dto;

public class SelectItemDTO {
    String ItemID;
    String item_Name;
    String item_Discription;
    int Qty;
    double item_Price;

    public SelectItemDTO(String itemID, String item_Name, String item_Discription, int qty, double item_Price) {
        ItemID = itemID;
        this.item_Name = item_Name;
        this.item_Discription = item_Discription;
        Qty = qty;
        this.item_Price = item_Price;
    }

    public SelectItemDTO() {
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public String getItem_Discription() {
        return item_Discription;
    }

    public void setItem_Discription(String item_Discription) {
        this.item_Discription = item_Discription;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public double getItem_Price() {
        return item_Price;
    }

    public void setItem_Price(double item_Price) {
        this.item_Price = item_Price;
    }

    @Override
    public String toString() {
        return "SelectItemDTO{" +
                "ItemID='" + ItemID + '\'' +
                ", item_Name='" + item_Name + '\'' +
                ", item_Discription='" + item_Discription + '\'' +
                ", Qty=" + Qty +
                ", item_Price=" + item_Price +
                '}';
    }
}
