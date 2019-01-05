package lk.ijse.dinemore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Chef {
@Id
    private String chefID;
    private String nic;
    private String name;
    private String address;
    private String phoneNo;
    @OneToMany(mappedBy = "chef" ,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    List<Orders> orders = new ArrayList<>();



    public Chef() {
    }

    public Chef(String chefID, String nic, String name, String address, String phoneNo, List<Orders> orders) {
        this.chefID = chefID;
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

    public Chef(String chefID, String nic, String name, String address, String phoneNo) {
        this.chefID = chefID;
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getChefID() {
        return chefID;
    }

    public void setChefID(String chefID) {
        this.chefID = chefID;
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
        return "Chef{" +
                "chefID='" + chefID + '\'' +
                ", nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
