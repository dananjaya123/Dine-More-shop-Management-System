package lk.ijse.dinemore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Deliver {
    @Id
    private String DeliverID;
    private String nic;
    private String name;
    private String address;
    private String phoneNo;
    @OneToMany(mappedBy = "deliver" ,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    List<Orders> orders = new ArrayList<>();

    public Deliver() {
    }

    public Deliver(String deliverID, String nic, String name, String address, String phoneNo, List<Orders> orders) {
        DeliverID = deliverID;
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.orders = orders;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public Deliver(String deliverID, String nic, String name, String address, String phoneNo) {
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
        return "Deliver{" +
                "DeliverID='" + DeliverID + '\'' +
                ", nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
