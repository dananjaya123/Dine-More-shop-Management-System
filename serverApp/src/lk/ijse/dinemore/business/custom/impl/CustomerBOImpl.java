package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.CustomerBO;

import lk.ijse.dinemore.dto.CustomerDTO;
import lk.ijse.dinemore.entity.Customer;
import lk.ijse.dinemore.repository.RepositoryFactory;
import lk.ijse.dinemore.repository.custom.CustomerRepository;
import lk.ijse.dinemore.repository.custom.impl.CustomerRepositoryImpl;
import lk.ijse.dinemore.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;


public class CustomerBOImpl implements CustomerBO {
    private CustomerRepository customerRepository;
    private int id;

    public CustomerBOImpl() {
       customerRepository=new CustomerRepositoryImpl();
               //(CustomerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CUSTOMER);
    }


    @Override
    public boolean add(CustomerDTO customerDTO) throws Exception {
        boolean save=false;
        try (Session session= HibernateUtil.getSessionFactory().openSession()){
            customerRepository.setSession(session);
            session.beginTransaction();

            Customer customer=new Customer(
                    customerDTO.getCustomerID(),
                    customerDTO.getCustomerNIC(),
                    customerDTO.getCustomerName(),
                    customerDTO.getCustomerAddress(),
                    customerDTO.getCustomerPhoneNum()
            );
            save = customerRepository.save(customer);

            session.getTransaction().commit();

        }
        return save;
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
