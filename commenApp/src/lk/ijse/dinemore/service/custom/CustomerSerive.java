package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.dto.CustomerDTO;
import lk.ijse.dinemore.service.SuperSarvice;

import java.util.List;

public interface CustomerSerive extends SuperSarvice {

    public boolean add(CustomerDTO customerDTO) throws Exception;

    public void delete(int id) throws Exception;

    public void update(CustomerDTO customerDTO) throws Exception;

    public CustomerDTO findById(int id) throws Exception;

    public List<CustomerDTO> getAll() throws Exception;

}
