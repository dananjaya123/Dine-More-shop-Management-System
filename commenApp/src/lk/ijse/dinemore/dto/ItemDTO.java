package lk.ijse.dinemore.dto;

public class ItemDTO extends SuperDTO {
  private   String ItemID;
  private   String item_Name;
  private   String item_Discription;
  private   double item_Price;

    public ItemDTO() {
    }



    public ItemDTO(String itemID, String item_Name, String item_Discription, double item_Price) {
        ItemID = itemID;
        this.item_Name = item_Name;
        this.item_Discription = item_Discription;
        this.item_Price = item_Price;
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

    public double getItem_Price() {
        return item_Price;
    }

    public void setItem_Price(double item_Price) {
        this.item_Price = item_Price;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "ItemID='" + ItemID + '\'' +
                ", item_Name='" + item_Name + '\'' +
                ", item_Discription='" + item_Discription + '\'' +
                ", item_Price=" + item_Price +
                '}';
    }
}
