package lk.ijse.dinemore.dto;

public class ReceptionDTO extends SuperDTO {
    String ReceptionID;
    String nic;
    String name;
    String address;
    String phoneNo;


    public ReceptionDTO() {
    }

    public ReceptionDTO(String receptionID, String nic, String name, String address, String phoneNo) {
        ReceptionID = receptionID;
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;

    }

    public String getReceptionID() {
        return ReceptionID;
    }

    public void setReceptionID(String receptionID) {
        ReceptionID = receptionID;
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
        return "ReceptionDTO{" +
                "ReceptionID='" + ReceptionID + '\'' +
                ", nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +

                '}';
    }
}
