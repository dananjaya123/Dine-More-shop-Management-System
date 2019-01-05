package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.DeliverDTO;


import java.util.ArrayList;

public interface DeliverBO extends SuperBO {
    public boolean addDeliver(DeliverDTO deliverDTO) throws Exception;

    public boolean updateDeliver(DeliverDTO deliverDTO) throws Exception;

    public boolean deleteDeliver(int id) throws Exception;

    public DeliverDTO  findDeliverByID(int ID) throws Exception;

    public ArrayList<DeliverDTO> getAllDeliver() throws Exception;

}
