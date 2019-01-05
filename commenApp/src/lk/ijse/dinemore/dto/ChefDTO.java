package lk.ijse.dinemore.dto;

public class ChefDTO extends SuperDTO{
    String chefID;
    String nic;
    String name;
    String address;
    String phoneNo;


    public ChefDTO() {
    }

    public ChefDTO(String chefID, String nic, String name, String address, String phoneNo) {
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
        return "ChefDTO{" +
                "chefID='" + chefID + '\'' +
                ", nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
