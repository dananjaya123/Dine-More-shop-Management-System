package lk.ijse.dinemore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
@Id
    private String CustomerID;
    private String CustomerNIC;
    private String CustomerName;
    private String CustomerAddress;
    private String CustomerPhoneNum;
    @OneToMany(mappedBy = "customer" ,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    List<Orders> orders = new ArrayList<>();


    public Customer() {
    }

    public Customer(String customerID, String customerNIC, String customerName, String customerAddress, String customerPhoneNum) {
        CustomerID = customerID;
        CustomerNIC = customerNIC;
        CustomerName = customerName;
        CustomerAddress = customerAddress;
        CustomerPhoneNum = customerPhoneNum;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCustomerNIC() {
        return CustomerNIC;
    }

    public void setCustomerNIC(String customerNIC) {
        CustomerNIC = customerNIC;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public String getCustomerPhoneNum() {
        return CustomerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        CustomerPhoneNum = customerPhoneNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerID='" + CustomerID + '\'' +
                ", CustomerNIC='" + CustomerNIC + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerAddress='" + CustomerAddress + '\'' +
                ", CustomerPhoneNum='" + CustomerPhoneNum + '\'' +
                '}';
    }
}
