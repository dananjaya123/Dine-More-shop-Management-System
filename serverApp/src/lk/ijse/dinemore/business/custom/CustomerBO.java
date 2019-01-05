package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.dto.CustomerDTO;

import java.util.List;

public interface CustomerBO extends SuperBO {
    public boolean add(CustomerDTO customerDTO) throws Exception;

    public void delete(int id) throws Exception;

    public void update(CustomerDTO customerDTO) throws Exception;

    public CustomerDTO findById(int id) throws Exception;

    public List<CustomerDTO> getAll() throws Exception;
}
