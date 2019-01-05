package lk.ijse.dinemore.service.custom.impl;

import lk.ijse.dinemore.business.BOFactory;
import lk.ijse.dinemore.business.custom.CustomerBO;
import lk.ijse.dinemore.business.custom.impl.CustomerBOImpl;
import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.dto.CustomerDTO;
import lk.ijse.dinemore.service.custom.CustomerSerive;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerSerive {

    private CustomerBO customerBO;
            //(CustomerBO)BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);

    public CustomerServiceImpl() throws Exception {
        customerBO = new CustomerBOImpl();
                //(CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);
    }


    @Override
    public boolean add(CustomerDTO customerDTO) throws Exception {
        return customerBO.add(customerDTO);
    }

    @Override
    public void delete(int id) throws Exception {

    }

    @Override
    public void update(CustomerDTO customerDTO) throws Exception {

    }

    @Override
    public CustomerDTO findById(int id) throws Exception {
        return null;
    }

    @Override
    public List<CustomerDTO> getAll() throws Exception {
        return null;
    }
}
