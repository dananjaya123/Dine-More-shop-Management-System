package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.ReceptionDTO;

import java.util.ArrayList;

public interface ReceptionBO extends SuperBO {
    public boolean add(ReceptionDTO receptionDTO) throws Exception;

    public boolean update(ReceptionDTO receptionDTO) throws Exception;

    public boolean delete(int id) throws Exception;

    public ReceptionDTO findByID(int ID) throws Exception;

    public ArrayList<ReceptionDTO> getAll() throws Exception;
}
