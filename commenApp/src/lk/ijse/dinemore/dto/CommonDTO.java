package lk.ijse.dinemore.dto;

import java.util.ArrayList;

public class CommonDTO extends SuperDTO {
    private CustomerDTO customerDTO;
    private OderDTO oderDTO;
    private OderDetailsDTO oderDetailsDTO;

    public CommonDTO() {
    }

    public CommonDTO(CustomerDTO customerDTO, OderDTO oderDTO, OderDetailsDTO oderDetailsDTO) {
        this.customerDTO = customerDTO;
        this.oderDTO = oderDTO;
        this.oderDetailsDTO = oderDetailsDTO;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public OderDTO getOderDTO() {
        return oderDTO;
    }

    public void setOderDTO(OderDTO oderDTO) {
        this.oderDTO = oderDTO;
    }

    public OderDetailsDTO getOderDetailsDTO() {
        return oderDetailsDTO;
    }

    public void setOderDetailsDTO(OderDetailsDTO oderDetailsDTO) {
        this.oderDetailsDTO = oderDetailsDTO;
    }

    @Override
    public String toString() {
        return "CommonDTO{" +
                "customerDTO=" + customerDTO +
                ", oderDTO=" + oderDTO +
                ", oderDetailsDTO=" + oderDetailsDTO +
                '}';
    }
}
