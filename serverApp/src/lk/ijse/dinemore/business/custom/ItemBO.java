package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.ItemDTO;

import java.util.ArrayList;


public interface ItemBO extends SuperBO {

    public boolean add(ItemDTO itemDTO) throws Exception;

    public void delete(int id) throws Exception;

    public void update(ItemDTO itemDTO) throws Exception;

    public ItemDTO findById(int id) throws Exception;

    public ArrayList<ItemDTO> getAll() throws Exception;



}
