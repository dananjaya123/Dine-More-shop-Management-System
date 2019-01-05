package lk.ijse.dinemore.dto;

public class DeliverDTO extends SuperDTO {
    String DeliverID;
    String nic;
    String name;
    String address;
    String phoneNo;


    public DeliverDTO() {
    }

    public DeliverDTO(String deliverID, String nic, String name, String address, String phoneNo) {
        DeliverID = deliverID;
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;

    }

    public String getDeliverID() {
        return DeliverID;
    }

    public void setDeliverID(String deliverID) {
        DeliverID = deliverID;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }




    @Override
    public String toString() {
        return "DeliverDTO{" +
                "DeliverID='" + DeliverID + '\'' +
                ", nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +

                '}';
    }
}
