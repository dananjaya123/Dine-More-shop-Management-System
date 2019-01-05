package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.OderDTO;
import lk.ijse.dinemore.service.SuperSarvice;

import java.util.List;

public interface OderService extends SuperSarvice {
    public boolean add(OderDTO oderDTO) throws Exception;

    public void delete(int id) throws Exception;

    public void update(OderDTO oderDTO) throws Exception;

    public OderDTO findById(int id) throws Exception;

    public List<OderDTO> getAll() throws Exception;
}
