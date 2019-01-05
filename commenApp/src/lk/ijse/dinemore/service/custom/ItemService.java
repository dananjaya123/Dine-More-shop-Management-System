package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.ItemDTO;
import lk.ijse.dinemore.service.SuperSarvice;

import java.util.List;

public interface ItemService extends SuperSarvice {
    public boolean add(ItemDTO itemDTO) throws Exception;

    public void delete(int id) throws Exception;

    public void update(ItemDTO itemDTO) throws Exception;

    public ItemDTO findById(int id) throws Exception;

    public List<ItemDTO> getAll() throws Exception;



}
