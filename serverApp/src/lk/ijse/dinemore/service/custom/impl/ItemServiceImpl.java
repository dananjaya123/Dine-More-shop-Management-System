package lk.ijse.dinemore.service.custom.impl;

import lk.ijse.dinemore.business.BOFactory;
import lk.ijse.dinemore.business.custom.ItemBO;
import lk.ijse.dinemore.dto.ItemDTO;

import lk.ijse.dinemore.service.custom.ItemService;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ItemServiceImpl extends UnicastRemoteObject implements ItemService {
    public ItemBO itemBO=(ItemBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ITEM);

    public ItemServiceImpl()throws Exception{

    }


    @Override
    public boolean add(ItemDTO itemDTO) throws Exception {
        return itemBO.add(itemDTO);
    }

    @Override
    public void delete(int id) throws Exception {

    }

    @Override
    public void update(ItemDTO itemDTO) throws Exception {

    }

    @Override
    public ItemDTO findById(int id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ItemDTO> getAll() throws Exception {
        return itemBO.getAll();
    }

}
