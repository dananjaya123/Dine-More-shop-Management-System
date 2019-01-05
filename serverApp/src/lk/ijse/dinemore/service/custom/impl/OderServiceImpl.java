package lk.ijse.dinemore.service.custom.impl;

import lk.ijse.dinemore.business.BOFactory;
import lk.ijse.dinemore.business.custom.OderBO;
import lk.ijse.dinemore.dto.OderDTO;
import lk.ijse.dinemore.service.custom.OderService;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class OderServiceImpl extends UnicastRemoteObject implements OderService {
    public OderBO itemBO=(OderBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ODER);

    public OderServiceImpl()throws Exception{

    }

    @Override
    public boolean add(OderDTO oderDTO) throws Exception {
        return false;
    }

    @Override
    public void delete(int id) throws Exception {

    }

    @Override
    public void update(OderDTO oderDTO) throws Exception {

    }

    @Override
    public OderDTO findById(int id) throws Exception {
        return null;
    }

    @Override
    public List<OderDTO> getAll() throws Exception {
        return null;
    }

    private class Exceptio extends Exception {
    }
}
