package lk.ijse.dinemore.service.custom;


import lk.ijse.dinemore.dto.DeliverDTO;
import lk.ijse.dinemore.service.SuperSarvice;

import java.util.List;

public interface DeliverService extends SuperSarvice {
     boolean addDeliver(DeliverDTO deliverDTO ) throws Exception;

     boolean updateDeliver( DeliverDTO deliverDTO ) throws Exception;

    boolean deleteDeliver(int id) throws Exception;

    public DeliverDTO  findDeliverByID(int ID) throws Exception;

    public List<DeliverDTO > getAllDeliver() throws Exception;
}
