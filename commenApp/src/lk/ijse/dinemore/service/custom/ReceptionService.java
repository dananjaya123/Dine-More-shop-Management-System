package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.ReceptionDTO;
import lk.ijse.dinemore.service.SuperSarvice;

import java.util.List;

public interface ReceptionService  extends SuperSarvice {
    public boolean add(ReceptionDTO receptionDTO) throws Exception;

    public boolean update(ReceptionDTO receptionDTO) throws Exception;

    public boolean delete(int id) throws Exception;

    public ReceptionDTO findByID(int ID) throws Exception;

    public List<ReceptionDTO> getAll() throws Exception;
}
