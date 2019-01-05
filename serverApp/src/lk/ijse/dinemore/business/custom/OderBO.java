package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.OderDTO;

import java.util.List;

public interface OderBO extends SuperBO {
    public boolean add(OderDTO oderDTO) throws Exception;

    public void delete(int id) throws Exception;

    public void update(OderDTO oderDTO) throws Exception;

    public OderDTO findById(int id) throws Exception;

    public List<OderDTO> getAll() throws Exception;
}

