package lk.ijse.dinemore.dto;

public class CustomerDTO extends SuperDTO {
    private String CustomerID;
    private String CustomerNIC;
    private String CustomerName;
    private String CustomerAddress;
    private String CustomerPhoneNum;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerID, String customerNIC, String customerName, String customerAddress, String customerPhoneNum) {
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
        return "CustomerDTO{" +
                "CustomerID='" + CustomerID + '\'' +
                ", CustomerNIC='" + CustomerNIC + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerAddress='" + CustomerAddress + '\'' +
                ", CustomerPhoneNum='" + CustomerPhoneNum + '\'' +
                '}';
    }
}
